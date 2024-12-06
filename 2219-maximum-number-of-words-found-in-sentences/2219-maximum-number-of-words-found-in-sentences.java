class Solution {
    public int mostWordsFound(String[] sentences) {
   int max=0;
        for(int i=0;i<sentences.length;i++){
            int indexs=0;
            int indext=sentences[i].length()-1;
            int count=0;
            while(indexs<=indext){
               if(sentences[i].charAt(indexs)==' ')
                    count++;

                
                
                indexs++;
       
            }
            count+=1;
            max= Math.max(count,max);
        }
        return max;
    }
}