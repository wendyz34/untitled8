public class Main {
    public static void main(String[]args){
        System.out.println(toOctal(17));
        System.out.println(toBinary(21));
        System.out.println(toHex(10));
    }

public static String toOctal(int n){
        if (n<8){
            return Integer.toString(n);
        }
            return (toOctal(n/8)) +(n%8);

}
public static String toBinary(int n) {
   if (n == 1){
        return Integer.toString(n);
    }
    return (toBinary(n/2))+((n%2));
}
public static String toHex(int n){
    char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    if(n<6){
        int i = hexchars[n];
        return Integer.toString(n);
    }
    return hexchars[n/16]+(toHex(n/16))+(n%16);
}


}