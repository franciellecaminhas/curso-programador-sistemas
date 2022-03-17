package RevisaoExercicios;
import java.util.Scanner;
public class Banco_POO {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Conta c1 = new Conta(100.0f, 123456);
        float valor;       
        int opcao;
        
        while(true){       
        System.out.println("\n\nSeleciona a opção desejada: ");
        System.out.println("""
                           
                           1 - Deposito 
                           2 - Saque
                           3 - Saldo
                           4 - Sair
                            >>""");
        opcao = input.nextInt();
        
        if(opcao == 4) break;
        
        switch(opcao){
            case 1 -> { 
                System.out.println("Digite o valor a ser depositado: " );
                valor = input.nextFloat();
                c1.Credita(valor);
                }
            case 2 -> {
                System.out.println("Digite o valor a ser sacado: " );
                valor = input.nextFloat();
                c1.Credita(valor);
                }
            case 3 -> System.out.println("\nSaldo:" + c1.ConsultaSaldo());
            default -> {
                }
                //System.out.println("OpÃ§Ã£o nÃ£o existente! Tente novamente ..." );     
        }
            //System.out.println("OpÃ§Ã£o nÃ£o existente! Tente novamente ..." );
                }
  }  
} 
