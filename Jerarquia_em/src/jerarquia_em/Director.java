package jerarquia_em;
import java.time.LocalDate;
public class Director extends Empleado {
    String departamento;
    int personal;

    public Director(String nombre, int edad, LocalDate fechaingreso, double salario,String departamento,int personal) {
        super(nombre, edad, fechaingreso, salario);
        this.departamento=departamento;
        this.personal=personal;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getPersonal() {
        return personal;
    }

    public void setPersonal(int personal) {
        this.personal = personal;
    }
    @Override
    public void incentivar() {
        if (getFechaingreso().plusMonths(30).isBefore(LocalDate.now()) && getPersonal() > 20) {
            double newsalario = getSalario() + (2 * bono);
            setSalario(newsalario);
        } else if (getFechaingreso().plusMonths(30).isBefore(LocalDate.now())
                || getPersonal() > 20) {
            double newsalario = getSalario() + bono;
            setSalario(newsalario);
        }
    }
    
}
