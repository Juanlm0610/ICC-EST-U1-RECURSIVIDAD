public class Recursividad {
    

    public int factorial(int n){
        //Caso Base: n = 0! y 1! son = a 1
        
        if(n == 0 || n==1){
            System.out.println("Caso Base alcanzado el factorial de " + n + " es 1");
            return 1;
        }
        int resultado =n * factorial(n-1);
        System.out.println("Calculando el factorial de " + n);
        System.out.println("Resultado parcial para " + n + " * factorial de (" + (n-1) + ") = " + resultado);
        return resultado;
    }

    //Calcular suma de numeros consecutivos 
    //n = 5 = 5+4+3+2+1=15
    public int sumaConsecutivos(int n){
        if(n == 0 || n==1){
            System.out.println("Caso Base alcanzado el la suma de " + n + " es 1");
            return 1;
        }
        int resultado = n + sumaConsecutivos(n-1);
        System.out.println("Calculando La suma de " + n);
        System.out.println("Resultado parcial para " + n + " * Suma de (" + (n-1) + ") = " + resultado);
        return resultado;
    }
    //Calcular Exponente
    //n = 3 y exp = 3 = 3*3*3=81
    public int potencia(int n, int exp){
        if ((exp == 0)) {
            System.out.println("Caso Base alcanzado el exponente de " + n + " es 1");
            return 1;
        }
        int resultado = n*potencia(n, exp-1);
        System.out.println("Calculando La potencia de " + n);
        System.out.println("Resultado parcial para " + n + " elevado a la potencia  (" + (exp-1) + ") = " + resultado);
        return resultado;
    }
    // Crear un método que sume los dígitos de un número 
// Si mando 456, el resultado es 15
// 4 + 5 + 6 = 15
    public int sumaDigitos(int n) {
        if (n < 10) {
        System.out.println("Caso base alcanzado: el número " + n + " es menor a 10.");
        return n;
    }
    
    int resultado = (n % 10) + sumaDigitos(n / 10);
    System.out.println("Calculando la suma de los dígitos de " + n + ":");
    System.out.println("Sumando " + (n % 10) + " al resultado parcial de la suma de los dígitos de " + (n / 10));
    System.out.println("Resultado parcial para " + n + " = " + resultado);
    
    return resultado;
}


}



