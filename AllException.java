//Nome: Silvio Jorge de Oliveira -  RA: 2052261
// Tratamento de Exceções, não utilizado o uso de NATIVAS (ex.: NumberFormatException, NullPointerException e etc.).

public class AllException extends Exception{

	Leitura l = new Leitura();

	public void QtdDeCordasExPrint(){
		System.out.println("\nQuantida de cordas e no maximo 12");
	}

	public void TipoAlavancaExPrint(){
		System.out.println("\nO tipo da alavanca so pode ter no maximo 30 caracteres");
	}

	public void GrossuraDasCordasExPrint(){
		System.out.println("\nA grossura deve ser no maximo 45");
	}

	public void QtdDeTonsExPrint(){
		System.out.println("\nEh permitido no maximo 4 tons");
	}

	//Todos os métodos apartir daqui, utilizam da Reflexividade

	public Guitarra QtdDeCordasExTratamento(Guitarra guitarra){
		try{
			guitarra.setQtdDeCordas(Integer.parseInt(l.entDados(" Digite a quantidade de cordas"))); 
			}
		catch (AllException qtdInvalida){
			qtdInvalida.QtdDeCordasExPrint();
			guitarra = qtdInvalida.QtdDeCordasExTratamento(guitarra);
		}	

		return guitarra;	
	}

	public Guitarra TipoAlavancaExTratamento(Guitarra guitarra){
		try{
			guitarra.setTipoDeAlavanca(l.entDados(" Digite o tipo da alavanca")); 
			}
		catch (AllException tamanhoInvalido){
			tamanhoInvalido.TipoAlavancaExPrint();
			guitarra = tamanhoInvalido.TipoAlavancaExTratamento(guitarra);
		}	

		return guitarra;	
	}

	public Baixo GrossuraDasCordasExTratamento(Baixo baixo){
		try{
			baixo.setGrossuraDasCordas(Float.parseFloat(l.entDados(" Digite a grossura das cordas"))); 
			}
		catch (AllException grossuraInvalida){
			grossuraInvalida.GrossuraDasCordasExPrint();
			baixo = grossuraInvalida.GrossuraDasCordasExTratamento(baixo);
		}	

		return baixo;	
	}

	public Baixo QtdDeCordasExTratamento(Baixo baixo){
		try{
			baixo.setQtdDeCordas(Integer.parseInt(l.entDados(" Digite a quantidade de cordas"))); 
			}
		catch (AllException qtdInvalida){
			qtdInvalida.QtdDeCordasExPrint();
			baixo = qtdInvalida.QtdDeCordasExTratamento(baixo);
		}	

		return baixo;	
	}

	public Bateria QtdDeTonsExTratamento(Bateria bateria){
		try{
			bateria.setQtdDeTons(Integer.parseInt(l.entDados(" Digite a quantidade de tons"))); 
			}
		catch (AllException qtdInvalidaTons){
			qtdInvalidaTons.QtdDeTonsExPrint();
			bateria = qtdInvalidaTons.QtdDeTonsExTratamento(bateria);
		}	

		return bateria;	
	}

	public Bateria QtdDeCordasExTratamento(Bateria bateria){
		try{
			bateria.setQtdDeCordas(Integer.parseInt(l.entDados(" Digite a quantidade de cordas"))); 
			}
		catch (AllException qtdInvalida){
			qtdInvalida.QtdDeCordasExPrint();
			bateria = qtdInvalida.QtdDeCordasExTratamento(bateria);
			}	

		return bateria;	
	}

}
