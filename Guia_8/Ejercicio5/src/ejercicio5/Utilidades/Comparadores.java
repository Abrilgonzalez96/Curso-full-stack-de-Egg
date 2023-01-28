
package ejercicio5.Utilidades;

import ejercicio5.Ejercicio5;
import java.util.Objects;

public class Comparadores {
    Ejercicio5 e = new Ejercicio5();

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.e);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Comparadores other = (Comparadores) obj;
        if (!Objects.equals(this.e, other.e)) {
            return false;
        }
        return true;
    }

}
