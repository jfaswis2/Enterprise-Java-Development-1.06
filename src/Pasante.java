public class Pasante extends Employee {
    private final double LIMITE_SALARIAL_BECARIOS = 20000;

    public Pasante(int id, String nombre, String apellido, String puesto, double salario) {
        super(id,nombre,apellido,puesto,salario);
    }

    @Override
    public void setSalario(double salario){
        salario = salario > LIMITE_SALARIAL_BECARIOS ? LIMITE_SALARIAL_BECARIOS : salario;
        super.setSalario(salario);
    }
}
