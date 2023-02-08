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