import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

  public static void main(String[] args) {
    selecaoCandidatos();
  }

  static void selecaoCandidatos() {
    String[] candidatos = {
      "João", "Maria", "Pedro", "Ana", "Lucas", "Juliana", "Carlos", "Mariana",
      "Fernando", "Patrícia", "Gustavo", "Camila", "Rafael", "Laura", "Rodrigo",
      "Isabela", "Diego", "Natália", "Felipe", "Carolina"
  };

  int candidatosSelecionados = 0;
  int candidatosAtual = 0;
  double salarioBase = 2000.0;

      while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length ) {
        String candidato = candidatos[candidatosAtual];
        double salarioPretendido = valorPretendido();

          System.out.println(candidato + " Solicitou este valor " + salarioPretendido);

        if(salarioBase >= salarioPretendido) {
          System.out.println(candidato + " foi seleccionado");
          candidatosSelecionados++;
        }

          candidatosAtual++;

      }   

  }

  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800,2200);
  }


  static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;

    if(salarioBase > salarioPretendido) {
      System.out.println("Ligar para o candidato");
    } else if (salarioBase == salarioPretendido) {
      System.out.println("Aguardando demais candidatos");
    } else {
      System.out.println("Dispensar candidato");
    }
  
  }

}