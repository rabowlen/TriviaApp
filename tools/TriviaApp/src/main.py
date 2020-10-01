import click
import questions_api


@click.command()
@click.option('--get-questions', 'questions', flag_value='get', help='Retrieves all trivia questions.')
def run(questions):
    if questions == 'get':
        questions_api.get_all_questions()


questions_api.get_all_questions()
if __name__ == 'main':
    run()
