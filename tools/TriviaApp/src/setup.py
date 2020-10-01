from setuptools import setup

setup(
    name='trivia-app',
    version='0.1',
    py_modules=['main'],
    install_requires=[
        'Click',
    ],
    entry_points='''
        [console_scripts]
        trivia=main:run
    ''',
)
