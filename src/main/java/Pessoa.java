public class Pessoa {
    public String nome;
    public int cpf;

    Endereco[] enderecos = new Endereco[10];

    public Pessoa(String nome, int cpf, int qntEnd) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void addEndereco(Endereco end){
        for (int i = 0; i < enderecos.length; i++) {
            if(enderecos[i] == null){
                enderecos[i] = end;
                i = enderecos.length;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Nome da pessoa: " + nome);
        System.out.println("CPF: " + cpf);
        for (int i = 0; i < enderecos.length; i++) {
            if (enderecos[i] != null){
                System.out.println("Bairro: " + enderecos[i].bairro);
                System.out.println("Rua: " + enderecos[i].rua);
                System.out.println("Numero: " + enderecos[i].num);
            }

        }
    }
}
