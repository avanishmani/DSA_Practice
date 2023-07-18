package Arrays;

import java.util.Arrays;
import java.util.Comparator;
class employee {
    int employee_id;
    String name;
    int salary;
    boolean stock_options;
    int vesting_period;
    public static void employee(){

    }
    void employee(int eid,String name,int salary,boolean stock,int vesting){
        this.employee_id=eid;
        this.name=name;
        this.salary=salary;
        this.stock_options=stock;
        this.vesting_period=vesting;
    }
    int employeeNumber(){
        return this.employee_id;

    }
    String name(){
        return this.name;
    }
    int salary(){
        return this.salary;
    }
    boolean stock_options(){
        return this.stock_options;
    }
    int vesting_period(){
        return this.vesting_period;
    }
}
abstract class company implements Comparator{
    int size;
    employee[] arr;

    void sortSalary(){
        Arrays.sort(arr,Comparator.comparing(employee::salary));

    }
    void sortEmployeeId(){
        Arrays.sort(arr,Comparator.comparing(employee::employeeNumber));
    }
    void sortVestingPeriod(){
        Arrays.sort(arr,Comparator.comparing(employee::vesting_period).reversed());
    }
    void stockOrNot(int id){
        String ans="Invalid Employee ID";
        for(employee e:arr){
            if(e.employeeNumber()==id){
                if(e.stock_options()){
                    ans="Stock Granted to "+e.name();
                }else{
                    ans="Stock not Granted to "+e.name();
                }
            }
        }
    }
    int size(){
        return this.size();
    }
}


