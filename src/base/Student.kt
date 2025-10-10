package base

// Init Block Version
//
abstract class Student(id: String, name: String, course: String) {
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

    abstract fun getGrade(): String

    fun didPass(): Boolean {
        return this.mark >= 40
    }

    override fun toString(): String {
        return "Student(id='${this.id}', name='${this.name}', course='${this.course}', mark=${this.mark}, grade=${this.getGrade()})"
    }
}