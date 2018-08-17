package combinationSum3;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list=new ArrayList<>();
        combination(list,new ArrayList<>(),1,k,n);
        return list;

    }
    private void combination(List<List<Integer>> outList,List<Integer> inList,int start,int k,int n){

        if(inList.size()==k&&n==0){
            outList.add(new ArrayList<>(inList));
            return;
        }else {
            for (int i = start; i < 10; i++) {
                inList.add(i);
                combination(outList, inList, i + 1, k, n - i);
                inList.remove(inList.size() - 1);
            }
        }
    }
}
