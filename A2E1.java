import java.util.Scanner;
import java.util.Random;
public class A2E1 {
    static Scanner entrada = new Scanner(System.in);
    static Random r = new Random();
    public static void main(String args[])
    {
        int cantidadPar = 0;
        int cantidadImpar = 0;
        System.out.println("Ingrese cualquier numero N positivo");
        int num = entrada.nextInt();
        System.out.println("");
        for(int i =1 ; i <= num ; i++)
        {
            int numAl = r.nextInt(100-1)+1;
            System.out.println("el numero aleatorio #"+i+" es: "+numAl);
            System.out.println("");
            int numeroPar = (numAl % 2);
            if(numeroPar == 0)
            {
                System.out.println("El numero "+numAl+" es PAR");
                System.out.println("");
                cantidadPar = cantidadPar+1;
            }else{
                System.out.println("El numero "+numAl+ " es IMPAR");
                System.out.println("");
                cantidadImpar = cantidadImpar+1;
            }
        }
        System.out.println("La cantidad de numeros PARES generados fue: "+cantidadPar);
        System.out.println("");
        System.out.println("La cantidad de numeros IMPARES generados fue: "+cantidadImpar);
    }
}
