//Main method of Array
public class ArrayDemo {
    public static void main(String[] args){
        A[] array = new A[10];

        for(int i = 0 ; i < 10; i++){
            array[i] = new A();
            array[i] . setA(i*10);
        }

        for(int i = 0 ; i < 10 ; i++){
            System.out.println(array[i] . getA());
        }
    }
}
