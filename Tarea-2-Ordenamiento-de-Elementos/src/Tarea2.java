import java.util.Arrays;

public class Tarea2{

    public static void verificarNombres( String [] alumnosInscritos , String [] alumnosRecursadores ){

        Arrays.sort(alumnosInscritos);

        for( int i = 0 ; i < alumnosRecursadores.length ; i++ ){
            int inicio = 0;
            int fin = alumnosInscritos.length-1;
            int medio;
            boolean encontrado = false;
            while( inicio <= fin ){
                medio = (inicio + fin) / 2;
                if( alumnosRecursadores[i].equals( alumnosInscritos[ medio ] ) ){
                    encontrado = true;
                    break;
                }else if( alumnosRecursadores[i].compareTo( alumnosInscritos[medio] ) > 0 ){
                    inicio = medio + 1;
                }else{
                    fin = medio - 1;
                }
            }
            System.out.println( alumnosRecursadores[ i ] + ( encontrado ? " 1 " + alumnosRecursadores[ i ].length() : " 0") );
        }

    }

}