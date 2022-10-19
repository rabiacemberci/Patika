public class Teacher {
    String mpno;
    String branch;
    String name;

    public Teacher(String mpno, String branch, String name) {
        this.mpno = mpno;
        this.branch = branch;
        this.name = name;
    }
    void print(){
        System.out.println("Adı: " + this.name);
        System.out.println("Telefonu: " + this.mpno);
        System.out.println("Bölümü: " + this.branch);
    }
}
