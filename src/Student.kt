// Concise Version

//class Student(val id: String, var name: String, var course: String, var mark: Double) {
//
//    override fun toString(): String {
//        return "Student(name='${this.name}', course='${this.course}' mark='${this.mark}')"
//    }
//
//}

// Init Block Version
//
class Student(id: String, name: String, course: String) {
    var id: String = id
    var name: String = name
    var course: String = course
    var mark: Int = 0
        set(value) {
            field = if(value in 1..100) value else return
        }

    init {
        this.id = id
        this.name = name
        this.course = course
        this.mark = mark
    }

    fun getGrade(): String {
        return when {
            this.mark > 70 -> "First"
            this.mark in 60 .. 69 -> "2/1"
            this.mark in 50 .. 59 -> "2/2"
            this.mark in 40 .. 49 -> "Third"
            else -> "Fail"
        }
    }

    fun didPass(): Boolean {
        return this.mark >= 40
    }

    override fun toString(): String {
        return "Student(id='${this.id}', name='${this.name}', course='${this.course}', mark=${this.mark})"
    }
}

//Dataclass
//data class Student(val id: String, var name: String, var course: String, var mark: Double) {
//    override fun toString(): String {
//        return "Student(id='${this.id}', name='${this.name}', course='${this.course}', mark=${this.mark})"
//    }
//}