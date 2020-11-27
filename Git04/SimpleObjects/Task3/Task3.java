package Git04.SimpleObjects.Task3;

public class Task3 {
    public static class Student{
        private String lastName = "unknown";
        private String fio = "unknow";
        private int numGroup = -1;
        private int[] points = {-1,-1,-1,-1,-1};

        public Student(String lastName, String fio, int numGroup, int[] points) {
            this.lastName = lastName;
            this.fio = fio;
            this.numGroup = numGroup;
            this.points = points;
        }

        public Student() {

        }

        public static boolean isGood(Student student){
            for (int i = 0; i < student.points.length; i++) {
                if(student.points[i] < 9)
                    return false;
            }
            return true;
        }
        public static void showGoodStudent(Student[] students) {
            for (int i = 0; i < students.length; i++) {
                if(isGood(students[i]))
                    System.out.println(students[i]);
            }
        }

        @Override
        public String toString() {
            return String.format("Фамилия студента %s\nФИО студента %s\nНомер группы %d",lastName,fio,numGroup);
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];
        for (int i = 0; i < 9; i++) {
            students[i]=new Student();
        }
        students[9]=new Student("Boichencovski", "BAD",50,new int[]{9,9,9,9,9});
        Student.showGoodStudent(students);


    }
}
