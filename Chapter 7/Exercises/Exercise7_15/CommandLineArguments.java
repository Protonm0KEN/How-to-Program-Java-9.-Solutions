package Exercise7_15;
public class CommandLineArguments {
    public static void main(String[] args){
        int[] array;
        if(Integer.parseInt(args[0]) >= 0)
            array = new int[Integer.parseInt(args[0])];
        else
            array = new int[10];
        System.out.printf("%s%8s\n", "Index", "Value");
        for(int counter = 0; counter < array.length; counter++){
            System.out.printf("%5d%8d\n", counter, array[counter]);
        }
    }
}
