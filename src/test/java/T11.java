import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class T11 {

    @Test
    void f1(){
        class Solution {
            // StringBuilder path =new StringBuilder();
            Deque<String> path = new LinkedList<>();
            List<String> res = new ArrayList<>();
            String s ;
            int count = 0;
            public List<String> restoreIpAddresses(String s) {
                if(s.length()<4 || s.length() > 12)
                    return res;
                this.s = s;
                transerval(0);
                return res;
            }

            void transerval(int index){
                if(index >= s.length())
                    return ;
                if(count == 3){
                    if(s.length() - index <= 3){
                        if(s.charAt(index) == '0')
                            return ;
                        String cur = s.substring(index,s.length());
                        int num = Integer.parseInt(cur) ;
                        if(num>255)
                            return ;
                        StringBuilder ans = new StringBuilder();
                        for(String str: path){
                            ans.append(str);
                            ans.append(".");
                        }
                        ans.append(cur);
                        res.add(ans.toString());
                    }
                    return ;
                }

                for(int i = 0 ; i<3&&i<s.length(); i++){
                    if(i == 2 ){
                        String cur = s.substring(index,index + 3);
                        int num = Integer.parseInt(cur) ;
                        if(num>255)
                            return ;
                        path.addLast(cur);
                        transerval(index +3);
                        path.removeLast();
                        return ;
                    }
                    if(s.charAt(index ) == '0'){
                        path.addLast("0");
                        transerval(index +1);
                        path.removeLast();
                        return ;
                    }else {
                        String cur = s.substring(index,index+i+1);
                        path.addLast(cur);
                        transerval(index+i+1);
                        path.removeLast();
                        return ;
                    }

                }
            }
        }
    }

}
