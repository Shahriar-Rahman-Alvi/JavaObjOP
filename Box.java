import java.util.Scanner;
public class Box {
    float height;
    float width;
    float depth;

    Box(){
        height = 10;
        width = 20;
        depth = 30;
        System.out.println("Box is created");
    }
    Box(String str){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input for height: ");
        height = sc.nextFloat();

        System.out.println("Input for width: ");
        width = sc. nextFloat();

        System.out.println("Input for depth: ");
        depth = sc.nextFloat();

        System.out.println(str);
    }

    Box(float h, float w, float d){
        height = h;
        width = w;
        depth = d;
        System.out.println("Box is created");
    }
    void areaCalculation(){
        System.out.println("Area calculation for 1st is " + height*width*depth);
    }

    void areaCalculation(int a){
        System.out.println("Area calculation for " +a+ "nd is "+ height*width*depth);
    }

    void areaCalculation(int a , String str){
        System.out.println(str + a + "rd is " + height*width*depth);
    }
}
