public class Main {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("555","TRH","Mahmut Hoca");
        Teacher t2 = new Teacher("000","FZK","GRAHAM BELL");
        Teacher t3 = new Teacher("111","BIO","Külyutmaz");

        Course tarih = new Course(t1,"Tarih","101","TRH");
	    tarih.addTeacher(t1);
        Course fizik= new Course(t1,"Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course(t1,"Biyoloji","103","BIO");
        biyo.addTeacher(t3);

	    Student s1= new Student(tarih,fizik,biyo,"İnek Şaban","123","4");
        s1.addBulkExamNote(100,90,70);
        s1.addBulkVerbalNote(70,20,40);
        s1.isPassCourse();
        s1.isPass();


    }

}
