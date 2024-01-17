import models.Target;

import java.util.Scanner;

public class Main {
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        short[] array = {3,5,9,12,24,25,30,35,43,45};
        short[] pos;
        Target objeto = new Target();
        short number;
        System.out.print("Introduce el número a buscar: ");
        number = keyboard.nextShort();
        objeto.setData(array);
        if (objeto.searchTarget(number)){
            pos = objeto.getPos();
            System.out.println("El target "+number+" se conforme con los números de los índices "+pos[0]+" y "+pos[1]);
        } else {
            System.out.println("El target "+number+ " no se encuentra");
        }
        System.out.println("By @alilopez");
    }
}