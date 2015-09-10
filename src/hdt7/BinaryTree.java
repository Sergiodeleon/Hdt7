package hdt7;
//Sergio de Leon 14312
//Manolo Capilla 131350
/**
 *
 * @author Sergio
 */
public class BinaryTree<E>{
     private Nodo raiz;
     private String word;
     private String arbol;
    //construir un arbol vacio
    public BinaryTree()
    {   
        raiz = null;
        word="";
        arbol="";
    }
     
    //insertar un nuevo ndo en el arbol de busqueda binaria
    public  void insertarNodo(Association<String,String> valorInsertar){
        if(raiz == null){
            raiz = new Nodo(valorInsertar); //crea nodo raiz
            
        }
        else{
            raiz.insertar(valorInsertar); //llama al metodo insertar 
        }
            
    }

    public String buscar(String palabra){
        word=palabra;
        buscarHelp(raiz);
        return word;   
       }
   public void buscarHelp(Nodo nodo){

       if(nodo==null)return;
       buscarHelp(nodo.left);
       if(nodo.datos.getIngles().equals(word)){
           word=nodo.datos.getEspañol();
          
       } 
       if(nodo.datos.getEspañol().equals(word)){
       return;
       }
       buscarHelp(nodo.right);
       
   }     
    

    

//EMPEZAR RECORRIDO INORDEN
    public  String recorridoInorden()
    {
        Inorden(raiz);
        return arbol;
        
    }
     
    //meoto recursivo para recorrido inorden
    private void Inorden( Nodo nodo)
    {
        if(nodo == null)return;
        Inorden(nodo.left);
        arbol=arbol+"("+nodo.datos.getIngles()+", "+nodo.datos.getEspañol()+") ";
        Inorden(nodo.right);
        
    }
	
}


