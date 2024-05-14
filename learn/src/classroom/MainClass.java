package classroom;

import java.util.Scanner;

public class MainClass {

    //通过学生名字查找并返回其对象的方法
    public static Student searchStudent(String name, Student[] studentarray){
        for (Student stu : studentarray) {
            if (stu.getName().equals(name)){
                return stu;
            }
        }
        return null;    //没找到就返回null
    }

    //主方法
    public static void main(String[] args) {
        //创建长度为10的学生对象数组
        Student[] students = new Student[10];
        //分别为所有对象赋值
        students[0] = new Student("Mike", 90);
        students[1] = new Student("Jack", 99);
        students[2] = new Student("Kobe", 98);
        students[3] = new Student("Jordan", 95);
        students[4] = new Student("James", 94);
        students[5] = new Student("Harden", 85);
        students[6] = new Student("Paul", 86);
        students[7] = new Student("Yi", 97);
        students[8] = new Student("Yao", 99);
        students[9] = new Student("Liang", 100);
        //输出学生数组所有学生的信息
        for (Student student : students) {
            student.display();
        }

        //查找某个学生并输出其信息
        Scanner input = new Scanner(System.in);
        Student stu;
        while (true){
            System.out.print("请输入查找学生的姓名> ");
            String name = input.nextLine();
            //调用方法并返回这个学生的对象
            stu = searchStudent(name, students);
            //输出其信息
            if (stu != null) {
                System.out.print("修改前：");
                stu.display();
                break;
            }
            //如果没找到就输出null
            else{
                System.out.println("输入错误，请重新输入！");
            }
        }


        //修改并输出其信息
        System.out.print("请输入要修改的分数> ");
        int score = input.nextInt();
        stu.modScore(score);

        //输出修改后的学生信息
        System.out.print("修改后：");
        stu.display();
    }
}


class Student{
    //两个成员变量
    private String name;
    private int score;

    //有参数构造方法
    public Student(String name, int score){
        this.name = name;
        if (score >= 0){
            this.score = score;
        }
    }

    //修改对象的成绩
    public void modScore(int score){
        this.score = score;
    }
    //输出姓名、成绩
    public void display(){
        System.out.println("名字：" + name + " 成绩: " + score);
    }

    //返回姓名
    public String getName(){
        return name;
    }
}