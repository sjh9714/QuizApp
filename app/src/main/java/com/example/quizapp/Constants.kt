package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "나라 이름을 맞춰보세요.",
            R.drawable.ic_flag_of_argentina,
            "아르헨티나", "오스트레일리아",
            "아르메니아", "오스트리아", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "나라 이름을 맞춰보세요.",
            R.drawable.ic_flag_of_australia,
            "앙골라", "오스트리아",
            "오스트레일리아", "아르메니아", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "나라 이름을 맞춰보세요.",
            R.drawable.ic_flag_of_brazil,
            "벨로루시", "벨리즈",
            "브루나이", "브라질", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "나라 이름을 맞춰보세요.",
            R.drawable.ic_flag_of_belgium,
            "바하마", "벨기에",
            "바베이도스", "벨리즈", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "나라 이름을 맞춰보세요.",
            R.drawable.ic_flag_of_fiji,
            "가봉", "프랑스",
            "피지", "핀란드", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "나라 이름을 맞춰보세요.",
            R.drawable.ic_flag_of_germany,
            "독일", "조지아",
            "그리스", "없음", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "나라 이름을 맞춰보세요.",
            R.drawable.ic_flag_of_denmark,
            "도미니카 연방", "이집트",
            "덴마크", "에티오피아", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "나라 이름을 맞춰보세요.",
            R.drawable.ic_flag_of_india,
            "아일랜드", "이란",
            "헝가리", "인도", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "나라 이름을 맞춰보세요.",
            R.drawable.ic_flag_of_new_zealand,
            "오스트레일리아", "뉴질랜드",
            "투발루", "미국", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "나라 이름을 맞춰보세요.",
            R.drawable.ic_flag_of_kuwait,
            "쿠웨이트", "요르단",
            "수단", "팔레스타인", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}