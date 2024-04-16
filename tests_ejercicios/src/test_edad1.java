import java.util.Scanner;

public class test_edad1 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = teclado.nextInt();
        teclado.close();
        if(edad>6 && edad<12){
            System.out.println("estás en primaria");
        }else if (edad>12 && edad<16){
            System.out.println("Estás en secundaria");

        }else if (edad>16 && edad<22){
            System.out.println("Estás en la universidad");

        }else if (edad>22 && edad<120){
            System.out.println("Estás trabajando");

        }else if (edad<6 || edad>120){
            System.out.println("Error");

        }
    }
}
