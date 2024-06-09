package P8_15;

public enum MyEnum {
    Mon("1"), Tue("2"), Wen("3"), Thu("4"),
    Fri("5"), Sat("6"), Sum("7");
    final String day;
    MyEnum(String number) {
        day = number;
    }

    @Override
    public String toString() {
        return day;
    }
}
