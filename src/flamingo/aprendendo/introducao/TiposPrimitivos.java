package flamingo.aprendendo.introducao;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // byte : -128 a 127
        // short : -32.768 a 32.767
        // int : -2 bilhões a 2 bilhões
        // float: Precisão simples (usa um f no final, ex: 5.5f).
        // double: Precisão dupla, sendo o padrão para decimais no java.
        // Char : Guarda uma uníca letra ou simbolo em formato Unicode (ex: 'A').
        // boolean: Guarda apenas dois valores: true (verdadeiro) ou false (falso).
        byte idade = 27;
        int municipio = 114000000;
        long contaBancaria = 9999999999999999L;
        float salario = 15000.66f;
        double salarioExtra = 25000.50;
        char primeiraLetraDoNome = 'R';
        boolean vaiEstudarNasFerias = false;
        System.out.println(vaiEstudarNasFerias);
        System.out.println("Primeira letra do meu nome é " + primeiraLetraDoNome);
        System.out.println("PL caiu = " + salarioExtra);
        System.out.println("meu salario depois de estudar com bigas é" + salario);
        System.out.println("Minha idade é " + idade);
        System.out.println("São Paulo (SP): Mais de " + municipio + " milhões de moradores.");
        System.out.println("Minha conta bancaria daqui a 5 anos " + contaBancaria);
    }
}
