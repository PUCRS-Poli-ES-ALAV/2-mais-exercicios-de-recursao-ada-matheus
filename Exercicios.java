

public static int fatorial(int n){
    if( n == 1 || n == 0){
        return 1;
    }
    if( n < 0){
     throw new Error("erro");
    }
    return n * fatorial(n - 1);
}

public static int somatorio(int n){
    if( n == 0){
        return 0;
    }
    if(n > 0){
        return n + somatorio(n - 1);
    }
    else return n + somatorio(n + 1);

}

public static int fibo(int n){
    if( n == 0){
        return 0;
    }
    if( n == 1){
        return 1;
    }
    if( n < 0){
        throw new IllegalArgumentException("numero invalido");
    }
    return fibo(n - 1) + fibo(n - 2);
}

public static int somatoriokj(int k, int j){
    if( k == j && j == k){
        return j;
    }
    if( k > j){
        return 0;
    }
    return    
    

}



public static void main(String[] args) {
    System.out.println();
}