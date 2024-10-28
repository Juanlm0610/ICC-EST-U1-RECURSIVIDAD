public class App {
    public static void main(String[] args) throws Exception {
        
        Recursividad rec = new Recursividad();

        System.out.println("RESULTADO FACTORIAL");
        System.out.println(rec.factorial(5));

        System.out.println("RESULTADO SUMA CONSECUTIVOS");
        System.out.println(rec.sumaConsecutivos(5));

        System.out.println("RESULTADO POTENCIA");
        System.out.println(rec.potencia(5, 3));

        System.out.println("RESULTADO SUMA DIGITOS");
        System.out.println(rec.sumaDigitos(456));
}



}
