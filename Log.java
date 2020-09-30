public class Log {
    public static void main(String[] args){
        log("In main method");
    }
    public static void log(String s){
        String nameClass = Thread.currentThread().getStackTrace()[2].getClassName();
        String nameMethod = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(nameClass + ": " + nameMethod + ": " + s);
    }
}
