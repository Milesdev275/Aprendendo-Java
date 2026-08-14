package flamingo.aprendendo.basico;

public class OperadoresParte03 {
    static void main(String [] args) {
        /*
        && AND -> E
        || OR -> OU
        ! NOT -> NÃO
         */

        byte idade = 16;
        boolean isCNH = true;

        boolean isEstaNaLeiParaDirigir = idade >= 18 && isCNH == true;
        System.out.println(isEstaNaLeiParaDirigir);
    }
}
