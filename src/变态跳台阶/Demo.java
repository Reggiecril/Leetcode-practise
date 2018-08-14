package 变态跳台阶;

public class Demo {
//    public int JumpFloorII(int target) {
//        int sum=0;
//        for(int i=1;i<=target;i++){
//            sum+=jump(target-i);
//        }
//        return sum;
//    }
//    private int jump(int target){
//        if(target==0)return 1;
//        else if(target<0)return 0;
//        int sum=0;
//        for(int i=0;i<target;i++){
//            sum+=jump(target-i-1);
//        }
//        return sum;
//    }

    public int JumpFloorII(int target) {
        if (target <= 0) {
            return -1;
        } else if (target == 1) {
            return 1;
        } else {
            return 2 * JumpFloorII(target - 1);
        }
    }
}
