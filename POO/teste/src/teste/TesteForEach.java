package teste;

public class TesteForEach {
    public static void main(String[] args) {

        int anos []= {2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023, 2024};
        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                                           "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        for (int ano : anos) {
            System.out.println(" \n Lista do ano de " + ano);
            for (String mes : meses) {
                System.out.println("Essa é a lista do mês: " + mes);
            }
        }
    }
}