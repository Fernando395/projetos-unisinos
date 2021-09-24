import java.util.Scanner;

public class Cidade {
    private int codigo;
    private String descricao;
    private String uf;
    private int quantidadeDeEstudantes;

    Scanner teclado = new Scanner(System.in);

    public Cidade(int codigo, String descricao, String uf) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.uf = uf;
    }

    public void CadastraNovaCidade(){
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Cadastre a Cidade");
        System.out.print("Digite seu código: ");
        this.codigo = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Digite a descrição: ");
        this.descricao = teclado.nextLine();
        System.out.print("Digite a UF: ");
        this.uf = teclado.nextLine();
        System.out.println("Cidade Cadastrada com sucesso.");
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUf() {
        return uf;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void adicionaNovoEstudante(){
        quantidadeDeEstudantes++;
    }

    public void exibeDados(){
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Dados da cidade");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("UF: " + getUf());
        System.out.println("Quantidades de Estudantes desta Cidade: " + quantidadeDeEstudantes);
    }
}
