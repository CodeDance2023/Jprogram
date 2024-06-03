package test;

public class regx {
    public static void main(String[] args) {
      String regx1 = "\\\\";        //“\\”才是正则表达式里的反斜杠
      String regx2 = "\\.";        //“\.”才是正则表达式里的点
      String text1 = "\\";    //"\"
      String text2 = ".";    //"\"
        System.out.println(text1.matches(regx1));  //匹配\ ------- true
        System.out.println(text2.matches(regx2));  //匹配. ------- true

    }
}
