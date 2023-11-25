//给定一个正整数（不超过16位），请将其转换为汉字的表达形式，例如：
//输入：123456789
//输出：一亿二千三百四十五万六千七百八十九

// %10 取余对应位置数 四个为一组 
// 千百十 不变
// 个 万 亿
class Solution{
  public String numToCh(long nums){
    String numStr = Long.toString(nums);
    String[] num = {"零","一","二","三","四","五","六","七","八","九"};
    String[] unit = {"","十","百","千","万","十","百","千","亿","十","百","千","兆"};
    String result = "";
    int len = numStr.length();
    
    for(int i = 0;i<len;i++){
      int n = numStr.charAt(i) - '0';
      result += num[n] + unit[len-i-1];
    }
    return result;
  }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.numToCh(123456789));
    }

}


