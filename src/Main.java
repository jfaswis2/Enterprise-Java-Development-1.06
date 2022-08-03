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
        Employee employee1 = new Employee(25,"Lucía", "Vásquez", "Desarrrollador Front-end", 45000);
        Employee employee2 = new Employee(26,"Nancy", "Insuasty", "Desarrrollador Front-end", 35000);
        Employee employee3 = new Employee(27,"Jose", "Aristizabal", "Desarrrollador Front-end", 48000);
        Employee employee4 = new Employee(28,"Rosa", "Marin", "Desarrrollador Front-end", 32000);
        Employee employee5 = new Employee(29,"Marcos", "Alonso", "Desarrrollador Front-end", 30000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(pasante1);
        employeeList.add(pasante2);
        employeeList.add(pasante3);
        employeeList.add(pasante4);
        employeeList.add(pasante5);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);




        System.out.println("Salario del empleado: " + employee1.getSalario());
        System.out.println("Salario del becario: " + pasante1.getSalario());

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