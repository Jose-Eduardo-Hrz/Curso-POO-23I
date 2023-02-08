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