import java.util.ArrayList;
import java.util.Scanner;

public class TesteFun4Study {

    private ArrayList<Cidade> cidades = new ArrayList<>();
    private ArrayList<Estudante> estudantes = new ArrayList<>();


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        TesteFun4Study testeFun4Study = new TesteFun4Study();

        System.out.println("Adicione uma nova Cidade e no mínimo 4 Estudantes.");
        int escolha1 = 1;
        int contador1 = 0;
        while (escolha1 == 1) {
            Cidade cidade = new Cidade(0, "", "");
            cidade.CadastraNovaCidade();
            cidade.exibeDados();

            testeFun4Study.cidades.add(contador1, cidade);
            contador1++;

            int escolha2 = 1;
            int contador2 = 0;
            while (escolha2 == 1) {
                Estudante estudante = new Estudante(0, "", "", "", "", testeFun4Study.cidades.get(contador1-1));
                estudante.CadastraNovoEstudante();
                estudante.atualizaCadastro();
                estudante.atualizaSenha();

                testeFun4Study.estudantes.add(contador2, estudante);
                contador2++;

                System.out.println("Digite 1 para adicionar um novo Estudante ou 0 Para parar de adicionar Estudantes.");
                escolha2 = input.nextInt();
                if (contador2 < 4 && escolha2 == 0){
                    System.out.println("ERRO, o numero mínimo de estudantes cadastrados é 4");
                    escolha2 = 1;
                }
                if (contador2 >= 4 && escolha2 == 0){
                }

            }
            System.out.println("Digite 1 para adicionar uma nova Cidade e no mínimo mais 4 Estudantes ou 0 Para parar de adicionar Cidades e Estudantes.");
            escolha1 = input.nextInt();
        }
    }
}