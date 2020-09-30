import React, {Component} from 'react'

class Question extends Component {

    render() {
        const {stem, answerList} = this.props;
        return (
            <div className="container text-center">
                <div>
                    <h3>{stem}</h3>
                </div>
                <div className="mt-2 mb-2">
                    <ul className="text-left">
                        {answerList[0].length > 1 ? <li>{answerList[0][0]}</li> : null}
                        {answerList[0].length >= 2 ? <li>{answerList[0][1]}</li> : null}
                        {answerList[0].length >= 3 ? <li>{answerList[0][2]}</li> : null}
                        {answerList[0].length >= 4 ? <li>{answerList[0][3]}</li> : null}
                    </ul>
                </div>
            </div>
        )
    }
}

export default Question