public class VariableExample {

        static int staticCount = 0;


    int instanceCount = 0;

  
    void demonstrateLocalVariable() {
        
        int localCount = 0;
        
       
        localCount++;
        System.out.println("Local Count: " + localCount);
    }


    void demonstrateInstanceAndStaticVariables() {
        
        staticCount++;
        System.out.println("Static Count: " + staticCount);


        instanceCount++;
        System.out.println("Instance Count: " + instanceCount);
    }

    public static void main(String[] args) {
        VariableExample example1 = new VariableExample();
        VariableExample example2 = new VariableExample();


        example1.demonstrateLocalVariable();
        

        example1.demonstrateInstanceAndStaticVariables();
        example2.demonstrateInstanceAndStaticVariables();
        

        example1.demonstrateInstanceAndStaticVariables();
        example2.demonstrateInstanceAndStaticVariables();
    }
}
