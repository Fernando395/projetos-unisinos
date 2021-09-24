public class TesteFun4Study {

    public static void main(String[] args) {

        Cidade cidade1 = new Cidade(0,"","");
        cidade1.CadastraNovaCidade();

        Cidade cidade2 = new Cidade(0,"","");
        cidade2.CadastraNovaCidade();

        Estudante estudante1 = new Estudante(0,"","","","",cidade1);
        estudante1.CadastraNovoEstudante();
        estudante1.atualizaSenha();

        Estudante estudante2 = new Estudante(0,"","","","",cidade1);
        estudante2.CadastraNovoEstudante();
        estudante2.atualizaSenha();

        Estudante estudante3 = new Estudante(0,"","","","",cidade2);
        estudante3.CadastraNovoEstudante();
        estudante3.atualizaSenha();

        Estudante estudante4 = new Estudante(0,"","","","",cidade2);
        estudante4.CadastraNovoEstudante();
        estudante4.atualizaSenha();

        cidade1.exibeDados();
        cidade2.exibeDados();
        estudante1.exibeDados();
        estudante2.exibeDados();
        estudante3.exibeDados();
        estudante4.exibeDados();
    }
}
