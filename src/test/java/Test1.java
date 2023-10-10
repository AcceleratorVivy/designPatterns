import org.junit.jupiter.api.Test;

import java.util.*;

 class Test1 {
    @Test
    void f33(){
        class Solution {
            boolean[][] f;
            List<List<String>> ret = new ArrayList<>();
            List<String> ans = new ArrayList<>();
            int n;

            public List<List<String>> partition(String s) {
                n = s.length();
                f = new boolean[n][n];
                for (int i = 0; i < n; ++i) {
                    Arrays.fill(f[i], true);
                }

                for (int i = n - 1; i >= 0; --i) {
                    for (int j = i + 1; j < n; ++j) {
                        f[i][j] = (s.charAt(i) == s.charAt(j)) && f[i + 1][j - 1];
                    }
                }

                dfs(s, 0);
                return ret;
            }

            public void dfs(String s, int i) {
                if (i == n) {
                    ret.add(new ArrayList<String>(ans));
                    return;
                }
                for (int j = i; j < n; ++j) {
                    if (f[i][j]) {
                        ans.add(s.substring(i, j + 1));
                        dfs(s, j + 1);
                        ans.remove(ans.size() - 1);
                    }
                }
            }
        }

        System.out.println(System.currentTimeMillis());
        Solution s = new Solution();
        s.partition("abbbbaaabbbaasabbbbaabbbbaa");
        System.out.println(System.currentTimeMillis());

    }
    @Test
    void f22(){
        class Solution {
            List<List<String>> res = new ArrayList<>();
            Deque<String> path =  new ArrayDeque<>();
            String s ;
            public List<List<String>> partition(String s) {
                this.s = s ;
                transerval(0);
                return res;
            }

            void transerval(int index){
                if(index == s.length()){
                    res.add(new ArrayList<>(path));
                    return ;
                }
                for(int i = index ; i < s.length() ; i++){
                    if(is(s,index ,i)){
                        path.addLast(s.substring(index ,i+1));
                        transerval(i+1);
                        path.removeLast();
                    }

                }
            }


            boolean is(String s , int l , int  r){
                while(l <r ){
                    if(s.charAt(l) != s.charAt(r)){
                        return false;
                    }
                    l++;
                    r--;
                }
                return true;
            }
        }
        System.out.println(System.currentTimeMillis());
        Solution s = new Solution();
        s.partition("abbbbaaabbbaasabbbbaabbbbaa");
        System.out.println(System.currentTimeMillis());
    }
}
