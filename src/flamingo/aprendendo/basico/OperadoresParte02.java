package flamingo.aprendendo.basico;

import java.sql.SQLOutput;

public class OperadoresParte02 {

        /*
        < menor que
        > maior que
        <= menor ou igual
        >= maior ou igual
        == igual a
        != diferente de
         */
        static void main(String[] args) {
        System.out.println("Operadores pt02");
            System.out.println(10 < 20);
            System.out.println(20 > 12);
            System.out.println(1 != 1);
            System.out.println(25 >= 70);
            System.out.println(85 == 1000);

            byte idadeMae = 42;
            byte idadePai = 60;
            byte idadeTia = 42;

            System.out.println(idadeMae < idadeTia);

    }
}
