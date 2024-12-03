int countPrimes(int n) {
    if (n <= 2) {
        return 0;
    }
    
    // Create an array to mark non-prime numbers, initialize all to true
    bool isPrime[n];
    for (int i = 2; i < n; i++) {
        isPrime[i] = true;
    }
    
    // Apply the Sieve of Eratosthenes algorithm
    for (int i = 2; i * i < n; i++) {
        if (isPrime[i]) {
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
    }
    
    // Count the prime numbers less than n
    int count = 0;
    for (int i = 2; i < n; i++) {
        if (isPrime[i]) {
            count++;
        }
    }
    
    return count;
}
