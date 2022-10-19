public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int verbalNote;
    int note;

    public Course(Teacher teacher, String name, String code, String prefix) {
        this.teacher = teacher;
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note=0;
        int verbalNote=0;
    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher;

        }else{
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor.");
        }
        this.teacher = teacher;
    }
    void printTeacher(){
        this.teacher.print();
    }

}
