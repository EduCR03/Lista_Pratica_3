import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int cpf;
        int qntEnd;

        System.out.println("Entre com seus dados pessoais");
        System.out.println("Digite o nome: ");
        nome = sc.nextLine();
        System.out.println("Digite seu CPF: ");
        cpf = sc.nextInt();
        System.out.println("Quantos enderecos o(a) senhor(a) tem: ");
        qntEnd = sc.nextInt();

        sc.nextLine();

        Pessoa p1 = new Pessoa(nome, cpf, qntEnd);
        System.out.println("Entre com os dados de seu(s) endereco(s)");
        for (int i = 0; i < qntEnd; i++) {
            String bairro;
            String rua;
            int num;
            System.out.println("Endereco " + (i+1));
            System.out.println("Bairro: ");
            bairro = sc.nextLine();
            System.out.println("Rua: ");
            rua = sc.nextLine();
            System.out.println("Numero: ");
            num = sc.nextInt();
            sc.nextLine();

            Endereco E1 = new Endereco(bairro, rua, num);
            p1.addEndereco(E1);
        }

        p1.mostraInfo();
    }
}
