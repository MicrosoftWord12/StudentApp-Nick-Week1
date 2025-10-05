class Undergraduate(id: String, name: String, course: String): Student(id, name, course) {

    override fun getGrade(): String {
        return when {
            this.mark > 70 -> "First"
            this.mark in 60 .. 69 -> "2/1"
            this.mark in 50 .. 59 -> "2/2"
            this.mark in 40 .. 49 -> "Third"
            else -> "Fail"
        }
    }
}