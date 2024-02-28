public class ReturnValue {
    static int myMathod(int x){
        return 5 + x;
    
    }
    public static void main(String[] agrs){
        System.out.println((myMathod(30)));
    } 
}
/*The void Keyword, used in the examples above, indicates that the method should not return a value. If you want the method to return a value, you can use a primitive data type(such sa int,char ,etc.) instead of void , and use the return keyword inside the mithod:
 */