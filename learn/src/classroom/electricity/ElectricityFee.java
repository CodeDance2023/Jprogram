package classroom.electricity;

public interface ElectricityFee {    //定义接口
    int sum = 125;   //总的用电度数
    double perfee = 0.49;       //每一度电费的费用
    void showfee();              //展示所有电费的总和
}

class Summer implements ElectricityFee{   //夏天电费的实现类
    public void showfee(){
        System.out.println("夏天的用电总费用是：" + (sum + 20) * perfee);
    }
}

class Winter implements ElectricityFee{    //冬天费用的实现类
    public void showfee(){
        System.out.println("冬天的用电总费用是：" + sum * perfee);
    }
}
