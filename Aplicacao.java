import javax.swing.Scanner;

public class Aplicacao {
   public static void main(String[] args){
   CFila F1 = new CFila();
   CFila F2 = new CFila();
   int escolha =0;
   
   do{
       System.out.println("1 - Cadastrar morador");
       System.out.println("2 - Imprimir lista de moradores cadastrados");
       System.out.println("3 - Imprimir fila de espera");
       System.out.println("4 - Pesquisar morador");
       System.out.println("5 - Desistência/Exclusão");
       System.out.println("6 - Sorteio");
       System.out.println("7 - Parâmetros");
       System.out.println("8 - Sair");
       escolha=ler.nextInt();
   } while (escolha !=8);
   
   }
}
