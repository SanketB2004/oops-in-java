class Employee {

    private int empId = 2;
    private int ph = 0;
    private String name;
    private int basicSal = 20000;
    private int incentive = 200;

    Employee() {
        ph = 222;
        name = "sanket";
    }

    Employee(String empName, int phoneNo) {
        ph = phoneNo;
        name = empName;
    }

    private void countSal() {
        System.out.println(basicSal + incentive);
    }

    int getph() {
        return ph;
    }

    String getName() {
        return name;
    }

    void setph(int phone) {
        ph = phone;
    }

    void setname(String name) {
        this.name = name;   // this is used to parameter passing is imp for interview ok
    }
}