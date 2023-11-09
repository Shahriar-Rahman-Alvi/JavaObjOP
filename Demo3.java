//OBJECT as FIELD VARIABLE
class Student{
    String name;
    String address;
    Student (String n , String a){
        name = n;
        address = a;
    }
    void print(){
        System.out.println(name + " " + address);
    }
}

class Lab{
    Student S;
    String labName;
    void printInfo(){
        S.print();
        System.out.println(labName);
    }
}
public class Demo3 {
    public static void main(String[] args){
        Student st = new Student("Asif" , "Banani");
        Lab l = new Lab();
        l . labName = "CSE110";
        l . S = st;
        l . printInfo();
    }
}