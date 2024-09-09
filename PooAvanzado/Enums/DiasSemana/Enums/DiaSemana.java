package PooAvanzado.Enums.DiasSemana.Enums;

public enum DiaSemana {    
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
    
    //Metodo
    public boolean esDiaLaboral(){
        return this != SABADO && this != DOMINGO;
    }
}
