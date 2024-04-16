import java.util.Scanner;

public class MediaEdad {
    public static void main(String[] args) throws Exception {
        //Se pregunta al usuario el nombre y edad de su madre,
        //y lo mismo de su padre. Al final, mostrar frase del
        //tipo “Tu madre se llama Berta y tiene 55 años, y tu
        //padre se llama Roberto y tiene 57 años, y la media de
        //us edades es 56”

        //OJO, tener en cuenta los decimales!
        //Cuando os salga el error que tiene que salir 
        //después del nextInt( ) , me avisáis

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("cual es el nombre de tu madre?");
        String nombreMadre = teclado.nextLine();

        System.out.println("cual es la edad de tu madre?");
        int edadMadre = teclado.nextInt();
        System.out.println("cual es el nombre de tu padre?");
        teclado.nextLine();
        String nombrePadre = teclado.nextLine();
        
        System.out.println("cual es la edad de tu padre?");
    
        int edadPadre = teclado.nextInt();
        float edadMedia = (float) (edadMadre+edadPadre)/2;
        

   
        teclado.close();
        System.out.println("Tu madre se llama "+nombreMadre+" y tiene "+edadMadre+" años, y tu padre se llama "+nombrePadre+" y tiene "+edadPadre+" años, y su edad media es de "+edadMedia);
    }
}
