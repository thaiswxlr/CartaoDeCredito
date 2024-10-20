import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CartaoDeCredito c = new CartaoDeCredito();
        c.cpf = "12312352636";
        c.limite = 100;
        System.out.println(c.consultarLimite());
        System.out.println(c.consultarTotalFatura());
        c.realizarCompra(200);
        System.out.println(c.consultarTotalFatura());

        try (Scanner sc = new Scanner(System.in)) {
            int opcao = 1;
            
            do{
            System.out.println("1- Consultar Limite");
            System.out.println("2- Consultar Fatura");
            System.out.println("3- Consultar compra");
            System.out.println("0 - Sair");
            
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                System.out.println(c.consultarLimite());              
                    break;
                case 2:
                System.out.println(c.consultarTotalFatura());
                    break;
                case 3: 
                System.out.println("Digite o valor da compra:");
                double valor = sc.nextDouble();
                c.realizarCompra(valor);
                    break;
                default:
                System.out.println();
                    break;
            }



   } while (opcao != 0);
        }

}
}
