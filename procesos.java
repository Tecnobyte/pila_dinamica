import java.util.Scanner;

public class procesos {
    Scanner paraPila = new Scanner(System.in);
    int[] auxiliar = null;
    
    public int[] ingresar(int[] pila, int contador){
        auxiliar = new int[contador];
        int n = 1;
        
        if(contador > 1){
            for(int i = 0; i<auxiliar.length; i++){
                auxiliar[i] = pila[n-1];
                if (n < pila.length ){
                    n++;
                }
            }
            n = 1;
        }
        
        System.out.print("Numero: ");
        int numero = paraPila.nextInt();
        
        auxiliar[contador - 1] = numero;
        return auxiliar;
    }
    
    public int[] eliminar(int[] pila, int contador){
        auxiliar = new int[contador - 1];
        for(int i = 0; i<auxiliar.length; i++){
            auxiliar[i] = pila[i];
        }
        return auxiliar;
    }
    
    public void mostrar(int[] pila){
        System.out.println("\n------------------");
        for (int i = pila.length - 1; i >= 0; i-- ){
            System.out.println ("[" + pila[i] + "]");
        }
        System.out.println("------------------");
    }
}
