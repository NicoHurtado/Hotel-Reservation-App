public class prueba {
    public static void test(){
       
        Hotel cliente = new Hotel();

        cliente.reservarHabitacion();
        System.out.println("\n");
        System.out.println("Los 1 representan habitaciones disponibles, los 3 representan habitaciones reservadas y los 0 representa que no son habitaciones");
        cliente.mostrarMatriz();
        cliente.habitacionesDisp();
        

        
    }
}
