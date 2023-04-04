package builder;

public class ClassBuilder {
    public Class9TotalContent type1(){
        Class9TotalContent class9TotalContent = new Class9TotalContent();
        class9TotalContent.addMethod(new Class7());
        class9TotalContent.addMethod(new Class6());
        return class9TotalContent;
    }

    public Class9TotalContent type2(){
        Class9TotalContent class9TotalContent = new Class9TotalContent();
        class9TotalContent.addMethod(new Class8());
        class9TotalContent.addMethod(new Class5());
        return class9TotalContent;
    }
}
