fun main() {
    var name: String = ""
    var course: String = ""
    var mark: Double = 0.0

    val students: MutableList<Student> = mutableListOf()

    while(true) {
        println("What is your name?")
        name = readln()

        if(name == "quit") {
            break
        }

        println("What is your course?")
        course = readln()

        println("What is your mark?")
        mark = readln().toDouble()

        val newStudent = Student("1", name, course, mark)

        students.add(newStudent)

        println(newStudent)
    }
}