package phan_loai_tam_giac.src;

public class TriangleClassifier {
    public static String kiemTraTamGiac(int a, int b, int c) {
        if( a<b+c && b<a+c && c<a+b ){
            if( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b)
                return "Day la tam giac vuong";
            else if(a==b && b==c)
                return "Day la tam giac deu";
            else if(a==b || a==c || b==c)
                return "Day la tam giac can";
            else if(a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b)
                return "Day la tam giac tu";
            else
                return "Day la tam giac thuong";
        }
        else
            return "khong phai la tam giac";
    }
}
