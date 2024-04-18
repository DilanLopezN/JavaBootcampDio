public class JavaSintaxe {
    // tipos de dados básicos(primitivos)
    int integerType;//  <- mais usado
    long longType; // finaliza com L
    // pontos flutuantes
    float floatType; // finaliza com F
    double doubleType; //  <- mais usado
    // pontos flutuantes //
    boolean booleanType;

    // Declaração de variavéis
    // tipo, nome, atribuição
    int age = 23;
    double minimumWage = 1423.00;

    // váriaveis acima, constantes(imutavéis - final)
    final int PERCENTUAL_TAX = 15;

    

    // métodos(funções)
    public static int sumNumber(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static void printName(String name) {
     System.out.println(name);
    }
}
