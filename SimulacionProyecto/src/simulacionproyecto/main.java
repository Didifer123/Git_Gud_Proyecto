import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Escenario laberinto = new Escenario();
		Matriz matri = new Matriz();
		int opcion;
		
		do{
			System.out.println("Ingrese la dificultad del laberinto que desea: ");
			System.out.println("1. Laberinto Medio");
			System.out.println("2. Laberinto Dificil");
			System.out.println("3. Salir");
			opcion = scan.nextInt();
			
			if(opcion == 1){
				matri.imprimirMatriz(laberinto.escenarioUno());
			}
			else if(opcion == 2){
				matri.imprimirMatriz(laberinto.escenarioDos());
			}else{
				System.out.println("Adios!");
			}
			
		}while(opcion != 3);
	}

}
