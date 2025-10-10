fun main() {
    // Do Stuff

    val uniHandler = University()

    // Dummy Data
    val student1 = Undergraduate("1", "name", "course")
    val student2 = Undergraduate("2", "name", "course")
    val student3 = Masters("3", "name", "course")

    uniHandler.enrolStudent(student1)
    uniHandler.enrolStudent(student2)
    uniHandler.enrolStudent(student3)


    while (true) {
        println("1. Add a Student")
        println("2. Search for a Student by Id")
        println("3. Search for a Student by Name")
        println("4. Quit")

        val userInput = readln().toInt()

        val optionReturnValue = when (userInput) {
            1 -> {
                println("Input a base.Student Id")
                val studentId = readln()

                println("Input a base.Student Name")
                val studentName = readln()

                println("Input a Student Course")
                val course = readln()

                println("Input a Student Level")
                val level = readln()

                if (level == "Undergraduate") {
                    uniHandler.enrolStudent(Undergraduate(studentId, studentName, course))
                }else{
                    uniHandler.enrolStudent(Masters(studentId, studentName, course))
                }

            }

            2 -> {
                println("Input a base.Student Id")
                val studentId = readln()

                uniHandler.findStudentById(studentId)
            }

            3 -> {
                println("Input a base.Student Name")
                val studentName = readln()

                val students = uniHandler.findStudentsByName(studentName)
                for(s in students) {
                    println(s.getGrade())
                }
            }

            4 -> {
                break
            }

            else -> {
                println("Please Enter a Valid Option!!")
                null
            }
        }

        println(optionReturnValue)
    }





}