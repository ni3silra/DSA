package com.utilites;

import java.util.*;
import java.util.function.Predicate;

public class ProfileViewer {

    static List<Employee> employeeList;

    public int findRootId(List<Integer> employeesId) {
        return employeesId.stream()
                .filter(ProfileViewer::isRootId)
                .findFirst()
                .orElse(-1);
    }

    private static boolean isRootId(int id) {
        Predicate<Employee> isIdExists =
                employee -> employee.getReportersId() != null && employee.getReportersId().contains(id);

        return employeeList.stream()
                .noneMatch(isIdExists);
    }// On^2


    private static boolean isRootId2(int id) {
        Set<Integer> setOfReportersIds = new HashSet<>();

        for (Employee employee : employeeList)
            if (employee.getReportersId() != null)
                setOfReportersIds.addAll(employee.getReportersId());

        Predicate<Employee> isIdExists =
                employee -> employee.getReportersId() != null && setOfReportersIds.contains(id);

        return employeeList.stream()
                .noneMatch(isIdExists);
    }// On^2

    public void format(int employeeId, int prefixCount) {
        if (employeeId == -1) return;
        Employee employee = Employee.getNameByID(employeeList, employeeId);
        print(employee, prefixCount);
        if (employee.getReportersId() != null)
            employee.getReportersId().forEach(id -> format(id, prefixCount + 1));
    }

    private void print(Employee employee, int prefixCount) {
        String prefixChar = "+";
        System.out.println(prefixChar.repeat(prefixCount) + "" + employee.getName());
    }

    public static void main(String[] args) {
        employeeList = new ArrayList<>(); /* global variable */
        Employee md = new Employee(4, "Rajpal Yadav", null);
        Employee ceo = new Employee(2, "Johney Lever", new ArrayList<>(List.of(4)));
        Employee cto = new Employee(3, "Raju Shrivastav", new ArrayList<>(List.of(5)));
        Employee director = new Employee(5, "Ratan Noora", null);
        Employee founder = new Employee(1, "Comedy", new ArrayList<>(List.of(2, 3)));

        employeeList.addAll(List.of(md, ceo, cto, director, founder));
        ProfileViewer profileViewer = new ProfileViewer();

        int rootId = profileViewer.findRootId(new ArrayList<>(List.of(4, 2, 3, 5, 1)));
        profileViewer.format(rootId, 0);
    }
}

class Employee {
    int id;
    String name;
    List<Integer> reportersId; // that can't contain the same

    public Employee(int id, String name, List<Integer> reportersId) {
        this.id = id;
        this.name = name;
        this.reportersId = reportersId;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getReportersId() {
        return reportersId;
    }

    public static Employee getNameByID(List<Employee> employeeList, int eId) {
        Optional<Employee> employee = employeeList.stream()
                .filter(e -> e.getId() == eId).findFirst();
        return employee.orElse(new Employee(-1, "", null));
    }
}

