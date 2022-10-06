public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Rodrigo";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Rodrigo\") = " + nombre.equals("Rodrigo"));
        System.out.println("nombre.equals(\"rodrigo\") = " + nombre.equals("rorigo"));
        System.out.println("nombre.equalsIgnoreCase(\"rodrigo\") = " + nombre.equalsIgnoreCase("rodrigo"));
        System.out.println("nombre.compareTo(\"Rodrigo\") = " + nombre.compareTo("Rodrigo"));
        System.out.println("nombre.compareTo(\"Julián\") = " + nombre.compareTo("Julián"));
        System.out.println("nombre.charAt = " + nombre.charAt(0));
        System.out.println("nombre.charAt = " + nombre.charAt(1));
        System.out.println("nombre.charAt = " + nombre.charAt(6));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(4,7) = " + nombre.substring(4,7));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

        String trabalengua ="trabalenguas";
        System.out.println("trabalengua.replace(\"a\", \".\") = " + trabalengua.replace("a", "."));
        System.out.println("trabalengua = " + trabalengua);
        System.out.println("trabalengua.indexOf('a') = " + trabalengua.indexOf('a'));
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('x'));
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('t'));
        System.out.println("trabalengua.contains(\"t\") = " + trabalengua.contains("t"));
        System.out.println("trabalengua.contains(\"t\") = " + trabalengua.contains("x"));
        System.out.println("trabalengua.contains(\"t\") = " + trabalengua.contains("lenguas"));
        System.out.println("trabalengua.startsWith(\"traba\") = " + trabalengua.startsWith("traba"));
        System.out.println("trabalengua.endsWith(\"as\") = " + trabalengua.endsWith("as"));
        System.out.println("   trabalenguas   ");
        System.out.println("   trabalenguas   ".trim());



    }
}
