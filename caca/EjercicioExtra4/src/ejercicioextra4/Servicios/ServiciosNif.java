package ejercicioextra4.Servicios;

import ejercicioextra4.Entidades.Nif;
import java.util.Scanner;

public class ServiciosNif {

    Scanner leer = new Scanner(System.in);
    Nif n = new Nif();

    public Nif crearNif() {
        System.out.println("Ingrese su DNI");
        int dni;
        int cont = 0;
        dni = leer.nextInt();
        int aux = dni;
        boolean log = false;
        do {
            aux /= 10;
            cont++;
            if (cont < 8 && aux < 9) {
                log = true;
            } else if (cont >= 8) {
                System.out.println("DNI incorrecto, ingrease nuevamente");
                dni = leer.nextInt();
                aux = dni;
                cont = 0;
            }
        } while (log == false);

        n.setDNI(dni);
        int numLetra = dni % 23;
        String letra = calcularLetra(numLetra);
        n.setLetra(letra);
        Nif ns = new Nif(dni, letra);

        return ns;
    }

    public String calcularLetra(int num) {
        String letra = "";
        String[][] tabla = {{"0", "T"}, {"1", "R"}, {"2", "W"}, {"3", "A"}, {"4", "G"}, {"5", "M"}, {"6", "Y"}, {"7", "F"}, {"8", "P"}, {"9", "D"}, {"10", "X"}, {"11", "B"}, {"12", "N"}, {"13", "J"}, {"14", "Z"}, {"15", "S"}, {"16", "Q"}, {"17", "V"}, {"18", "H"}, {"19", "L"}, {"20", "C"}, {"21", "K"}, {"22", "E"}};
        for (int i = 0; i < 23; i++) {
            for (int j = 0; j < 2; j++) {
                if (tabla[i][j].equals(String.valueOf(num))) {
                    letra = tabla[i][j + 1];
                    break;
                }

            }

        }
        return letra;
    }

    public void mostar(Nif n) {
        System.out.println(n.getDNI() + "-" + n.getLetra());
    }
}
