import React, {Component} from 'react'
import Question from "./Question";

class Card extends Component {

    render() {

        const {question} = this.props;
        if(question) {
            return (
                <div className="container">
                    <div className="card">
                        <div className="card-body">
                            <Question stem={question.stem} answerList={question["answerList"]}/>
                        </div>
                    </div>
                </div>
            )
        } else return null;
    }
}

export default Card