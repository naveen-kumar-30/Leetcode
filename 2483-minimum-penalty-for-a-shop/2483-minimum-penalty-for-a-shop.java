class Solution {
    public int bestClosingTime(String cus) {
        
        int penality = 0;

        for(int i=0;i<cus.length();i++){
            if(cus.charAt(i) == 'Y'){
                penality++;
            }
        }

        int minpenality = penality;
        int besthour = 0;

        for(int i=0;i<cus.length();i++){
            char ch = cus.charAt(i);

            if(ch == 'Y'){
                penality--;
            }
            else{
                penality++;
            }

            if(penality < minpenality){
                minpenality = penality;
                besthour = i+1;
            }
        }

        return besthour;
    }
}