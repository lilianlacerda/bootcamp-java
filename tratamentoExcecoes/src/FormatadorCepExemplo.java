public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2375064");
            System.out.println(cepFormatado);

        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O CEP não corresponde as regras de negócio");
        }
        
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }

        //Simulando um cep formatado;
        return "23.765-064";
    }
}
