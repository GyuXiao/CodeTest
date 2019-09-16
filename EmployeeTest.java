package com.Myexp;
import java.util.Scanner;

abstract class Employee {
	String name;         //����
	int age;             //����
	String position;     //ְ��
	double salary;       //����

	public Employee(String Name,int Age) {     	//���캯��
		name = Name;
		age = Age;
	}

	public String getName() {            
		//��������
		return name;
	}

	public int getAge() {                 		//��������
		return age;
	}

	public abstract double ComputeSalary();  	//��������㲢���ع��ʵĺ���
}


class Salesman extends Employee{
	double sells;
	Salesman(String Name,int Age){  
		super(Name,Age);    //���ø���Ĺ��캯��
		position="������Ա";
	}
	public void setSells(double Sells) {   //��������Ա�����۶�
		sells = Sells;
	}
	public double ComputeSalary() {    //�Զ����������Ա�Ĺ��ʷ���
		salary = 5000 + sells * 0.5;
		return salary;
	}
}


class Manager extends Employee {
    
	Manager(String Name,int Age){   
        
		super(Name,Age);   //���ø���Ĺ��캯��
		position="����";
    }
    
	public double ComputeSalary() {  //�Զ�����㹤�ʵķ���
		salary=10000;
		return salary;
	}
}



class Worker extends Employee{
    double days;

    Worker(String Name, int Age){
        super(Name, Age);
        position = "����";
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
        System.out.println("########��ӭ��������˾��Ա���ʲ�ѯϵͳ########");
        System.out.println();
        System.out.println("���롮1����ѯ����Ա " +
        "���롮2����ѯ����Ա " +
        "���롮3����ѯ����"
        );
        int option;

        System.out.println("������ѡ���˳��밴0��");
        boolean f = true;
        while(f)
        {
            option = reader.nextInt();
            
            switch(option)
            {
                
                case 1:
                Manager manager = new Manager("С��", 30);   //����һ������Ա����
                System.out.println(manager.name+"��ְλ��"+manager.position+",������"+manager.ComputeSalary()+"Ԫ");  //�������Ա��������ְλ������
                System.out.println();
                break;

                case 2:
                Salesman salesman = new Salesman("С��",30);  //����һ������Ա����
                salesman.setSells(6000);   //���ø�����Ա�����۶�
                System.out.println(salesman.name+"��ְλ��"+salesman.position+",������"+salesman.ComputeSalary()+"Ԫ");//�������Ա��������ְλ������
                System.out.println();
                break;

                case 3:
                Worker worker = new Worker("С��",30);  //����һ�����˶���
                worker.setWorkdays(28);              //���ù��˵Ĺ�������
                System.out.println(worker.name+"��ְλ��"+worker.position+",������"+worker.ComputeSalary()+"Ԫ");//������˵�������ְλ������
                break;

                case 0:
                f = false;
                break ;
            }
        }
	
	}
}
