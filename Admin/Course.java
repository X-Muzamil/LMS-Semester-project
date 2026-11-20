//LMS Course Entity
class Course{
    int cid;
    String name;
    int teacherid;

    Course(int cid, String name, int teacherid){
        this.cid = cid;
        this.name = name;
        this.teacherid = teacherid;
    }

    void display(){
        System.out.println("Course ID : " + cid +
                            "\n Curse name : " + name +
                            "\n Teacher id  : " + teacherid);
    }

}
