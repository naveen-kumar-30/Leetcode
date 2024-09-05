int countMatches(char*** items, int itemsSize, int* itemsColSize, char* ruleKey, char* ruleValue) {
    
    int count=0;
    for(int i=0;i<itemsSize;i++){
            if(strcmp(ruleKey,"color")==0) {
                if(strcmp(ruleValue, items[i][1])==0)
                    count++;
            }

             else if(strcmp(ruleKey,"type")==0) {
                if(strcmp(ruleValue, items[i][0])==0)
                    count++;
            }
            else if(strcmp(ruleKey,"name")==0) {
                if(strcmp(ruleValue, items[i][2])==0)
                    count++;
            }
    }
    return count;
}