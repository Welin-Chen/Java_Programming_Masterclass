import java.util.ArrayList;

class intClass {
    private int myValue;

    public intClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        // ArrayList<int>intArrayList=new ArrayList<int>();

        ArrayList<intClass> intClassArrayList = new ArrayList<intClass>();
        intClassArrayList.add(new intClass(54));

        Integer integer = Integer.valueOf(54);
        Double doubleValue = Double.valueOf(22.2);

        // ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        // for (int i = 0; i < 10; i++) {
        // intArrayList.add(Integer.valueOf(i * 10));
        // }
        // for (int i = 0; i < 10; i++) {
        // System.out.println(i + " -> " + intArrayList.get(i).intValue());
        // }

        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue;// myIntValue.intValue();
        System.out.println(myInt);

        ArrayList<Double> doubleArrayList = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            doubleArrayList.add(dbl);
        }

        for (int i = 0; i < doubleArrayList.size(); i++) {
            System.out.println(i + " -> " + doubleArrayList.get(i));
        }
    }
}
