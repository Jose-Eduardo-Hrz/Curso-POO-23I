# Tarea 2. Ordenamiento de Elementos

Uamito esta impartiendo clases de programación, para su clase es necesario saber si un alumno ya curso anteriormente esta materia para generar tareas diferentes y no sea aburrido para el alumno.

Los de control escolar le proporcionan una lista con los alumnos que se encuentran inscritos en la materia, pero, esta lista se encuentra desordenada. Tu trabajo es ayudar a Uamito a buscar en esta lista los nombres de los alumnos que pudieran ya haber tomado esta materia (Recursadores).

Entrada:

 - Un arreglo de String de tamaño N, donde 1 < N < 100000 que representa los alumnos inscritos
 - Un arreglo de String de tamaño M, donde 1 < M < 100000 que representa los alumnos que pudieran ya haber tomado esta materia (Recursadores)

Salida:

Por cada alumno que pudiera ya haber tomado esta materia (Recursadores) se debe mostrar lo siguinete:
- Si el alumno ya tomo la materia : [nombre del alumno] 1 [numero de caracteres del nombre]
- Si el alumno no ha tomado la materia: [nombre del alumno] 0

Restricciones:

- Tu programa no debe tomar mas 1s en cada coso de prueba.

Para esta tarea se debe crear una clase llamada Tarea2 con la siguiente funcion miembro:

``` java
public static void verificarNombres( String [] alumnosInscritos , String [] alumnosRecursadores );
```

Ejemplo de Uso:

``` java
import java.util.Scanner;
public class Testing{
    public static void main( String [] args ){
        Scanner entrada = new Scanner(System.in);

        int numeroInscritos = entrada.nextInt();
        String [] inscritos = new String[ numeroInscritos ];
        for( int i = 0 ; i < inscritos.length ; i++ ){
            inscritos[i] = entrada.next();
        }

        int numeroRecursadores = entrada.nextInt();
        String [] recursadores = new String[ numeroRecursadores ];
        for( int i = 0 ; i < recursadores.length ; i++ ){
            recursadores[i] = entrada.next();
        } 

        Tarea2.verificarNombres(inscritos, recursadores);
    }
}
```

Datos de Entrada:

``` 
5
Eduardo Dulce Alondra Belem Grecia
3
Ernesto
Eduardo
Tomas
``` 

Resultado:
``` 
Ernesto 0
Eduardo 1 7
Tomas 0
``` 