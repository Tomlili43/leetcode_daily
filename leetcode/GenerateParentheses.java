import java.util.ArrayList;
import java.util.List;


/**
 * GenerateParentheses
 */
public class GenerateParentheses {

    public static void main(String[] args) {
        GenerateParentheses s = new GenerateParentheses();
        List<String> ans = s.generateParenthesis(3);
        System.out.println(ans);
    }
    public List<String> generateParenthesis(int n) {
            // f(n) = for k=0 k++;k<=n-1 aggre(f(k)*f(n-1-k))
            //return f[n];
            // init
            List<List<String>> res = new ArrayList<List<String>>();
 
            //init res[0]
            res.add(new ArrayList<String>());
            res.get(0).add("");
            //init res[1]
            res.add(new ArrayList<String>());
            res.get(1).add("()");
            for(int i=2;i<=n;i++){
                res.add(new ArrayList<String>());
                for(int k=0;k<=i-1;k++){
                    // get arraylist.length
                    // get index k of arraylist

                    int resKlen = res.get(k).size();
                    for(int l=0;l<resKlen;l++){
                        // int len_of res[i-1-k]
                        int ikLen = res.get(i-1-k).size();
                        for(int m=0;m<ikLen;m++){
                            res.get(i).add("("+res.get(k).get(l)+")"+res.get(i-1-k).get(m));
                        }   
                        
                    }
                    //res[i]+=res[k]*res[i-1-k];
                }
            } 
            return res.get(n);
        }
}