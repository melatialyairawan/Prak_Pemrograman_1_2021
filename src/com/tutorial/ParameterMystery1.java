public class ParameterMystery1{
    public static void main(String[] args) {
        int x = 9;
        int y = 2;
        int z = 5;

        mystery(z, x, y);
        mystery(y, x, z);
    }
    public static void mystery(int x, int z, int y) {
        System.out.println(z + "," + (y - x));
    }
    
}
