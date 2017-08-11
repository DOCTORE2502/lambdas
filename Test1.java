import java.util.Properties;

class Test {
    public static void main (String[] args){
        Properties p = System.getProperties();
        System.out.println(p.getProperty("key1"));
    }
}