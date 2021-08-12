import java.util.Scanner;

public class Register {
    private String name;
    private int age;
    private String sex;
    private String rg;
    private String cpf;
    private String city;
    private String state;
    private String cep;
    private String monthlyIncome;
    private String email;
    private String accountType;
    private boolean accountCreate;

    Scanner input = new Scanner(System.in);

    public void enterTheData() {
        System.out.print("Nome:");
        name = input.nextLine();
        System.out.print("Idade:");
        age = input.nextInt();
        input.nextLine();
        System.out.print("Sexo:");
        sex = input.nextLine();
        System.out.print("RG:");
        rg = input.nextLine();
        System.out.print("CPF:");
        cpf = input.nextLine();
        System.out.print("Cidade:");
        city = input.nextLine();
        System.out.print("Estado:");
        state = input.nextLine();
        System.out.print("CEP:");
        cep = input.nextLine();
        System.out.print("Renda mensal:");
        monthlyIncome = input.nextLine();
        System.out.print("Email:");
        email = input.nextLine();
    }

    public void accountChoice() {
        while (!accountCreate) {
            System.out.println("Digite 1 Para criar uma conta corrente ou 2 para criar uma conta poupança.");
            int choice = input.nextInt();
            if (choice == 1) {
                accountType = "Conta Corrente";
                accountCreate = true;
                accountCreatedSuccessfully();
            } else if (choice == 2) {
                accountType = "Conta Poupança";
                accountCreate = true;
                accountCreatedSuccessfully();
            } else {
                System.out.println("Tipo de conta Invalido.");
                accountCreate = false;
            }
        }
    }

    public void accountCreatedSuccessfully() {
        System.out.println("Conta criada com sucesso.");
        System.out.println("Nome: " + name + "\nIdade: " + age + "\nSexo: " + sex + "\nRG: " + rg + "\nCPF: " + cpf + "\nEstado: " + state + "\nCidade: " + city + "\nCEP: " + cep + "\nRenda mensal: " + monthlyIncome + "\nEmail: " + email + "\nTipo de conta: " + accountType);
    }
}