/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findWordsContaining(char** words, int wordsSize, char x, int* returnSize) {
    int *p=malloc((wordsSize)*sizeof(int));
    int c=0;
    for(int i=0;i<wordsSize;i++){
       char *temp=words[i];
        for(int j=0;temp[j]!=0;j++){
                if(temp[j]==x){
                    p[c++]=i;
                    break;
                }
        }
    }
    *returnSize=c;
    return p;

}