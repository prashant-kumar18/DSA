//import java.util.ArrayList;
//import java.util.List;
//
//public class Solution {
//    public static void main(String[] args) {
//        RecentRequest recentRequest = new RecentRequest();
//
//
//    }
//}
//
//public class RecentRequest {
//
//    List<Integer> reqTime;
//    int counter;
//
//    RecentRequest() {
//        reqTime = new ArrayList<>();
//        counter = 0;
//    }
//
//    public int heartbeat(int t) {
//        int range1 = t - 1000;
//
//        reqTime.add(t);
//
//        for (int i = 0; i < reqTime.size(); i++) {
//
//            if (reqTime.get(i) >= range1) {
//                counter++;
//            }
//        }
//
//        return counter + 1;
//    }
//}
