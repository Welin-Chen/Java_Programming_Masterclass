public class App {
    public static void main(String[] args) throws Exception {

        String varFour = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        System.out.println("varThree is not accessible here " + innerClass.varThree);

        // System.out.println("ScopeInstance varOne is " +
        // scopeInstance.getPrivateVar());
        // System.out.println(varFour);

        // scopeInstance.timesTwo();

        // System.out.println("*****************************");

        // ScopeCheck.InnerClass innerClarss = scopeInstance.new InnerClass();
        // innerClarss.timesTwo();
    }
}
