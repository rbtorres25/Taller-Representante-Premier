import java.util.Scanner;



public class EleccionesPremier {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int opcion;
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;

        int costoCandidato1 = 0;
        int costoCandidato2 = 0;
        int costoCandidato3 = 0;

        int INTERNET = 700000;
        int RADIO = 200000;
        int TELEVISION = 600000;

        int candidato;
        int medio;

        System.out.println("Bienvenido al sistema de votación -  Selecciona una opcion:");

        do {
            System.out.println("\n Mesa Votacion");
            System.out.println("1. Ingresar voto");
            System.out.println("2. Calcular costo de campaña");
            System.out.println("3. Vaciar urnas");
            System.out.println("4. Conocer total votos");
            System.out.println("5. Porcentaje votos");
            System.out.println("6. Costo promedio campaña");
            System.out.println("7. Salir del programa");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Votar por el candidato de su eleccion (Candidato 100, Candidato 200, Candidato 300): ");
                    candidato = scanner.nextInt();

                    System.out.print("Ingrese el medio publicitario (Seleciona la opcion 1: Internet, 2: Radio, 3: Television): ");
                    medio = scanner.nextInt();

                    switch (candidato) {
                        case 1 -> {
                            votosCandidato1++;
                            costoCandidato1 += (medio == 1) ? INTERNET : (medio == 2) ? RADIO : (medio == 3) ? TELEVISION : 0;
                        }
                        case 2 -> {
                            votosCandidato2++;
                            costoCandidato2 += (medio == 1) ? INTERNET : (medio == 2) ? RADIO : (medio == 3) ? TELEVISION : 0;
                        }
                        case 3 -> {
                            votosCandidato3++;
                            costoCandidato3 += (medio == 1) ? INTERNET : (medio == 2) ? RADIO : (medio == 3) ? TELEVISION : 0;
                        }
                        default -> System.out.println("Candidato o Medio no valido.");
                    }
                }
                case 2 -> {
                    System.out.println("Costo campaña candidato 1: $" + costoCandidato1);
                    System.out.println("Costo campaña candidato 2: $" + costoCandidato2);
                    System.out.println("Costo campaña candidato 3: $" + costoCandidato3);
                }
                case 3 -> {
                    votosCandidato1 = votosCandidato2 = votosCandidato3 = 0;
                    costoCandidato1 = costoCandidato2 = costoCandidato3 = 0;
                    System.out.println("Las urnas han sido vaciadas.");
                }
                case 4 -> {
                    int totalVotos = votosCandidato1 + votosCandidato2 + votosCandidato3;
                    System.out.println("Total de votos: " + totalVotos);
                }
                case 5 -> {
                    int totalVotos = votosCandidato1 + votosCandidato2 + votosCandidato3;
                    if (totalVotos > 0) {
                        System.out.println("Candidato 1: " + (votosCandidato1 * 100.0 / totalVotos) + "%");
                        System.out.println("Candidato 2: " + (votosCandidato2 * 100.0 / totalVotos) + "%");
                        System.out.println("Candidato 3: " + (votosCandidato3 * 100.0 / totalVotos) + "%");
                    } else {
                        System.out.println("No hay votos registrados.");
                    }
                }
                case 6 -> {
                    int totalVotos = votosCandidato1 + votosCandidato2 + votosCandidato3;
                    int totalCosto = costoCandidato1 + costoCandidato2 + costoCandidato3;
                    if (totalVotos > 0) {
                        System.out.println("Costo promedio por voto: $" + (totalCosto / totalVotos));
                    } else {
                        System.out.println("No hay votos para calcular el costo promedio.");
                    }
                }
                case 7 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}
