import java.util.Scanner;
public class Hotel {
    int [][] edificio = new int [7][12];

    public int [][] HabitacionesCadaPiso(){

        for(int i = 1; i<this.edificio.length; i++){
            for(int j = 0; j<3; j++){
                this.edificio[i][j] = 1;
            }
        }
        this.edificio[3][3] = 1;
        this.edificio[4][3] = 1;
        this.edificio[5][3] = 1;
        this.edificio[5][4] = 1;
        this.edificio[5][5] = 1;
        
        for(int j = 0; j<12; j++){
            this.edificio[6][j] = 1;
        }
        return this.edificio;
    }
    
    public int[][] reservarHabitacion(){
        int [][] reservas = HabitacionesCadaPiso();
        System.out.println("cuantas Habitacion va a reservar ?: ");
        Scanner sc = new Scanner(System.in);
        int cuantas = sc.nextInt();
        for(int i = 0; i<cuantas; i++){
            Scanner t = new Scanner(System.in);
             System.out.print("Ingrese el piso de la habitacion que desea reservar(Siendo 0 el primer piso y 6 el ultimo): ");
            int piso = t.nextInt();
             System.out.print("Ingrese el numero de la habitacion que desea reservar(Siendo 0 la primera habitacion): ");
            int habitacion = t.nextInt();

            if(this.edificio[piso][habitacion] == 0){
            System.out.println("Esto no es una habitacion");
            
            }
            if(this.edificio[piso][habitacion] == 1){
            this.edificio[piso][habitacion] = 3;
            System.out.println("Se reservo la habitacion piso: "+piso+"  Habitacion: "+habitacion);
            
            }

            System.out.println("Si desea cancelar la reserva hecha Ingrese el numero 2, Si no ingrese 3 para continuar");
            int cancela = t.nextInt();
            if(cancela == 2){
            this.edificio[piso][habitacion] = 1;
            System.out.println("Ya se cancelo su reserva (Se libero su habitacion)");
            
            }
        } 
        return this.edificio;   
        
    }
   
    
    public int[][] habitacionesDisp(){     
        System.out.println("Distribucion del edificio: ");
        for(int i = 0; i<this.edificio.length; i++){
            for(int j=0; j<this.edificio.length + 5; j++){
                if(this.edificio[i][j] == 3){
                    System.out.println("Esta ocupada la habitacion "+j+" Del piso : "+i+"");
                }
                if(this.edificio[i][j] == 1){
                    System.out.println("Esta libre la habitacion "+j+" Del piso : "+i+"");
                }
                if(this.edificio[i][j] == 0){
                    System.out.println("Esto no es una habitacion, Puerta: "+j+" Del piso : "+i+"");
                }
            }

        }        
        
        return this.edificio;

    }

    public void mostrarMatriz(){
        
        for(int i = 0; i < this.edificio.length; i++){ 
            for(int j = 0; j < this.edificio[i].length; j++){ 
                System.out.print(this.edificio[i][j] + " ");
            } 
            System.out.println("");	
        } 

    }

}

