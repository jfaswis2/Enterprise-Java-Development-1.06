public class Employee {
    private int id;
    private String nombre;
    private String apellidos;
    private String puesto;
    private double salario;

    public Employee(int id, String nombre, String apellidos, String puesto, double salario) {
        setId(id);
        setNombre(nombre);
        setApellidos(apellidos);
        setPuesto(puesto);
        setSalario(salario);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
