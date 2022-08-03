public class Pasante extends Employee {
    private final double LIMITE_SALARIAL_BECARIOS = 20000;
    private double salario;

    public Pasante(int id, String nombre, String apellido, String puesto, double salario) {
        super(id,nombre,apellido,puesto);
        setSalario(salario);
    }

    @Override
    public void setSalario(double salario){
        if (salario>LIMITE_SALARIAL_BECARIOS){
            this.salario = LIMITE_SALARIAL_BECARIOS;
        } else {
            this.salario = salario;
        }
    }

    @Override
    public double getSalario(){
        return salario;
    }
}
