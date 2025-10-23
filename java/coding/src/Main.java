import stack.LIFOStack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        LIFOStack<Integer> stack = new LIFOStack<Integer>();

        stack.push(3);
        stack.push(7);
        stack.push(9);
        stack.push(1);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());



//        LinkedList linkedList = new LinkedList();
//        linkedList.appendData(1);
//        linkedList.appendData(3);
//        linkedList.appendData(5);
//        linkedList.prependData(7);
//        linkedList.printList();


//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//
//        String fruits[] = {"Apple", "Orange"};
//
//        for (String item: fruits){
//            System.out.println(item);
//        }
//
//
//        int a = 5;
//        int b = 10;
//        boolean result;
//        result = (a > 10) && (b++ > 5);
//        System.out.println("a = " + a + ", b = " + b + ", result = " + result);
//        result = (a > 10) & (b++ > 5);
//        System.out.println("a = " + a + ", b = " + b + ", result = " + result);
//
//


    }

}