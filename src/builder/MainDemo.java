package builder;

public class MainDemo {
    public static void main(String[] args) {
        ClassBuilder classBuilder = new ClassBuilder();

        Class9TotalContent typeOne = classBuilder.type1();
        System.out.println("Type First Contents");
        typeOne.getContents();
        System.out.println("Type First Total : " + typeOne.getTotal());

        Class9TotalContent typeTwo = classBuilder.type2();
        System.out.println("Type Second Contents");
        typeTwo.getContents();
        System.out.println("Type Second Total : " + typeTwo.getTotal());
    }
}
