import java.util.Scanner;

public class XetCanhTriangle {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh a: ");
        a = scanner.nextDouble();
        System.out.println("nhap canh b: ");
        b = scanner.nextDouble();
        System.out.println("nhap canh c: ");
        c = scanner.nextDouble();
        checkTamGiac(a, b, c);
    }

    public static void checkTamGiac(double a, double b, double c) {
        if (a<b+c && b<a+c && c<a+b){
            if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b){
                System.out.println("day la 1 tam giac vuong");
                System.out.println("th1");
                TriangleArea(a, b, c);
            } else if (a == b & b == c){
                System.out.println("day la 1 tam giac deu");
                System.out.println("th2");
                TriangleArea(a, b, c);
            } else if (a == b || a == c || b == c){
                System.out.println("day la 1 tam giac can");
                System.out.println("th3");
                TriangleArea(a, b, c);
            } else if (a*a > b*b + c*c || b*b > a*a + c*c || c*c > a*a + b*b ){
                System.out.println("day la tam giac tu");
                System.out.println("th4");
                TriangleArea(a, b, c);
            } else
                System.out.println("day la tam giac nhon");
                System.out.println("th5");
                TriangleArea(a, b, c);
        } else {
            System.out.println("3 canh ko du dieu kien lap tam giac");
        }
    }
    public static void TriangleArea(double a, double b, double c){
        double P, SqrS, S;
        P = (a + b + c) / 2;
        SqrS = P * (P - a) * (P - b) * (P - c);
        S = (Math.pow(SqrS,2));
        System.out.println("Dien tich tam giac la: " + S);
    }


}
