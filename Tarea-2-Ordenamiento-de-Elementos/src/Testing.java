import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroInscritos = entrada.nextInt();
        String [] inscritos = new String[ numeroInscritos ];
        for( int i = 0 ; i < inscritos.length ; i++ ) inscritos[i] = entrada.next();

        int numeroRecursadores = entrada.nextInt();
        String [] recursadores = new String[ numeroRecursadores ];
        for( int i = 0 ; i < recursadores.length ; i++ ) recursadores[i] = entrada.next();

        Tarea2.verificarNombres(inscritos, recursadores);
    }
}
