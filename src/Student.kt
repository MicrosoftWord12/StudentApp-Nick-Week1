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
//class Student(id: String, name: String, course: String, mark: Double) {
//    var id: String = id
//    var name: String = name
//    var course: String = course
//    var mark: Double = mark
//
//    init {
//        this.id = id
//        this.name = name
//        this.course = course
//        this.mark = mark
//    }
//
//    override fun toString(): String {
//        return "Student(id='${this.id}', name='${this.name}', course='${this.course}', mark=${this.mark})"
//    }
//}

//Dataclass
data class Student(val id: String, var name: String, var course: String, var mark: Double) {
    override fun toString(): String {
        return "Student(id='${this.id}', name='${this.name}', course='${this.course}', mark=${this.mark})"
    }
}