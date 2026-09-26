public class Main {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Gerente("Marcos", 8000);
        Funcionario funcionario2 = new Desenvolvedor("Ana", 5000);

        funcionario1.mostrarDados();
        System.out.println("Bônus: " + funcionario1.calcularBonus());

        System.out.println();

        funcionario2.mostrarDados();
        System.out.println("Bônus: " + funcionario2.calcularBonus());
    }
}
