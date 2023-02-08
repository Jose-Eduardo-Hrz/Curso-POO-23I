# Tarea 3. La Panaderia de Uamito

## Descripción

Uamito tiene una panaderia y tiene a la venta pasteles, galletas y panes de dulce. Como su negocio es muy bueno, requiere de trabajadores que sepan hornear pasteles, hornear galletas y hornear panes de dulce. Cada trabajador puede hornear los productos de la panederia dependiendo de su **clase (tipo A, tipo B y tipo C)**, de su **edad** y de su **peso**.

Tu trabajo es ayudar a uamito a administrar la panederia para almacenar el numero de pasteles, de galletas y de panes de dulce que se hornean en un determinado tiempo, ademas de almacenar los sueldos de los trabajadores.

Implementa una clase llamada Trabajador que permita almacenar la siguiente información: **nombre**, **edad**, **peso**, y **clase**, la clase puede ser **(A = 350 , B = 450, C = 600)**, ademas, debes agregar las acciones que puede realizar el trabajador en un **dia**, las cuales son:

- **hornear pasteles** : Este método permite obtener el número de pasteles que puede hornear el trabajador, se calcula de la siguiente manera:
    ~~~  
    hornearPasteles = (valorClase / peso) + edad
    ~~~  
- **hornear galletas** : Este método permite obtener el número de galletas que puede hornear el trabajador, se calcula de la siguiente manera:
    ~~~  
    hornearGalletas = (valorClase * 100) + (peso / edad) 
    ~~~  
- **hornear panes** : Este método permite obtener el número de panes que puede hornear el trabajador, se calcula de la siguiente manera:
    ~~~  
    hornearPanes = valorClase + peso + edad
    ~~~  
>Donde **valorClase** puede ser A = 350 , B = 450, C = 600

Por ultimo, deberas agregar los metodo:

- **toString** : Este metodo permite mostrar el nombre del trabajador
- **getClase** : Este metodo permite mostrar la clase del trabajador
- **setClase** : Este metodo pemrite modificar la clase del trabajador

### Clase Trabajador


```java
public class Trabajador{
    // Atributos de la clase
    private String nombre;
    private int edad;
    private float peso;
    private String clase;
    // Metodo Constructor
    public Trabajador( String nombre , int edad , float peso , String clase );
    // Acciones que realiza el trabajador (Metodos)
    public int hornearPasteles();
    public int hornearGalletas();
    public int hornearPanes();
    // Metodos de modificacion y accesibilidad
    public String toString();
    public String getClase();
    public void setClase();
}
```

Tambien, deberas implementar una clase llamada Panaderia que permita almacenar la siguiente información: Un arreglo de **trabajadores**, el numero de **pasteles**, **galletas** y **panes** que se realizaron en **N dias** y un arreglo con los **sueldos** de los trabajadores, ademas, debes agregar las acciones que se realizan en panaderia en **N dias**, las cuales son:

- **mostrarSueldos** : Esta función tiene como objetivo mostrar los sueldos de los trabajadores de los N dias trabajados.
- **producirPasteles** : Esta funcion tiene como objetivo producir pasteles en N dias y registrar el sueldo de cada trabajador por los dias trabajados, se calcula de la siguiente manera:

    ```path
    Clase A = (edad*0.5) + (diasTrabajados*100)
    ```

- **producirGalletas** : Esta funcion tiene como objetivo producir galletas en N dias y registrar el sueldo de cada trabajador por los dias trabajados, se calcula de la siguiente manera:

    ```path
    Clase B = (edad*0.75) + (diasTrabajados*150) + 100
    ```

- **producirPanes** : Esta funcion tiene como objetivo producir panes de dulce en N dias y registrar el sueldo de cada trabajador por los dias trabajados, se calcula de la siguiente manera:

    ```path
    Clase C = edad + (diasTrabajados*150) + 200
    ```

- **mostrarProducciones** : Esta funcion tiene como objetivo mostrar las producciones de los productos (pasteles, galletas y panes de dulce) en este orden, ejemplo:

    ```path
    Total pasteles: 2562
    Total galletas: 4575
    Total panes: 78215
    ```

- **aumentarClase** : Esta funcion tiene como objetivo aumentar la clase del tranbajador, ejemplo si el trabajador es de tipo "A" y se llama a esta función, ahora este trabajador sera de tipo "B", pero, si el trabajador es de tipo "C", este se quedara en tipo "C".


### Clase Panaderia

```java
public class Panaderia{
    // Atributos de la clase
    private Trabajador [] trabajador;
    private int pasteles;
    private int galletas;
    private int panes;
    private float [] sueldos;
    // Metodo Constructor
    public Panaderia( Trabajador [] trabajadores);
    // Acciones que se pueden hacen en la panadria (Metodos)
    public void mostrarSueldos();
    public void producirPasteles( int dias );
    public void producirGalletas( int dias );
    public void producirPanes( int dias );
    public void mostrarProducciones();
    public void aumentarClase();
}
```

### Restricciones
- No se permite el uso de ninguna libreria de java
- Tu programa no debe tomar mas 1s en cada coso de prueba.

### Ejemplo de Uso:

```java
public class Testing{
    public static void main( String [] args ){
        // Se declara un arreglo de trabajadores
        Trabajador [] trabajadores = new Trabajador[2];
        // Se instancia (se crean) 3 trabajadores
        trabajadores[0] = new Trabajador( "Ernesto" , 31 , 80 , "A" );
        trabajadores[0] = new Trabajador( "Dulce" , 24 , 50 , "B" );
        trabajadores[0] = new Trabajador( "Jesus" , 27 , 75 , "C" );
        // Se instancia (se crea) una panaderia
        Panaderia panaderia = new Panaderia( trabajadores );
        // Se utiliza los metodos (acciones) de la panaderia
        panaderia.producirPasteles( 5 );
        panaderia.producirGalletas( 6 );
        panaderia.aumentarClase();
        panaderia.producirPanes( 4 );

        panaderia.mostrarProducciones();
        panaderia.mostrarSueldos();
    }
}
```

### Resultado
```path
Total pasteles: 500
Total galletas: 1200
Total panes: 850
Ernesto B $452525
Dulce C $56525
Jesus C $855555
```