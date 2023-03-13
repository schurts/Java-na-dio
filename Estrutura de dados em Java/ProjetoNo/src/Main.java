public class Main {
    
    private static String conteudo;

    public static void main(String[] args) {


        No no1 = new No( conteudo "Conteúdo no1" );

        No no2 = new No( conteudo "Conteúdo no2" );
        no1.setProximoNo(no2);

        No no3 = new No( conteudo "Conteúdo no3" );
        no2.setProximoNo(no3);

        No no4 = new No( conteudo "Conteúdo no4" );
        no3.setProximoNo(no4);

        System.out.println(no1);

        
    }
}
