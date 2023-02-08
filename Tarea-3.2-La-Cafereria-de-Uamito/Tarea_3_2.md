# Tarea 3. La Cafeteria de Uamito 


## Descripción

Uamito tiene una cafeteria y tiene a la venta cafes Expresos, Capuchinos y mocaccinos. Como su negocio es muy bueno, requiere de empleados que sepan preparar Expresos, Capuchinos y Mocaccinos. Cada empleado puede preparar los cafes dependiendo de su **clase (tipo A, tipo B y tipo C)**, de su **edad** y de su **peso**.

Tu trabajo es ayudar a uamito a administrar la cafeteria para almacenar el numero de Expresos, de Capuchinos y Mocaccinos que se preparan en un determinado tiempo, ademas de almacenar los sueldos de los empleados.

Implementa una clase llamada Empleado que permita almacenar la siguiente información: **nombre**, **edad**, **peso**, y **clase**, la clase puede ser **(A = 150 , B = 330, C = 420)**, ademas, debes agregar las acciones que puede realizar el empleado en un **dia**, las cuales son:

- **preparar expresos** : Este método permite obtener el número de expresos que puede preparar cada empleado, se calcula de la siguiente manera:
    ~~~  
    expresos = 
    ~~~  
- **preparar capuchinos** : Este método permite obtener el número de capuchinos que puede preparar el empleado, se calcula de la siguiente manera:
    ~~~  
    capuchinos = 
    ~~~  
- **preparar mocaccinos** : Este método permite obtener el número de mocaccinos que puede preparar el empleado, se calcula de la siguiente manera:
    ~~~  
    mocaccinos = 
    ~~~  
> Donde **valorClase** puede ser A = 150 , B = 330, C = 420

Por ultimo, deberas agregar los metodo:

- **toString** : Este metodo permite mostrar el nombre del empleado
- **getClase** : Este metodo permite mostrar la clase del empleado
- **setClase** : Este metodo pemrite modificar la clase del empleado

### Clase Empleado


```java
public class Empleado{
    // Atributos de la clase
    private String nombre;
    private int edad;
    private float peso;
    private String clase;
    // Metodo Constructor
    public Empleado( String nombre , int edad , float peso , String clase );
    // Acciones que realiza el empleado (Metodos)
    public int prepararExpresos();
    public int prepararCapuchinos();
    public int prepararMocaccinos();
    // Metodos de modificacion y accesibilidad
    public String toString();
    public String getClase();
    public void setClase();
}
```

Tambien, deberas implementar una clase llamada Cafeteria que permita almacenar la siguiente información: Un arreglo de **empleados**, el numero de **expresos**, **capuchinos** y **mocaccinos** que se realizaron en **N dias** y un arreglo con los **sueldos** de los empleados, ademas, debes agregar las acciones que se realizan en cafeteria en **N dias**, las cuales son:

- **mostrarSueldos** : Esta función tiene como objetivo mostrar los sueldos de los empleados de los N dias trabajados.
- **producirExpresos** : Esta funcion tiene como objetivo producir Expresos en N dias y registrar el sueldo de cada empleado por los dias trabajados, se calcula de la siguiente manera:

    ```path
    Clase A = 
    ```

- **producirGalletas** : Esta funcion tiene como objetivo producir galletas en N dias y registrar el sueldo de cada empleado por los dias trabajados, se calcula de la siguiente manera:

    ```path
    Clase B = 
    ```

- **producirCapuchinos** : Esta funcion tiene como objetivo producir capuchinos en N dias y registrar el sueldo de cada empleado por los dias trabajados, se calcula de la siguiente manera:

    ```path
    Clase C = 
    ```

- **mostrarMocaccinos** : Esta funcion tiene como objetivo mostrar las producciones de los productos (expresos, capuchinos y mocaccinos) en este orden, ejemplo:

    ```path
    Total expresos: 2562
    Total capuchinos: 4575
    Total mocaccinos: 78215
    ```

- **aumentarClase** : Esta funcion tiene como objetivo aumentar la clase del empleado, ejemplo si el empleado es de tipo "A" y se llama a esta función, ahora este empleado sera de tipo "B", pero, si el empleado es de tipo "C", este se quedara en tipo "C".


### Clase Cafeteria

```java
public class Cafeteria{
    // Atributos de la clase
    private Empleado [] empleado;
    private int expresos;
    private int capuchinos;
    private int mocaccinos;
    private float [] sueldos;
    // Metodo Constructor
    public Cafeteria( Empleado [] empleados);
    // Acciones que se pueden hacen en la panadria (Metodos)
    public void mostrarSueldos();
    public void producirExpresos( int dias );
    public void producirCapuchinos( int dias );
    public void producirMocaccinos( int dias );
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
        // Se declara un arreglo de empleados
        Empleado [] empleados = new Empleado[2];
        // Se instancia (se crean) 3 empleados
        empleados[0] = new Empleado( "German" , 25 , 70 , "A" );
        empleados[0] = new Empleado( "Dulce" , 35 , 45 , "B" );
        empleados[0] = new Empleado( "Scarlett" , 22 , 50 , "C" );
        // Se instancia (se crea) una cafeteria
        Cafeteria cafeteria = new Cafeteria( empleados );
        // Se utiliza los metodos (acciones) de la cafeteria
        cafeteria.producirPasteles( 5 );
        cafeteria.producirGalletas( 6 );
        cafeteria.aumentarClase();
        cafeteria.producirPanes( 4 );

        cafeteria.mostrarProducciones();
        cafeteria.mostrarSueldos();
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
