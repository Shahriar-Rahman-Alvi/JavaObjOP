public class BoxMain{
    public static void main(String[] args){
        Box b1 = new Box();
        Box b2 = new Box("New box is created");
        Box b3 = new Box (10.2f , 11.3f, 12.5f);

        System.out.println(b1.height);
        System.out.println(b2.height);
        System.out.println(b3.height);

        b1.areaCalculation();
        b2.areaCalculation(2);
        b3.areaCalculation(3 , "Area Calculation for ");
    }
}