import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class Temperatura {
	public static void main(String[] args) {
		
	List<Mes> meses = new ArrayList<Mes>(){
	{
		add(new Mes("janeiro",1,22.3));
		add(new Mes("fevereiro",2,22.5));
		add(new Mes("março",3,21.6));
		add(new Mes("abril",4,20.2));
		add(new Mes("maio",5,17.5));
		add(new Mes("junho",6,16.7));
	}};
	System.out.println(meses);
	
		
		
	
		int i=0;
		double tempSoma = 0;
		
		//for PARA SOMAR TODAS AS TEMPERATURAS
		for(i=0;i<meses.size();i++){
			tempSoma += meses.get(i).getTemp();
		}

		
		System.out.println(tempSoma);
		
		
		//CALCULAR A MEDIA;
		double tempMedia = tempSoma / meses.size();
		
		System.out.println(tempMedia);
		
		i=0;
		//IMPRIMIR MESES COM temp MAIORES QUE A tempMedia
		for(i=0;i<meses.size();i++){
			if (meses.get(i).getTemp()> tempMedia){
//					System.out.println(i+1+"- "+meses.get(i).getNome());
					System.out.println(meses.get(i).getNumero()+" - "+meses.get(i).getNome());
				
			}
		}
	}
};
