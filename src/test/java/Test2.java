import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Test2 {
    @Test
    void f1(){
        class Solution {
            private LinkedList<String> res;
            private LinkedList<String> path = new LinkedList<>();

            public List<String> findItinerary(List<List<String>> tickets) {
                Collections.sort(tickets, (a, b) -> a.get(1).compareTo(b.get(1)));
                path.add("JFK");
                boolean[] used = new boolean[tickets.size()];
                backTracking((ArrayList) tickets, used);
                return res;
            }

            public boolean backTracking(ArrayList<List<String>> tickets, boolean[] used) {
                if (path.size() == tickets.size() + 1) {
                    res = new LinkedList(path);
                    return true;
                }

                for (int i = 0; i < tickets.size(); i++) {
                    if (!used[i] && tickets.get(i).get(0).equals(path.getLast())) {
                        path.add(tickets.get(i).get(1));
                        used[i] = true;

                        if (backTracking(tickets, used)) {
                            return true;
                        }

                        used[i] = false;
                        path.removeLast();
                    }
                }
                return false;
            }
        }
        long l = System.currentTimeMillis();
        new Solution().findItinerary(tickets);
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
    @Test
    void f2(){
        class Solution {
            HashMap<String,List<String>> map =  new HashMap<>();
            List<String> res = new ArrayList<>();
            int count ;
            HashMap<String ,HashMap<String,Integer>> used = new HashMap<>();
            public List<String> findItinerary(List<List<String>> tickets) {
                count = tickets.size();
                List<List<String>> target = new ArrayList<>();
                for(List<String> ticket : tickets){
                    List<String> tar = map.getOrDefault(ticket.get(0),new ArrayList<String>());
                    tar.add(ticket.get(1));
                    map.put(ticket.get(0),tar);
                    HashMap<String,Integer> use = used.getOrDefault(ticket.get(0),new HashMap<String,Integer>());
                    int num = use.getOrDefault(ticket.get(1),0);
                    use.put(ticket.get(1),num+1);
                    used.put(ticket.get(0),use);
                    target.add(tar);
                }

                for(List<String> tar : target){
                    tar.sort(String::compareTo);
                }
                transerval("JFK");
                return res;
            }

            int transerval(String from){
                res.add(from);
                if(res.size() - 1 == count)
                    return 1;
                List<String> to = map.get(from);
                HashMap<String,Integer> use = used.get(from);
                if(to!= null){
                    for(String target : to){
                        int num = use.get(target);
                        if(num > 0) {
                            use.put(target,num-1);
                            int ans = transerval(target);
                            if(ans == 1) return 1;
                            use.put(target,num);
                        }
                    }
                }
                res.remove(res.size()-1);
                return 0;
            }
        }
        long l = System.currentTimeMillis();
        new Solution().findItinerary(tickets);
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
    static List<List<String>> tickets;
    @BeforeAll
    static void ff(){
        tickets =  new ArrayList<>();
        List<String> ticket1 = new ArrayList<>();
        ticket1.add("EZE");
        ticket1.add("TIA");
        tickets.add(ticket1);
        List<String> ticket2 = new ArrayList<>();
        ticket2.add("EZE");
        ticket2.add("HBA");
        tickets.add(ticket2);
        List<String> ticket3 = new ArrayList<>();
        ticket3.add("AXA");
        ticket3.add("TIA");
        tickets.add(ticket3);
        List<String> ticket4 = new ArrayList<>();
        ticket4.add("JFK");
        ticket4.add("AXA");
        tickets.add(ticket4);
        List<String> ticket5 = new ArrayList<>();
        ticket5.add("ANU");
        ticket5.add("JFK");
        tickets.add(ticket5);
        List<String> ticket6 = new ArrayList<>();
        ticket6.add("ADL");
        ticket6.add("ANU");
        tickets.add(ticket6);
        List<String> ticket7 = new ArrayList<>();
        ticket7.add("TIA");
        ticket7.add("AUA");
        tickets.add(ticket7);
        List<String> ticket8 = new ArrayList<>();
        ticket8.add("ANU");
        ticket8.add("AUA");
        tickets.add(ticket8);
        List<String> ticket9 = new ArrayList<>();
        ticket9.add("ADL");
        ticket9.add("EZE");
        tickets.add(ticket9);
        List<String> ticket10 = new ArrayList<>();
        ticket10.add("ADL");
        ticket10.add("EZE");
        tickets.add(ticket10);
        List<String> ticket11 = new ArrayList<>();
        ticket11.add("EZE");
        ticket11.add("ADL");
        tickets.add(ticket11);
        List<String> ticket12 = new ArrayList<>();
        ticket12.add("AXA");
        ticket12.add("EZE");
        tickets.add(ticket12);
        List<String> ticket13 = new ArrayList<>();
        ticket13.add("AUA");
        ticket13.add("AXA");
        tickets.add(ticket13);
        List<String> ticket14 = new ArrayList<>();
        ticket14.add("JFK");
        ticket14.add("AXA");
        tickets.add(ticket14);
        List<String> ticket15 = new ArrayList<>();
        ticket15.add("AXA");
        ticket15.add("AUA");
        tickets.add(ticket15);
        List<String> ticket16 = new ArrayList<>();
        ticket16.add("AUA");
        ticket16.add("ADL");
        tickets.add(ticket16);
        List<String> ticket17 = new ArrayList<>();
        ticket17.add("ANU");
        ticket17.add("EZE");
        tickets.add(ticket17);
        List<String> ticket18 = new ArrayList<>();
        ticket18.add("TIA");
        ticket18.add("ADL");
        tickets.add(ticket18);
        List<String> ticket19 = new ArrayList<>();
        ticket19.add("EZE");
        ticket19.add("ANU");
        tickets.add(ticket19);
        List<String> ticket = new ArrayList<>();
        ticket.add("AUA");
        ticket.add("ANU");
        tickets.add(ticket);
    }
}
