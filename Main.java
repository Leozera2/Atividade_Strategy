public class Main {
    public static void main(String[] args) throws Exception {
        
        Disciplina d = new Disciplina();
        Aritmetica a = new Aritmetica();
        Geometrica g = new Geometrica();

        d.setNome("Leonardo");
        d.setP1(6);
        d.setP2(7);
        d.setCalcMedia(a); //seta o tipo de operação a ser feita


        //saida console
        System.out.println("Nome: " + d.getNome());
        System.out.println("P1: " + d.getP1());
        System.out.println("P1: " + d.getP2());
        System.out.println("Media: " + d.CalculaMedia());
        System.out.println("Status: " + d.getSituacao());

    }
}
