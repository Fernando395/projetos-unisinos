import java.util.Scanner;

public class Estudante {
    private int codigo;
    private String nome;
    private String dataDeNascimento;
    private String email;
    private String senha;
    private Cidade cidade;

    Scanner teclado = new Scanner(System.in);

    public Estudante(int codigo, String nome, String dataDeNascimento, String email, String senha, Cidade cidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.email = email;
        this.senha = senha;
        this.cidade = cidade;
        cidade.adicionaNovoEstudante();
    }

    public void CadastraNovoEstudante(){
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Cadastre o Estudante");
        System.out.print("Digite seu código: ");
        this.codigo = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Digite seu Nome: ");
        this.nome = teclado.nextLine();
        System.out.print("Digite sua data de nascimento: ");
        this.dataDeNascimento = teclado.nextLine();
        System.out.print("Digite seu email: ");
        this.email = teclado.nextLine();
        System.out.print("Digite sua senha: ");
        this.senha = teclado.nextLine();
        System.out.println("Estudante cadastrado com sucesso.");
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public void exibeDados() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Dados do Estudante cadastrado");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Data de Nascimento: " + getDataDeNascimento());
        System.out.println("Email: " + getEmail());
        System.out.println("Senha: " + getSenha());
        System.out.println("Cidade: " + getCidade().getDescricao());
    }

    public void atualizaSenha() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Atualização de senha necessária");
        System.out.print("Digite a Senha atual: ");
        String senhaAtual = teclado.nextLine();
        while (!getSenha().equals(senhaAtual)) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Senha Atual Invalida");
            System.out.print("Digite a Senha atual: ");
            senhaAtual = teclado.nextLine();
        }

        System.out.print("Digite a Nova Senha: ");
        String novaSenha = teclado.nextLine();

        System.out.print("Repita Nova Senha: ");
        String novaSenhaRepetida = teclado.nextLine();

        while (!novaSenha.equals(novaSenhaRepetida)) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Os campos -Nova senha- e -Repita Nova Senha- não coincidem.");
            System.out.print("Digite a Nova Senha: ");
            novaSenha = teclado.next();

            System.out.print("Repita Nova Senha: ");
            novaSenhaRepetida = teclado.next();
        }

        System.out.println("Senha Atualizada Com Sucesso");
        setSenha(novaSenha);
    }
}


