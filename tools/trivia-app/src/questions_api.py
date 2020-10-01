import requests
from yaml import load, dump

try:
    from yaml import CLoader as Loader, CDumper as Dumper
except ImportError:
    from yaml import Loader, Dumper


def get_all_questions():
    with open('config.yml', 'r') as config:
        web_cfg = load(config, Loader=Loader)['web']
        host = web_cfg['host']
        port = web_cfg['port']

        questions = requests.get('http://{}:{}/questions'.format(host, port)).json()

        for question in questions:
            print('\n')
            print(question['text'])
            for answer in question['answerChoiceList']:
                print('- {}'.format(answer['text']))