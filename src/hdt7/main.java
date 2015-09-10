package hdt7;
//Sergio de Leon 14312
//Manolo Capilla 131350
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
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
        String traduccion="";
        try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("texto.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
         
            
            while ((strLinea = buffer.readLine()) != null)   {
                traduccion = traduccion+strLinea+" ";
            }
            // Cerramos el archivo
            entrada.close();
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        List<String> Dato = new ArrayList<>();
        int countLineas = 0;
        try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("diccionario.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
         
            
            while ((strLinea = buffer.readLine()) != null)   {
                Dato.add(strLinea);
                countLineas = countLineas+1;
            }
            // Cerramos el archivo
            entrada.close();
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        
        
    
        for(int i = 0; i < countLineas; i++ )
        {   Association<String,String> valor=new Association<>();
            String dato1;
            int coma=0;
            dato1=Dato.get(i).toLowerCase();
            for(int n = 0; n <dato1.length()-1; n++){
                    if(Character.toString(dato1.charAt(n)).equals(",")){
                        coma = n;
                    }
                 }
            valor.setIngles(dato1.substring(1,coma));
            valor.setEspañol(dato1.substring(coma+1,dato1.length()-1));
            arbol.insertarNodo(valor);
        }
        
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
        

        String word="";
             for(int n = 0; n<numPalabras; n++){
                        String palabra1 = arbol.buscar(Texto.get(n).replace(" ",""));
                        String palabra2 = Texto.get(n).replace(" ","");
                        
                        if(palabra1.equals(palabra2)){
                            word=word+" *"+Texto.get(n).replace(" ","")+"*";
                            
                        }
                        else{
                    
                        word=word+arbol.buscar(Texto.get(n).replace(" ",""));
                 
                        }
                 }
        System.out.println("Recorrido del arbol In-order:");    
        System.out.println(arbol.recorridoInorden());
        System.out.println(); 
        System.out.println("El texto recibido es: "+traduccion);
        System.out.println("Texto traducido: "+word);
        
       
    }
    
}
