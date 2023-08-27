package jerarquia_em;
import java.time.LocalDate;
public abstract class Empleado {
    String nombre;
    int edad;
    private LocalDate fechaingreso;
    double salario;
    double bono=150.00;

    public Empleado(String nombre, int edad, LocalDate fechaingreso, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaingreso = fechaingreso;
        this.salario = salario;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(LocalDate fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public abstract void incentivar();
}
