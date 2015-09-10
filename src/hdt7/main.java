package hdt7;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Sergio
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        BinaryTree arbol = new BinaryTree();
        sc = new Scanner (System.in);
        String[] Dato={"(house, casa)","(am, soy)","(i, yo)"};
    
        for(int i = 0; i < Dato.length; i++ )
        {   Association<String,String> valor=new Association<>();
            String dato1;
            int coma=0;
            dato1=Dato[i].toLowerCase();
            for(int n = 0; n <dato1.length()-1; n++){
                    if(Character.toString(dato1.charAt(n)).equals(",")){
                        coma = n;
                    }
                 }
            valor.setIngles(dato1.substring(1,coma));
            valor.setEspañol(dato1.substring(coma+1,dato1.length()-1));
            arbol.insertarNodo(valor);
        }
        String traduccion="house am house ";
        int inicio = 0;
        int numPalabras=0;
        List<String> Texto = new ArrayList<>();
             for(int n = 0; n <traduccion.length(); n++){
                    if(Character.toString(traduccion.charAt(n)).equals(" ")){
                        Texto.add(traduccion.substring(inicio, n));
                        inicio = n;
                        numPalabras=numPalabras+1;
                        
                    }
                 }
        
        System.out.println("Ingrese palabra en ingles: ");
        String word="";
        String word1 =arbol.buscar(Texto.get(1));
        System.out.println(word1.substring(0,word1.length()));
        System.out.println(arbol.buscar(Texto.get(2)));
             for(int n = 0; n<numPalabras; n++){
                        word=word+arbol.buscar(Texto.get(n).replace(" ",""));
                 }
        
        System.out.println(word);
        System.out.println(arbol.recorridoInorden());
    }
    
}
