package PooAvanzado.Excepciones.PalabraClave.Modelos;

public class PalabraClave {

    private String dato;

    public PalabraClave() {
    }

    public PalabraClave(String dato) {
        this.dato = dato;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public boolean ingresarPalabraClave(String clave) {
        try {
            verificar8Letras(clave);
            verificar4Digitos(clave);
            verificarLetraZ(clave);
            return true;
        } catch (LongitudInvalidaException | DigitosIncompletosException | LetraIncompletaException e) {
            System.out.println("Error al generar tu Clave !!! : " + e.getMessage());
            return false;
        }
    }

    public void verificar8Letras(String clave) throws LongitudInvalidaException {
        if (clave.length() < 8) {
            throw new LongitudInvalidaException("La palabra clave tiene menos de 8 caracteres.");
        }
    }

    public void verificar4Digitos(String clave) throws DigitosIncompletosException {
        // Contar dígitos
        int contadorDigitos = 0;
        for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);
            if (Character.isDigit(c)) {
                contadorDigitos++;
            }
        }
        // Verificar si tiene exactamente 4 dígitos
        if (contadorDigitos < 4) {
            throw new DigitosIncompletosException("La palabra clave debe contener exactamente 4 dígitos.");
        }
    }

    public void verificarLetraZ(String clave) throws LetraIncompletaException {
        boolean contieneZ = false;
        for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);
            if (c == 'z') {
                contieneZ = true;
            }
        }
        // Verificar si contiene la letra 'z'
        if (!contieneZ) {
            throw new LetraIncompletaException("La palabra clave debe contener la letra 'z'.");
        }
    }
}
