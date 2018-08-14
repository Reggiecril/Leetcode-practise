package mergeIntervals;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> list=new ArrayList<>();
        if(intervals==null||intervals.size()<2)return intervals;
        intervals.sort((o1,o2)-> Integer.compare(o1.start,o2.start));
        Interval in=intervals.get(0);
        for(int i=1;i<intervals.size();i++){
            int max=Math.max(in.end,intervals.get(i).start);
            if(max==in.end){
                in.end=intervals.get(i).end;
            }else{
                list.add(in);
                in=intervals.get(i);
            }
        }
        list.add(in);
        return list;
    }
}
  class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
