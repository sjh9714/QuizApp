package com.example.quizapp

data class Question(
    val id: Int,
    val question: String,
    val image: Int,
    val option_1: String,
    val option_2: String,
    val option_3: String,
    val option_4: String,
    val correctAnswer: Int
)