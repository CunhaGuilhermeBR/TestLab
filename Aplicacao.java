import java.util.Scanner;

public class Aplicacao {
   public static void main(String[] args){
   Scanner ler = new Scanner(System.in);
  
   Programa p = new Programa();
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
       switch (escolha) {
       case 1:  p.cadastrarMorador();
       break;
       case 2:  p.imprimirCadastrados();
       break;
       case 3:  p.imprimirEspera();
       break;
       case 4:  p.pesquisarMorador();
       break;
       case 5:  p.excluirMorador();
       break;
       case 6:  p.sorteio();
       break;
       case 7:  p.parametros();
       break;
       default: System.out.println("Opção inválida");
       break;
       }
       
   } while (escolha !=8);
   ler.close();
   }
}
