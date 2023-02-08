# Tarea 1. El viaje de Uamito

Uamito decea viajar de vacaciones a la playa, coloca en una mesa varios objetos importantes que necesitara para su viaje, pero, se encuentra con un problema, los N objetos que se encuentran en la mesa son muy pesados y decea tomar solo M objetos, estos M objetos seleccionados deben ser los que tienen menor peso para su viaje.

Tu trabajo es ayudar a Uamito a seleccionar M objetos de los N objetos, los cuales, la suma de todos los M objetos debe ser la menor.

Entrada:
 - Un entero N que denota los objetos que se encuentran en la mesa, donde 2 < N < 1000000
 - Los N enteros que denotan los pesos de cada objeto, cada objeto puede tener un peso de entre 1500 y 2100 gramos.
 - Un entero M que denota los objetos que puede llevar Uamito a la playa, donde 1 < M < N - 1

Salida:
 - La suma de los M objetos con menor peso

Restricciones:
- No se permite el uso de ninguna libreria de java
- Tu programa no debe tomar mas 1s en cada coso de prueba.

Para esta tarea se debe crear una clase llamada Tarea1 con la siguinete funcion miembro:

``` java
public static int obtenerObjetos( int numObjetosMesa , int [] objetos , int numObjetosLlevar );
```

Ejemplo de Uso:

``` java
public class Testing{
    public static void main( String [] args ){
        Scanner entrada = new Scanner(System.in);

        int numeroObjetosMesa = entrada.nextInt();
        int [] objetos = new int[numeroObjetosMesa];
        for( int i = 0 ; i < numeroObjetosMesa ; i++ ){
            objetos = entrada.nextInt();
        }

        int numeroObjetosLlevar = entrada.nextInt();

        int suma = Tarea1.obtenerObjetos( numeroObjetosMesa , objetos , numeroObjetosLlevar );
        System.out.println( suma );
    }
}
```

Datos de Entrada:

``` 
5
2000 1750 1500 2100 1600
2
``` 

Resultado:
``` 
3100
``` 