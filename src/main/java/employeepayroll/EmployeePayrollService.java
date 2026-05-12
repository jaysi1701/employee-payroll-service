package employeepayroll;

import java.util.Arrays;
import java.util.List;

public class EmployeePayrollService {

    private List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {

        this.employeePayrollList = employeePayrollList;
    }

    public void writeEmployeePayrollData() {

        new EmployeePayrollFileIOService()
                .writeData(employeePayrollList);
    }

    public static void main(String[] args) {

        List<EmployeePayrollData> employeePayrollList =
                Arrays.asList(
                        new EmployeePayrollData(1, "Jeff", 100000),
                        new EmployeePayrollData(2, "Bill", 200000),
                        new EmployeePayrollData(3, "Mark", 300000)
                );

        EmployeePayrollService employeePayrollService =
                new EmployeePayrollService(employeePayrollList);

        employeePayrollService.writeEmployeePayrollData();

        System.out.println("Payroll Written Successfully");
    }
}