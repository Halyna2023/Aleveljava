package ua.olifirenko.hw8;
//1. HW8 Task1
//        Создайте пример наследования, реализуйте класс Student и класс Aspirant,
//        аспирант отличается от студента наличием некой научной работы.
//        а) Класс Student содержит переменные: String firstName, lastName,
//        group. А также, double averageMark, содержащую среднюю оценку.
//        б) Создать метод getScholarship() для класса Student, который
//        возвращает сумму стипендии. Если средняя оценка студента равна 5, то
//        сумма 100 грн, иначе 80.
//        в) Переопределить этот метод в классе Aspirant. Если средняя оценка
//        аспиранта равна 5, то сумма 200 грн, иначе 180.
//        г) Создать массив типа Student, содержащий объекты класса Student и
//        Aspirant. Вызвать метод getScholarship() для каждого элемента массива.

    class Student {
        protected String firstName;
        protected String lastName;
        protected String group;
        protected double averageMark;

        public Student(String firstName, String lastName, String group, double averageMark) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.group = group;
            this.averageMark = averageMark;
        }

        public int getScholarship() {
            return (averageMark == 5) ? 100 : 80;
        }
    }

    class Aspirant extends Student {
        private String researchTopic;

        public Aspirant(String firstName, String lastName, String group, double averageMark, String researchTopic) {
            super(firstName, lastName, group, averageMark);
            this.researchTopic = researchTopic;
        }

        @Override
        public int getScholarship() {
            return (averageMark == 5) ? 200 : 180;
        }
    }

  class ScholarshipExample {
        public static void main(String[] args) {
            Student student = new Student("John", "Doe", "GroupA", 4.5);
            Aspirant aspirant = new Aspirant("Jane", "Smith", "GroupB", 5, "Research Topic");

            Student[] students = {student, aspirant};

            for (Student s : students) {
                System.out.println("Student: " + s.firstName + " " + s.lastName +
                        ", Scholarship: " + s.getScholarship() + " грн");
            }
        }
    }


