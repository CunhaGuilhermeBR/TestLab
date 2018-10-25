public class Morador {
      public int cpf, dependentes,tel;
      public String nome, endereço;
      public double renda;
      
      public Morador(int cpf, int dependentes, int tel, String nome, String endereço, double renda) {
		this.cpf = cpf;
		this.dependentes = dependentes;
		this.tel = tel;
		this.nome = nome;
		this.endereço = endereço;
		this.renda = renda;
	}
      
      public Morador() {
    	  Scanner ler = new Scanner(System.in);
    	  System.out.println("Qual nome do morador?");
    	  this.nome=ler.nextLine();
    	  System.out.println("Quantos dependentes o morador tem?");
    	  this.dependentes= ler.nextInt();
    	  System.out.println("Qual telefone do morador?");
    	  this.tel= ler.nextInt();
    	  System.out.println("Qual CPF do morador?");
    	  this.cpf= ler.nextInt();
    	  System.out.println("Qual a renda do morador?");
    	  this.renda=ler.nextDouble();
    	  System.out.println("Qual endereço do morador?");
    	  ler.nextLine();
    	  this.endereço=ler.nextLine();
      }
      
      public String toString() {
    	  return "CPF:" + this.cpf + " Nome:"+ this.nome + " Renda:" + this.renda ;
    	  }
}
