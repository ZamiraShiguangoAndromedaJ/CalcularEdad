/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package zamira.estudiante.calcularedad;

import java.util.Scanner;
public class CalcularEdad {

    public static void main(String[] args) {
        
        Scanner e=new Scanner(System.in);
        System.out.println("Ingresa la edad:");
                
        int edad = e.nextInt();

        if (edad >= 0 && edad < 120) {
            //categoriza la persona
            if (edad >= 0 && edad <= 12) {
                System.out.println("Eres un niñato.");
            } else if(edad>=13 && edad<=35)  {
                //nos e que poner pipipi
                System.out.println("Eres un adolecente.");
                   // Hola soy nueva en esto jijiji
            }else{
                System.out.println("Eres un adulto mayor");
            }
        } else{
            System.out.println("Error");
        }

    }
}
