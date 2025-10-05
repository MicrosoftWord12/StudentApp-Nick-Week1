class Masters(id: String, name: String, course: String): Student(id, name, course) {

    override fun getGrade(): String {
        return when {
            this.mark > 70 -> "Distinction"
            this.mark in 60 .. 69 -> "Merit"
            this.mark in 40 .. 59 -> "Pass"
            this.mark in 0 .. 30 -> "Fail"
            else -> "Invalid Mark"
        }
    }

}