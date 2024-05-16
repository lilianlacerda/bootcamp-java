public class ExemploForEach {
    public static void main(String[] args) {

        //Usado mais quando usamos arrays. 
        String alunos[] = {"LILIAN",  "CAROL", "HANA", "ADRIANA"};

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: "+aluno);
        }
    }
}
