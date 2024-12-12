class Solution {
    public String intToRoman(int s) {
        String [] one = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String [] ten = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String [] hundred = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String [] thoundsand = {"","M","MM","MMM"};

        return thoundsand[s/1000] + hundred[(s%1000)/100] + ten[(s%100)/10] + one[s%10];
    }
    }
