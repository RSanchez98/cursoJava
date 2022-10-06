public class ConversionDeTipos {
    public static void main(String[] args) {
        //TRANSFORMAR UN STRING A UN ENTERO
        var numeroStr ="50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr ="9846.54e-3";
        double realDoble = Double.parseDouble(realStr);
        System.out.println("realDoble = " + realDoble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        System.out.println("*********************************************");
        //TRANSOFRMAR PIMITIVOS A CADENA
        int otroNumeroInt = 100;

        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otorNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otorNumeroStr = " + otorNumeroStr);

        otorNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otorNumeroStr = " + otorNumeroStr);

        double otroRealDouble = 1.2345e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        System.out.println("*********************************************");
        //DE PRIMITIVO A PRIMITIVO

        int i = 10000;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
