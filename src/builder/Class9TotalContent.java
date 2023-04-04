package builder;

import java.util.ArrayList;
import java.util.List;

public class Class9TotalContent {
    private List<Interface1> listofInterface1 = new ArrayList<>();

    public void addMethod(Interface1 interface1variable1) {
        listofInterface1.add(interface1variable1);
    }

    public float getTotal() {
        float total = 0.0f;
        for(Interface1 interface1variable2 : listofInterface1) {
            total += interface1variable2.method3();
        }
        return total;
    }

    public void getContents(){
        for (Interface1 interface1variable3: listofInterface1) {
            System.out.println("Interface1 method1 : " + interface1variable3.method1());
            System.out.println("Interface1 method2 : " + interface1variable3.method2().method4());
            System.out.println("Total : " + interface1variable3.method3());
        }
    }
}
