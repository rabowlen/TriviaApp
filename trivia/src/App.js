import React, {Component} from 'react'
import Card from "./components/Card";

class App extends Component {
    state = {
        isLoading: true,
        questions: []
    };

    async componentDidMount() {
        const response = await fetch('/questions');
        const body = await response.json();
        const questionItems = []
        body.map(question => questionItems.push({
            stem: question.text,
            answerList: [question["answerChoiceList"].map(choice => choice.text)]
        }))
        this.setState({questions: questionItems, isLoading: false})
        console.log(questionItems)
    }

    render() {

        const {questions, isLoading} = this.state;

        if (isLoading) {
            return <p>Loading...</p>;
        }

        return (
            <div className="container">
                <div className="row justify-content-center">
                    <h1 className="mt-5 mb-5">Trivia App</h1>
                </div>
                {questions.length <= 0 && <p>There are no questions currently.</p>}
                <div className="row">
                    <div className="col-4 text-center">
                        {questions.length > 0 ? <Card question={questions[0]}/> : null}
                    </div>
                    <div className="col-4 text-center">
                        {questions.length >= 1 ? <Card question={questions[1]}/> : null}
                    </div>
                    <div className="col-4 text-center">
                        {questions.length >= 2 ? <Card question={questions[2]}/> : null}
                    </div>
                </div>

            </div>
        )
    }
}

export default App
