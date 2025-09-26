class Student(var idIn: String, var nameIn: String, var courseIn: String, var markIn: Double) {

    val id: String
    val name: String
    val course: String
    val mark: Double

    init {
        this.id = idIn
        this.name = nameIn
        this.course = courseIn
        this.mark = markIn
    }

    override fun toString(): String {
        return "Student(name='${this.name}', course='${this.course}' mark='${this.mark}')"
    }

}