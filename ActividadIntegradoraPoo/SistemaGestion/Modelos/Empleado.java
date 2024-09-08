package ActividadIntegradoraPoo.SistemaGestion.Modelos;

public class Empleado {
 
    private String nombre;
    private Integer edad;
    private Integer salario;
    private String departamento;

    public Empleado() {
        
    }
    public Empleado(String nombre, Integer edad, Integer salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public Integer getSalario() {
        return salario;
    }
    public void setSalario(Integer salario) {
        this.salario = salario;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
         
}
