package com.Myexp;
import java.util.Scanner;

abstract class Employee {
	String name;         //姓名
	int age;             //年龄
	String position;     //职务
	double salary;       //工资

	public Employee(String Name,int Age) {     	//构造函数
		name = Name;
		age = Age;
	}

	public String getName() {            
		//返回姓名
		return name;
	}

	public int getAge() {                 		//返回年龄
		return age;
	}

	public abstract double ComputeSalary();  	//抽象类计算并返回工资的函数
}


class Salesman extends Employee{
	double sells;
	Salesman(String Name,int Age){  
		super(Name,Age);    //调用父类的构造函数
		position="销售人员";
	}
	public void setSells(double Sells) {   //设置销售员的销售额
		sells = Sells;
	}
	public double ComputeSalary() {    //自定义计算销售员的工资方法
		salary = 5000 + sells * 0.5;
		return salary;
	}
}


class Manager extends Employee {
    
	Manager(String Name,int Age){   
        
		super(Name,Age);   //调用父类的构造函数
		position="经理";
    }
    
	public double ComputeSalary() {  //自定义计算工资的方法
		salary=10000;
		return salary;
	}
}



class Worker extends Employee{
    double days;

    Worker(String Name, int Age){
        super(Name, Age);
        position = "工人";
    }

    public void setWorkdays(int day){
        days = day;
    }

     public double ComputeSalary(){
        salary = 300.0 * days;
        return salary;
    }

}


public class EmployeeTest 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("########欢迎来到本公司雇员工资查询系统########");
        System.out.println();
        System.out.println("输入‘1’查询管理员 " +
        "输入‘2’查询销售员 " +
        "输入‘3’查询工人"
        );
        int option;

        System.out.println("请输入选择（退出请按0）");
        boolean f = true;
        while(f)
        {
            option = reader.nextInt();
            
            switch(option)
            {
                
                case 1:
                Manager manager = new Manager("小明", 30);   //创建一个管理员对象
                System.out.println(manager.name+"的职位是"+manager.position+",工资是"+manager.ComputeSalary()+"元");  //输出管理员的姓名，职位，工资
                System.out.println();
                break;

                case 2:
                Salesman salesman = new Salesman("小红",30);  //创建一个销售员对象
                salesman.setSells(6000);   //设置该销售员的销售额
                System.out.println(salesman.name+"的职位是"+salesman.position+",工资是"+salesman.ComputeSalary()+"元");//输出销售员的姓名，职位，工资
                System.out.println();
                break;

                case 3:
                Worker worker = new Worker("小军",30);  //创建一个工人对象
                worker.setWorkdays(28);              //设置工人的工作天数
                System.out.println(worker.name+"的职位是"+worker.position+",工资是"+worker.ComputeSalary()+"元");//输出工人的姓名，职位，工资
                break;

                case 0:
                f = false;
                break ;
            }
        }
	
	}
}
