import java.util.Scanner;

public class mainInc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso = 0.0, altura= 0.0, imc = 0.0;
        String res =" ", nome = " ";

        System.out.println("-----------------------------------------");
        System.out.println(" programa para calcular o IMC do paciente");
        System.out.println("-----------------------------------------\n\n");

        System.out.println(" Digite o nome do paciente: ");
        nome = sc.nextLine();
        System.out.println(" Digite o peso do paciente: ");
        peso = sc.nextDouble();
        System.out.println(" Digite a altura do paciente: ");
        altura = sc.nextDouble();

        imc = Imc.calcularImc(peso, altura);
        res = Imc.classificarImc(imc);

        System.out.printf(" O paciente %s tem o IMC = %.2f \n" , nome, imc);
        System.out.printf(" A classificação do IMC é : %s \n", res);

        sc.close();
    }
}
