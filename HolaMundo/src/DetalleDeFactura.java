import javax.swing.*;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        /*La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:

        Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.

        Reciba 2 prºecios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).

        Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%

        Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.

        Por ejemplo, el resultado podría ser algo así:

        La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882



        IMPORTANTE: Como nota aparte todas las tareas publicadas en el curso son opcionales,
        no afecta en nada en el avance del curso ni en el temario, tampoco afecta en la entrega
        final del diploma o reconocimiento por haber finalizado el curso, son 100% opcionales y
        todas traen incluidas el código de solución.
        Así es como funciona el sistema de tareas de udemy, las tareas no quedan marcadas con
        checked (como realizadas), esta funcionalidad no tiene nada que ver con nuestro curso
        ni el instructor, así es como funciona la plataforma de Udemy.


        Preguntas de esta tarea
        Envía y publica acá tu código fuente del requerimiento (la clase main), pero también es importante que lo realices en tu equipo con el IDE y pruebes antes de enviarlo.*/


        /*INTRODUCIR DATOS DE LA FACTURA*/
        String nombreFactura = JOptionPane.showInputDialog(null, "Ingrese el nombre de la factura");
//        JOptionPane.showMessageDialog(null, "Nombre de la factura: "+nombreFactura);
        String precio1 = JOptionPane.showInputDialog(null, "Primer precio");
        String precio2 = JOptionPane.showInputDialog(null, "Segundo precio");
//        JOptionPane.showMessageDialog(null, "Segundo precio: "+precio2);

        /*TRANSORMAR LOS DATOS A DOUBLE*/
        double precio1Doble = Double.parseDouble(precio1);
//        System.out.println("precio1Doble = " + precio1Doble);
        double precio2Doble = Double.parseDouble(precio2);
//        System.out.println("precio2Doble = " + precio2Doble);

        /*CALCULAR FACTURA*/
        double suma = precio1Doble + precio2Doble;
        double impuesto = suma * 0.19;
        double sumaFin= suma+impuesto;

        JOptionPane.showMessageDialog(null, "Nombre de la factura: "+nombreFactura+"\nPrimer precio: "+precio1+"\nSegundo precio: "+precio2+"\nLa suma de ambos es: "
                +suma+"\nAplicando el 19% del impuesto se queda en: "+impuesto+"\nEl precio final sería: "+sumaFin);
    }
}
