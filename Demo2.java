//Object as Parameter
class Test{
    int a ; //Field variable
    void print(){
        System.out.println(a);
    }
}
class Test2{
    int b; //Field variable
    void add(Test t){
        //Test t = sending an object as parameter
        b = b+ t.a;
        System.out.println(b);
        t.print();
    }
}
public class Demo2{
    public static void main(String[] args){
        Test t1 = new Test();
        t1. a = 10;
        Test2 t2 = new Test2();
        t2 . b = 20;
        t2 . add (t1);
    }
}
