public class MathodOverloading {
    static int pluceInt(int x, int y){
        return x+y;
    }
    public static void main(String[] args){
        int num1=pluceInt(20, 10);
        double num2=pluceInt(num1, num1);
        System.out.println("int"+num1);
        System.out.println("double"+num2);
    }
}
