public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java"; /*Se crea de forma literal*/
        String curso2 = new String("Programación java"); /*Se crea de forma explícita*/

        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);


    }
}
