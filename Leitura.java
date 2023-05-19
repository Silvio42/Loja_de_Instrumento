//Nome: Silvio Jorge de Oliveira -  RA: 2052261

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

//Entrada de Dados via Teclado

public class Leitura{

	public String entDados(String Leitura){

		System.out.println(Leitura);

		InputStreamReader tec = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(tec);
		
		String retorno ="";
			
		try{
			retorno = buff.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO");
		}

		return retorno;
	}

}