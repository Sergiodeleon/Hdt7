package hdt7;
//Sergio de Leon 14312
//Manolo Capilla 131350
/**
 *
 * @author Sergio
 * @param <k>
 * @param <v>
 */
public class Association<k,v> {
	protected k ingles;
	protected v español;
	//Metodos 
	public Association()
	// post: constructor that generates an empty node
	{
		ingles = null;
		español = null;
	}
	public Association(k ingles,  v español,Association<k,v> words){
		this.ingles= ingles;
		this.español=español;
                
		}
	//Metodos Sets
	public void setIngles(k word){
		ingles=word;
	}
	public void setEspañol(v palabra){	
		español=palabra;
	}
	public k getIngles(){	
		return ingles;
	}
	public v getEspañol(){	
		return español;
	}
        

}
    

