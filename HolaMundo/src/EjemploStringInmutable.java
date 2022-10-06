public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java"; /*Se crea de forma literal*/
        String profesor = "Andrés Guzmán";

        String resultado = curso.concat(profesor);
        System.out.println(resultado);

        String resutlador2 = curso.transform(c ->{
            return  c + " con " + profesor;
        });
        System.out.println("curso = " + curso);
        System.out.println("resutlador2 = " + resutlador2);

        String resultado3 = resultado.replace("a" , "A");
        System.out.println("resultado3 = " + resultado3);
    }
}
