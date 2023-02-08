public class Tarea1{

    public static int obtenerObjetos( int numObjetosMesa , int [] objetos , int numObjetosLlevar ){
        for( int i = 0 ; i < numObjetosLlevar ; i++ ){
            for( int j = 1 ; j < numObjetosMesa - i ; j++ ){
                if( objetos[j-1] < objetos[j] ){
                    int aux = objetos[j-1];
                    objetos[j-1] = objetos[j];
                    objetos[j] = aux;
                }
            }
        }
        int suma = 0;
        for( int i = numObjetosMesa-1 ; i >= numObjetosMesa-numObjetosLlevar ; i-- ){
            suma = suma + objetos[i];
        }
        return suma;
    }

}