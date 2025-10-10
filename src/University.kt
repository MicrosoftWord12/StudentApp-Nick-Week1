import base.Student

class University() {
    private var students = mutableListOf<Student>()

    fun enrolStudent(student: Student) {
        students.add(student)
    }

    fun findStudentById(studentId: String): Student? {
        for (studentInList in students) {
            if (studentInList.id == studentId) {
                return studentInList
            }
        }
        return null
    }

    fun findStudentsByName(name: String): MutableList<Student> {
        val foundStudents = mutableListOf<Student>()

        for(studentInList in students) {
            if(studentInList.name == name) {
                foundStudents.add(studentInList)
            }
        }

        return foundStudents
    }


}