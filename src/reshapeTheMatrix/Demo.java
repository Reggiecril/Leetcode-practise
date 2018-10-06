package reshapeTheMatrix;

public class Demo {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length==0||nums[0].length==0)return null;
        int length=nums.length;
        int wide=nums[0].length;
        if(r*c==length*wide&&r<length||c<wide){
            int[][] newNum=new int[r][c];
            int count=0;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++)
                {
                    int originH=count/wide;
                    int originW=count%wide;
                    newNum[i][j]=nums[originH][originW];
                    count++;
                }
            }
            return newNum;
        }else
            return nums;
    }
}
