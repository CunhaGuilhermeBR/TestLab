
public class Programa {
	   CFila F1 = new CFila();
	   CFila F2 = new CFila();
	   CFila espera = new CFila();
	   CDicionario cadastro = new CDicionario();
	   public static int QUANT=0;
	
	   public void cadastrarMorador() {
		   System.out.println("Quantidade:" + QUANT);
		   Morador m = new Morador();
		   QUANT++;
	    	cadastro.adiciona(QUANT,m.toString());
	    	System.out.println("Quantidade:" + QUANT);
	}

	public void imprimirCadastrados() {
		cadastro.imprimeCDicionario();
		
	}

	public void imprimirEspera() {
		// TODO Auto-generated method stub
		
	}

	public void pesquisarMorador() {
		// TODO Auto-generated method stub
		
	}

	public void excluirMorador() {
		// TODO Auto-generated method stub
		
	}

	public void sorteio() {
		// TODO Auto-generated method stub
		
	}

	public void parametros() {
		// TODO Auto-generated method stub
		
	}

}
