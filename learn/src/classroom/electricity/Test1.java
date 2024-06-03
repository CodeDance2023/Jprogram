package classroom.electricity;

public class Test1 {     //测试类
    public static void main(String[] args) {
        //创建夏天费用对象
        Summer summer = new Summer();
        summer.showfee();
        //创建冬天费用对象
        Winter winter = new Winter();
        winter.showfee();
    }
}

