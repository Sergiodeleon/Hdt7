package hdt7;
//Sergio de Leon 14312
//Manolo Capilla 131350
/**
 *
 * @author Sergio
 */
public class Nodo{
   
    Nodo left;
    Association<String,String> datos=new Association<>();
    Nodo right;
     
    //iniciar dato y hacer de este nodo un nodo hoja
    public Nodo(Association datosNodo)
    {
        datos = datosNodo;
        left = right = null; //el nodo no tiene hijos
    }
     
    //buscar punto de insercion e inserter nodo nuevo
    public  void insertar(Association<String,String> valorInsertar)
    {
        
        String word=valorInsertar.getIngles();
        //insertar en subarbol izquierdo
        if(word.compareTo(datos.getIngles())<0){
            //insertar en subarbol izquierdo
          
            if(left == null){
                 //System.out.println("izquierda");
                left = new Nodo(valorInsertar);}
               
            else    //continua recorriendo subarbol izquierdo
                left.insertar(valorInsertar);
        }
         
        //insertar nodo derecho
        if(word.compareTo(datos.getIngles())>0){
            //insertar nuevo nodoArbol
            if(right == null){
                //System.out.println("derecha");
                right = new Nodo(valorInsertar);
            }
            else
                right.insertar(valorInsertar);
        }
    }// fin del metodo insertar
    

}
