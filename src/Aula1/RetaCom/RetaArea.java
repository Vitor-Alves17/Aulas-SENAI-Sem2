package Aula1.RetaCom;

public class RetaArea {
    public static void main(String[] args) {
        CalcReta cr = new CalcReta();

        double area1 = cr.area();
        double area2 = cr.area();
        double area3 = cr.area();

        System.out.println(area1 + " " + area2 + " " + area3);
    }
}
