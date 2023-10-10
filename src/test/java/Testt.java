import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Testt {

    static int[] arr ;
    static int target = 7;
    static int sum = 1000;
    static int count = 1000;
    @BeforeAll
    public static void f11(){
//        arr =new int[count];
//        for(int i = 0 ; i< count ; i++){
//            arr[i] = (int)((Math.random()+1)*sum);
//        }
//        System.out.println(Arrays.toString(arr));
        arr = new int[]{2,3,6,7};
    }

//    @Test
//    void f3(){
//        System.out.println(123);
//        System.out.println(123);
//        System.out.println(123);
//        System.out.println(123);
//    }

    @Test
    void f4(){
        class Solution {
            int[] candidates;
            int target;
            List<List<Integer>> res ;
            Deque<Integer> path;
            // int sum = 0;
            public List<List<Integer>> combinationSum(int[] candidates, int target) {
                res = new ArrayList<>();
                path = new LinkedList<>();
                this.candidates = candidates ;
                this.target = target ;
                Arrays.sort(this.candidates);
                transerval(0,target);
                return res;
            }

            void  transerval(int index,int need){
                if(0 == need){
                    res.add(new ArrayList(path));
                    return ;
                }
                // if(sum > target){
                //     return -1;
                // }
                for(int i = index ; i < candidates.length ; i++){
                    if(need - candidates[i] >=0){
                        path.addLast(candidates[i]);
                        transerval(i,need-candidates[i]);
                        path.removeLast();
                    }else{
                        return ;
                    }
                }
            }
        }
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        solution.combinationSum(arr,target);
        long end = System.currentTimeMillis();
        System.out.println("end- 开始 = " + (end - start));
        System.out.println(solution.res);
    }

    @Test
    void f1(){
        class Solution {
            int[] candidates;
            int target;
            List<List<Integer>> res ;
            Deque<Integer> path;
            int sum = 0;
            public List<List<Integer>> combinationSum(int[] candidates, int target) {
                res = new ArrayList<>();
                path = new ArrayDeque<>();
                this.candidates = candidates ;
                this.target = target ;
                Arrays.sort(this.candidates);
                transerval(0);
                return res;
            }

            int transerval(int index){
                if(sum == target){
                    res.add(new ArrayList(path));
                    return -1;
                }

                if(sum > target){
                    return -1;
                }
                for(int i = index ; i < candidates.length ; i++){
                    path.addLast(candidates[i]);
                    sum += candidates[i];
                    int tar = transerval(i);
                    path.removeLast();
                    sum -= candidates[i];
                    if(tar == -1)
                        return 0;
                }
                return 0;
            }
        }
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        solution.combinationSum(arr,target);
        long end = System.currentTimeMillis();
        System.out.println("end- start = " + (end - start));System.out.println(solution.res);
    }

//    @Test
//    void f2(){
//        class Solution {
//            public List<List<Integer>> combinationSum(int[] candidates, int target) {
//                List<List<Integer>> ans = new ArrayList<List<Integer>>();
//                List<Integer> combine = new ArrayList<Integer>();
//                dfs(candidates, target, ans, combine, 0);
//                return ans;
//            }
//
//            public void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combine, int idx) {
//                if (idx == candidates.length) {
//                    return;
//                }
//                if (target == 0) {
//                    ans.add(new ArrayList<Integer>(combine));
//                    return;
//                }
//                // 直接跳过
//                dfs(candidates, target, ans, combine, idx + 1);
//                // 选择当前数
//                if (target - candidates[idx] >= 0) {
//                    combine.add(candidates[idx]);
//                    dfs(candidates, target - candidates[idx], ans, combine, idx);
//                    combine.remove(combine.size() - 1);
//                }
//            }
//        }
//        Solution solution = new Solution();
//        long start = System.currentTimeMillis();
//        List<List<Integer>> res = solution.combinationSum(arr,target);
//        long end = System.currentTimeMillis();
//        System.out.println("end- start = " + (end - start));
//        System.out.println(res);
//    }

    @Test
    void f3(){
        ArrayList a  = new ArrayList();
        System.out.println(a.get(199));
    }
}
