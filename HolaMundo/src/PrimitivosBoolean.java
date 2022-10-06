public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 564654.54e-3;
        float f = 123456e3f;

        datoLogico = d > f;
        System.out.println("datoLogico = " + datoLogico);
        
        boolean esIgual = 3-2==1;
        System.out.println("esIgual = " + esIgual);
    }
}
