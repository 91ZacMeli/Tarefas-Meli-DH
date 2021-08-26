package excecoes;

public class ExcecoesMain {
    public static void main(String[] args) {

        PraticaExcecoes divisao =  new PraticaExcecoes();

        try {
            divisao.calcularQuociente(divisao.getB(), divisao.getA());
        }catch (ArithmeticException exception){
            System.out.println("_________________________________________________");
            System.out.println("Ocorreu Um Erro !! ");
        }finally {
            System.out.println("_________________________________________________");
            System.out.println("Programa Finalizado.");
            System.out.println("_________________________________________________");
        }

    }
}
