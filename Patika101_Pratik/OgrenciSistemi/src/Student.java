public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;
    double averageVerbal;
    boolean isPassVerbal;

    public Student(Course c1, Course c2, Course c3, String name, String stuNo, String classes) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.average = 0;
        this.averageVerbal=0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int note2, int note3){
        if (note1>=0 && note1<=100){
            this.c1.note = note1;
        }
        if (note2>=0 && note2<=100){
            this.c2.note = note2;
        }
        if (note3>=0 && note3<=100){
            this.c3.note = note3;
        }
    }
    void addBulkVerbalNote(int verbalNote1, int verbalNote2,int verbalNote3){
        if (verbalNote1>=0 && verbalNote1<=100){
            this.c1.verbalNote = verbalNote1;
        }
        if (verbalNote2>=0 && verbalNote2<=100){
            this.c2.verbalNote = verbalNote2;
        }
        if (verbalNote3>=0 && verbalNote3<=100){
            this.c3.verbalNote = verbalNote3;
        }
    }
    void isPassCourse(){
        this.averageVerbal  = (this.c1.note*0.80)+(this.c1.verbalNote*0.20);
        if (this.averageVerbal>55){
            System.out.println(this.c1.name + " Dersini geçtiniz: " + this.averageVerbal);
        }else{
            System.out.println(this.c1.name + " Dersinden kaldınız!!");
        }

        this.averageVerbal  = (this.c2.note*0.80)+(this.c2.verbalNote*0.20);
        if (this.averageVerbal>55){
            System.out.println(this.c2.name + " Dersini geçtiniz: " + this.averageVerbal);
        }else{
            System.out.println(this.c2.name + " Dersinden kaldınız!!");
        }

        this.averageVerbal  = (this.c3.note*0.80)+(this.c3.verbalNote*0.20);
        if (this.averageVerbal>55){
            System.out.println(this.c3.name + " Dersini geçtiniz: " + this.averageVerbal);
        }else{
            System.out.println(this.c3.name + " Dersinden kaldınız!!");

        }
    }
    void isPass(){
        this.average = ((this.c1.note*0.80)+(this.c1.verbalNote*0.20)+
                (this.c2.note*0.80)+(this.c2.verbalNote*0.20)+
                (this.c3.note*0.80)+(this.c3.verbalNote*0.20))/3;

        if (this.average>55){
            System.out.println("Sınıfı geçtiniz: " + average);
            this.isPass = true;
        }else{
            System.out.println("Sınıfta kaldınız!!" + average);
            this.isPass= false;
        }
    }
    void printNote(){
       /* System.out.println(this.c1.name + " Notu:" + this.c1.note);
        System.out.println(this.c2.name + " Notu:" + this.c2.note);
        System.out.println(this.c3.name + " Notu:" + this.c3.note);
        System.out.println(this.c1.name + " Ortalaması: " + this.c1.verbalNote);
        System.out.println(this.c2.name + " Ortalaması: " + this.c2.verbalNote);
        System.out.println(this.c3.name + " Ortalaması: " + this.c3.verbalNote);*/
    }
}
