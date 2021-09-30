import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int cpf;
        int qntEnd;

        nome = sc.nextLine();
        cpf = sc.nextInt();
        qntEnd = sc.nextInt();

        sc.nextLine();

        Pessoa p1 = new Pessoa(nome, cpf, qntEnd);
        for (int i = 0; i < qntEnd; i++) {
            String bairro;
            String rua;
            int num;

            bairro = sc.nextLine();
            rua = sc.nextLine();
            num = sc.nextInt();
            sc.nextLine();

            Endereco E1 = new Endereco(bairro, rua, num);
            p1.addEndereco(E1);
        }

        p1.mostraInfo();
    }
}
