import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n, q; //n = numero de canicas, q = numero de preguntas.
        int caso = 1;

        //Ciclo para leer el archivo numero por numero.
        while ((n = scanner.nextInt()) != 0 && (q = scanner.nextInt()) != 0) {
            System.out.println("CASE# " + caso + ":");

            int[] canicas = new int[n];

            //Agregamos las n canicas al arreglo canicas y lo ordenamos.
            for (int i = 0; i < n; i++) 
                canicas[i] = scanner.nextInt();
            Arrays.sort(canicas);

            //canicasOrdenadas<numCanica,indice>
            HashMap<Integer,Integer> canicasOrdenadas = new HashMap<>();

            //Agregamos las n canicas a un HashMap para buscar en tiempo O(1).
            for (int j = 0; j < n; j++) 
                canicasOrdenadas.putIfAbsent(canicas[j], j);
            
            //Buscamos las q canicas preguntas en las n canicas en el HashMap,imprimimos su info. 
            int canica, posicion;
            for (int k = 0; k < q; k++) {
                canica = scanner.nextInt();
                if (canicasOrdenadas.containsKey(canica)) {
                    posicion = canicasOrdenadas.get(canica) + 1;
                    System.out.println(canica + " found at " + posicion);
                } else {
                    System.out.println(canica + " not found");
                }
            }
            caso++;
        }
        scanner.close();
    }
}