package com.maxwell.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val questionList = Constants.getQuestions()

        val currentPosition = 1
        val question: Question = questionList[currentPosition - 1]

        val pb = findViewById<ProgressBar>(R.id.pb)
        pb.progress = currentPosition

        val tvProgress = findViewById<TextView>(R.id.tvProgress)
        tvProgress.text = "$currentPosition/${pb.max}"

        val tvQuestion = findViewById<TextView>(R.id.tvQuestion)
        tvQuestion.text = question.text

        val ivFlag = findViewById<ImageView>(R.id.ivFlag)
        ivFlag.setImageResource(question.image)

        val tvOptionOne = findViewById<TextView>(R.id.tvOptionOne)
        tvOptionOne.text = question.optionOne

        val tvOptionTwo = findViewById<TextView>(R.id.tvOptionTwo)
        tvOptionTwo.text = question.optionTwo

        val tvOptionThree = findViewById<TextView>(R.id.tvOptionThree)
        tvOptionThree.text = question.optionThree

        val tvOptionFour = findViewById<TextView>(R.id.tvOptionFour)
        tvOptionFour.text = question.optionFour
    }
}