package ds.stack;

public class App {
    public static void main(String[] args) {
        Stack theStack = new Stack(10);

        System.out.println(reverseString("chinonso"));
    }

    public static String reverseString(String str){
        Stack theStack = new Stack(str.length());
        for(int x=0;x<str.length();x++){
            theStack.push(str.charAt(x)+"");
        }
        str="";
        while (!theStack.isEmpty()){
            str+=theStack.pop();

        }
        return str;

    }

}
