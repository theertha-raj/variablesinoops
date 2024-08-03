package variablesoops;

public class employeconstr2 {
    employeconstr2(String name) {
        System.out.println(name);
    }

    employeconstr2(double salary) {
        System.out.println(salary);
    }

    employeconstr2(String name, double salary) {
        System.out.println(name);
        System.out.println(salary);
    }

    employeconstr2(double salary, String name) {
        System.out.println(name);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        employeconstr2 e1 = new employeconstr2("rathan");
        new employeconstr2(10000);
        new employeconstr2("rathan", 100000);
        new employeconstr2(100000, "rathan");
    }
}