import org.iesalandalus.programacion.estructurasdinamicasenjava.ejercicios.diccionario.ConsolaDiccionario;
import org.iesalandalus.programacion.estructurasdinamicasenjava.ejercicios.diccionario.Diccionario;

public class Main {
    public static void main(String[] args) {
        /*Set <Integer> numerosAleatorios = new HashSet<>();
        EjemploBucleImprimeHashSet ejemploBucleImprimeHashSet = new EjemploBucleImprimeHashSet();
        numerosAleatorios = ejemploBucleImprimeHashSet.añadiryMostrarElementos(numerosAleatorios);
        for(Iterator<Integer> iterator = numerosAleatorios.iterator(); iterator.hasNext();){
            int numElemento = iterator.next();
            System.out.println(numElemento);
        }
        ejemploBucleImprimeHashSet.MostrarElementosNoPares(numerosAleatorios);
        for(Iterator<Integer> iterator = numerosAleatorios.iterator(); iterator.hasNext();){
            int numElemento = iterator.next();
            System.out.println(numElemento);
        }
        Collections.sort(numerosAleatorios, new Comparator<Integer>()) {
            @Override
            public int compare (Integer o1, Integer o2){
                return o1.compareTo(o2);
            }
        }*/


        Diccionario diccionario = new Diccionario();
        ConsolaDiccionario.pedirNumerodePalabrasaGuardar();
    }

    private static void imprimirDiccionario(Diccionario diccionario) {
    }
}