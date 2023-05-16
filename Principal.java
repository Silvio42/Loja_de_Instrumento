//Nome: Silvio Jorge de Oliveira -  RA: 2052261

public class Principal {
    public static void main(String[] args) {
    
    Leitura l = new Leitura();
    boolean laco = true;
    String resultado ="";
    int opcao = 0;
    String opcao2 = "";
    Instrumento i = new Instrumento();
    Guitarra guitarra = new Guitarra();
    Baixo baixo = new Baixo();
    Bateria bateria = new Bateria();
    Estoque estoque = new Estoque();
    boolean entradaValida = false;
	

    while(laco){

		System.out.println("\n ====== MENU ======");
		System.out.println("\nCadastrar Instrumentos");		
		System.out.println("1)Cadastrar Guitarra");
		System.out.println("2)Cadastrar Baixo");				
		System.out.println("3)Cadastrar Bateria");		
		System.out.println("4) Sair");

		resultado = l.entDados("\n Escolha uma opcao: ");		
		opcao = Integer.parseInt(resultado);

		//Menu de opções na classe Principal (usar blocos switch/case);

		switch(opcao){

			case 1:{
				System.out.println("\n == Cadastrar Guitarra ==");
                		guitarra.setNome("Guitarra");
				guitarra.getfornecedor().setCnpj(Integer.parseInt(l.entDados(" Digite o CNPJ do fornecedor do item")));
				guitarra.getfornecedor().setEndereco(l.entDados(" Digite o endereco do fornecedor dos item"));
				guitarra.getestoque().setQtdDeItens(Integer.parseInt(l.entDados(" Digite a quantidade que tem no estoque")));
				guitarra.getestoque().setValor(Float.parseFloat(l.entDados(" Digite o valor dos itens em estoque")));

				try{
					guitarra.setQtdDeCordas(Integer.parseInt(l.entDados(" Digite a quantidade de cordas"))); 
					}
				catch (AllException qtdInvalida){
					qtdInvalida.QtdDeCordasExPrint();
					guitarra = qtdInvalida.QtdDeCordasExTratamento(guitarra);
				}	
				
				try{
					guitarra.setTipoDeAlavanca(l.entDados(" Digite o tipo da alavanca")); 
				}
				catch (AllException tamanhoInvalido){
					tamanhoInvalido.TipoAlavancaExPrint();
					guitarra = tamanhoInvalido.TipoAlavancaExTratamento(guitarra);
				}	


				guitarra.setQtdDeCasas(Integer.parseInt(l.entDados(" Digite a quantidade de casas")));
				
				System.out.println("\n O CNPJ do fornecedor eh "+guitarra.getfornecedor().getCnpj());
				System.out.println(" O endereco do fornecedor eh "+guitarra.getfornecedor().getEndereco());
				System.out.println(" A quantidade de itens no estoque eh "+guitarra.getestoque().getQtdDeItens());
				System.out.println(" O valor dos itens em estoque eh "+estoque.converteReal(guitarra.getestoque().getValor()));
				System.out.println(" O nome do instrumento eh "+guitarra.getNome());
				System.out.println(" A quantidade de cordas eh "+guitarra.getQtdDeCordas());
				System.out.println(" O tipo da alavanca eh "+guitarra.getTipoDeAlavanca());
				System.out.println(" A quantidade de casas eh "+guitarra.getQtdDeCasas());
				guitarra.tocar();
				
			while (true) {
       			opcao2 = l.entDados("\nDeseja continuar? (s/n)");
       		 	if (opcao2.equals("s")) {
          	  		break;
       		 	} else if (opcao2.equals("n")) {
           			laco = false;
         			break;
       			} else {
       		    	System.out.println("\n Opcao invalida.\n Digite 's' para continuar ou 'n' para sair.");
       			}
   			 }
    		break;

				
			}
			case 2:{
				System.out.println("\nCadastrar Baixo");
				System.out.println("\n == Cadastrar Baixo ==");

				baixo.getfornecedor().setCnpj(Integer.parseInt(l.entDados(" Digite o CNPJ do fornecedor do item")));
				baixo.getfornecedor().setEndereco(l.entDados(" Digite o endereco do fornecedor dos item"));
				baixo.getestoque().setQtdDeItens(Integer.parseInt(l.entDados("\nDigite a quantidade que tem no estoque")));
				baixo.getestoque().setValor(Float.parseFloat(l.entDados(" Digite o valor dos itens em estoque")));

                baixo.setNome("Baixo");
	            
				try{
					baixo.setQtdDeCordas(Integer.parseInt(l.entDados(" Digite a quantidade de cordas"))); 
					}
				catch (AllException qtdInvalida){
					qtdInvalida.QtdDeCordasExPrint();
					baixo = qtdInvalida.QtdDeCordasExTratamento(baixo);
				}	

	            try{
					baixo.setGrossuraDasCordas(Float.parseFloat(l.entDados(" Digite a grossura das cordas"))); 
				}
				catch (AllException grossuraInvalida){
					grossuraInvalida.GrossuraDasCordasExPrint();
					baixo = grossuraInvalida.GrossuraDasCordasExTratamento(baixo);
				}	

				baixo.setQtdDeCaptadores(Integer.parseInt(l.entDados(" Digite a quantidade de captadores")));

				System.out.println("\n O CNPJ do fornecedor eh "+baixo.getfornecedor().getCnpj());
				System.out.println(" O endereco do fornecedor eh "+baixo.getfornecedor().getEndereco());
				System.out.println(" A quantidade de itens no estoque eh "+baixo.getestoque().getQtdDeItens());
				System.out.println(" O valor dos itens em estoque eh "+estoque.converteReal(baixo.getestoque().getValor()));
				System.out.println(" O nome do instrumento eh "+baixo.getNome());
				System.out.println(" A quantidade de cordas eh "+baixo.getQtdDeCordas());
				System.out.println(" A grossura das cordas eh "+baixo.getGrossuraDasCordas());
				System.out.println(" A quantidade de captadores eh "+baixo.getQtdDeCaptadores());
				baixo.tocar();
				
				while (true) {
       			opcao2 = l.entDados("\nDeseja continuar? (s/n)");
       		 	if (opcao2.equals("s")) {
          	  		break;
       		 	} else if (opcao2.equals("n")) {
           			laco = false;
         			break;
       			} else {
       		    	System.out.println("\n Opcao invalida.\n Digite 's' para continuar ou 'n' para sair.");
       			}
   			 }
    		break;

  
			}
			case 3:{
				System.out.println("\n == Cadastrar Bateria ==");
				
				bateria.setNome("Bateria");

	            try{
					bateria.setQtdDeCordas(Integer.parseInt("0")); 
					}
				catch (AllException qtdInvalida){
					qtdInvalida.QtdDeCordasExPrint();
					bateria = qtdInvalida.QtdDeCordasExTratamento(bateria);
				}

				bateria.getfornecedor().setCnpj(Integer.parseInt(l.entDados(" Digite o CNPJ do fornecedor do item")));
				bateria.getfornecedor().setEndereco(l.entDados(" Digite o endereco do fornecedor dos item"));
				bateria.getestoque().setQtdDeItens(Integer.parseInt(l.entDados("\nDigite a quantidade que tem no estoque")));
				bateria.getestoque().setValor(Float.parseFloat(l.entDados(" Digite o valor dos itens em estoque")));
				
				try{
					bateria.setQtdDeTons(Integer.parseInt(l.entDados(" Digite a quantidade de tons"))); 
				}
				catch (AllException qtdInvalidaTons){
					qtdInvalidaTons.QtdDeTonsExPrint();
					bateria = qtdInvalidaTons.QtdDeTonsExTratamento(bateria);
				}	

				bateria.setTipoDeBumbo(l.entDados(" Digite o tipo do bumbo"));

				System.out.println("\n O CNPJ do fornecedor eh "+bateria.getfornecedor().getCnpj());
				System.out.println(" O endereco do fornecedor eh "+bateria.getfornecedor().getEndereco());
				System.out.println(" A quantidade de itens no estoque eh "+bateria.getestoque().getQtdDeItens());
				System.out.println(" O valor dos itens em estoque eh "+estoque.converteReal(bateria.getestoque().getValor()));
				System.out.println(" O nome do instrumento eh "+bateria.getNome());
				System.out.println(" A quantidade de cordas eh "+bateria.getQtdDeCordas());
				System.out.println(" A quantidade de tons eh "+bateria.getQtdDeTons());
				System.out.println(" O tipo de bumbo eh "+bateria.getTipoDeBumbo());
				bateria.tocar();

				while (true) {
       			opcao2 = l.entDados("\nDeseja continuar? (s/n)");
       		 	if (opcao2.equals("s")) {
          	  		break;
       		 	} else if (opcao2.equals("n")) {
           			laco = false;
         			break;
       			} else {
       		    	System.out.println("\n Opcao invalida.\n Digite 's' para continuar ou 'n' para sair.");
       			}
   			 }
    		break;
			}
			case 4:{
				System.out.println("\nEscolheu SAIR");
				laco = false;
				break;
			}
			default:{
				System.out.println("\nO valor deve estar entre 1 e 4");
				break;
			}				

			}	
		}
    }
}
