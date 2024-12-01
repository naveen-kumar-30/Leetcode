int reverse(int x){
 int digit;
    int rev=0;
    while(x){
        digit=x%10;
       if(rev>(INT_MAX/10) ||rev < (INT_MIN/10)) return 0;
       rev=rev*10 + digit;
        x=x/10;
        
    }


    return rev;
}