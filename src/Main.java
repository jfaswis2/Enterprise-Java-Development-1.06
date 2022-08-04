import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Employee pasante1 = new Pasante(58,"Alex","Rodriguez","Desarrollador Mobile Junior", 25000);
        Employee pasante2 = new Pasante(23,"Jhon","Aristizabal","Desarrollador Back-end Junior", 17000);
        Employee pasante3 = new Pasante(53,"Alejandra","Ortiz","Desarrollador Mobile Junior", 15000);
        Employee pasante4 = new Pasante(51,"Raul","Sanchez","Desarrollador Front-end Junior", 12000);
        Employee pasante5 = new Pasante(57,"Jhonatan","Echeverry","Desarrollador Front-end Junior", 36000);
        Employee employee1 = new Employee(25,"Lucía", "Vásquez", "Desarrrollador Back-end Senior", 45000);
        Employee employee2 = new Employee(26,"Nancy", "Insuasty", "Desarrrollador Mobile Senior", 35000);
        Employee employee3 = new Employee(27,"Jose", "Aristizabal", "Desarrrollador Mobile Senior", 48000);
        Employee employee4 = new Employee(28,"Rosa", "Marin", "Desarrrollador Front-end Senior", 32000);
        Employee employee5 = new Employee(29,"Marcos", "Alonso", "Desarrrollador Back-end Senior", 30000);

        Employee[] employees = {pasante1,pasante2,pasante3,pasante4,pasante5,employee1,employee2,employee3,employee4,employee5};

        empleadosTxt(employees);
    }

    public static void empleadosTxt(Employee[] employeeList) throws IOException {
        FileWriter fileWriter = new FileWriter("employees.txt");
        for (Employee employee:employeeList) {
            fileWriter.write("Id: " + employee.getId() + "\n"
                    + "Nombre: " + employee.getNombre() + "\n"
                    + "Apellidos: " + employee.getApellidos() + "\n"
                    + "Puesto: " + employee.getPuesto() + "\n"
                    + "Salario: " + employee.getSalario()+ "\n\n==================\n\n");
        }
        fileWriter.close();
    }
}