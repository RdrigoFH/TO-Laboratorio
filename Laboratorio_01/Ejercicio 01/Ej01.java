public class  Ej01 {
    public static double sumArray(double[] valores) {
        double suma = 0;
        for (double valor : valores) {
            suma += valor;
        }
        return suma;
    }
    public static void main(String[] args) {
        double[] nums = {18, 15, 20, 17};
        double sum = sumArray(notas);
        System.out.println(sum);
    }
}
