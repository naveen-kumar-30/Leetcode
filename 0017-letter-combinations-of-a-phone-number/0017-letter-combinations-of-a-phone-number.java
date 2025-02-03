class Solution {
    public List<String> letterCombinations(String digits) {
      if(digits==null || digits.isEmpty()) return new ArrayList<>();

      String[] chartodigit = {
        "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
      };

      Queue<String> q = new LinkedList<>();
      q.add("");

      for(char digit : digits.toCharArray()){
        int size = q.size();
        String letters = chartodigit[digit-'0'];

        for(int i=0;i<size;i++){
            String prefix = q.poll();
            for(char letter :letters.toCharArray()){
                q.add(prefix + letter);
            }
        }
      }
      return new ArrayList<>(q);
    }
}