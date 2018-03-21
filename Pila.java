import java.util.Scanner;

public class Pila {
    
    private static int tamPila(int [] pila){
        int tam = 0;
        
        if(pila !=  null){
            tam = pila.length;
        }
        return tam;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        procesos p = new procesos();
        int n = 1;
        int prueba;
        int[] pila = null;
        
        do{
        System.out.println ("pila dinamica: "+ tamPila(pila));
        System.out.println ("1.- ingresar");
        System.out.println ("2.- eliminar");
        System.out.println ("3.- mostrar");
        System.out.println ("4.- salir");
        System.out.print ("Opcion:");
        prueba = teclado.nextInt();
        System.out.println("");
        
        switch(prueba){
            case 1:
                pila = p.ingresar(pila, n);
                n++;
                break;
            case 2:
                if(tamPila(pila) > 0){
                n--;
                pila = p.eliminar(pila, n); }
                else{System.out.println("\npila vacia");}
                break;
            case 3:
                if(tamPila(pila) > 0){
                p.mostrar(pila);}
                else{System.out.println("\npila vacia");}
                break;
            }
        }while (prueba != 4);
        System.exit(0);
    }
}
