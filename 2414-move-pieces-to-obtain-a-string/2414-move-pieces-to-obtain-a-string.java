class Solution {
    public boolean canChange(String start, String target) {
        String filteredStart = start.replace("_", "");
        String filteredTarget = target.replace("_", "");
        if (!filteredStart.equals(filteredTarget)) {
            return false;
        }
        int indexs =0;
        int indext =0;
        if(start.length()!= target.length()){
                    return false;
        }
        while(indexs < start.length() && indext<target.length()){
            while(indexs<start.length() && start.charAt(indexs)=='_'){
                indexs++;
            }
            while(indext<target.length() && target.charAt(indext)=='_'){
                indext++;
            }
            if(indext==target.length() && indexs==start.length()){
                return true;
            }
            if(indexs==start.length() || indext==target.length() || start.charAt(indexs)!= target.charAt(indext)){
                return false;
            }
            if(indexs<start.length() && indext<target.length()){
                if(target.charAt(indext)== 'L' && indexs< indext){
                    return false;
                }
                if(target.charAt(indext)=='R'&& indexs>indext){
                    return false;
                }
        }
            indexs++;
            indext++;


        }
        return true;
    
}
}