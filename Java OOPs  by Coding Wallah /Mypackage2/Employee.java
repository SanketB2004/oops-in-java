class Employee {

    private int empId=2;
    private int ph=0;
    private String name;
    private int basicSal=20000;
    private int incentive=200;
    private void countSal(){
        System.out.println(basicSal+incentive);
    }

    // getter & setter 
 int getph(){
    return ph;
 }
 String getName(){
    return name;

 }
}