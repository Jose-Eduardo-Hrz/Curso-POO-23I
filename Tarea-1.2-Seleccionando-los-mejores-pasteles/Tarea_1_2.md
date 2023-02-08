# Tarea 2. Seleccionando los Mejores Pasteles 

Uamito se encuentra en una fabrica de pasteles, en una repisa se colocan N pasteles, cada pastel tiene un peso de entre 1000 y 1800 gramos.

El encargado de la pasteleria le permite a Uamito llevarse M pasteles. Uamito esta en una situacion dificil y necesita seleccionar los M pasteles mas grandes de los N pasteles que se encuentran en la repisa. Tu trabajo es ayudar a Uamito a seleccionar los M pasteles mas grandes para conseguir la mayor suma de los pasteles seleccionados.

Entrada:
 - Un entero N que denota los pasteles en la repisa, donde 2 < N < 1000000
 - Los N enteros que denotan los tamaños de cada pastel  estos pueden ser entre 1000 y 1800.
 - Un entero M que denota los pasteles que se puede llevar Uamito, donde 1 <= M < N-1

Salida
 - La suma de los M pasteles mas grandes

Restricciones:
- No se permite el uso de ninguna libreria de java
- Tu programa no debe tomar mas 1s en cada coso de prueba.

Para esta tarea se debe crear una clase llamada Tarea1 con la siguinete funcion miembro:

``` java
public static long obtenerPasteles( int numPastelRepisa , int [] pasteles , int numPastelLlevar );
```

Ejemplo de Uso:

``` java
public class Testing{
    public static void main( String [] args ){
        Scanner entrada = new Scanner(System.in);

        int numeroPastelesRepisa = entrada.nextInt();
        int [] pasteles = new int[numeroPastelesRepisa];
        for( int i = 0 ; i < numeroPastelesRepisa ; i++ ){
            pasteles = entrada.nextInt();
        }

        int numeroPastelesLlevar = entrada.nextInt();

        int suma = Tarea1.obtenerPasteles( numeroPastelesRepisa , pasteles , numeroPastelesLlevar );
        System.out.println( suma );
    }
}
```

Datos de Entrada:

``` 
5
1000 1800 1100 1200 1750
2
``` 

Resultado:
``` 
2100
``` 
