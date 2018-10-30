

import java.util.Scanner;

public class Programa {
	   CFila F1 = new CFila();
	   CFila F2 = new CFila();
	   CFila espera = new CFila();
	   CDicionario cadastro = new CDicionario();
	   public static int QUANT=0;
	
	   public void cadastrarMorador() {
		   Morador m = new Morador();
		   QUANT++;
	    	cadastro.adiciona(QUANT,m);
	}

	public void imprimirCadastrados() {
		int i=0;
		Scanner ler = new Scanner(System.in);
		do{
			System.out.println(" 1  –Listagem  simples  (apenas  CPFe  nome  do  morador)\n2  –Listagem  completa  (todos  os  dados)");
		    i=ler.nextInt();
		    if(i==1){
		    	System.out.println("Listagem de moradorares (Página 1)");
				System.out.println("==================================");
				cadastro.imprimeCDicionario(1);
		    }
		    else if(i==2){
		    	System.out.println("Listagem de moradorares (Página 1)");
				System.out.println("==================================");
				cadastro.imprimeCDicionario(2);
		    }
		} while (i!= 1 && i!=2);
		
	}

	public void imprimirEspera() {
		Morador m = new Morador();
		espera.enfileira(m);
		Morador m1 = new Morador();
		espera.enfileira(m);
		Morador m2 = new Morador();
		espera.enfileira(m);
		espera.imprimeCFila();
		
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

