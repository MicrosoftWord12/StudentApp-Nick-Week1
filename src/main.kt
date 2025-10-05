fun main() {
//    var name: String = ""
//    var course: String = ""
//    var mark: Double = 0.0
//
//    val students: MutableList<Student> = mutableListOf()
//
//    while(true) {
//        println("What is your name?")
//        name = readln()
//
//        if(name == "quit") {
//            break
//        }
//
//        println("What is your course?")
//        course = readln()
//
//        println("What is your mark?")
//        mark = readln().toDouble()
//
//        val newStudent = Student("1", name, course, mark)
//
//        students.add(newStudent)
//
//        println(newStudent)
//    }

    val student = Undergraduate("1", "Nick", "Programming")

    student.mark = 90


    val masters = Masters("2", "John", "Mathematics")
    masters.mark = 2

    println(student.getGrade())
    println(masters.getGrade())
}