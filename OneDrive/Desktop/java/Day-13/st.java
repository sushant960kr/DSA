
public class st {
    public static void main(String[] args) {
        //  create 5 names
        String[] names=new String[5];
        

        //  creates 5 student list
        student sushant=
        new student(10,"sushant",87.3);
       
        System.out.println(sushant.rNo);
        System.out.println(sushant.name);
        System.out.println(sushant.marks);
    }
}
//  for every single student
class student{
    int rNo;
    String name;
    float marks;
}
