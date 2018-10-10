package decodeWays;

public class Demo {
    public int numDecodings(String s) {
        //get s length
        int length=s.length();
        int n=length+1;
        //initalize a array
        int[] newInt=new int[n];
        //value last integer
        newInt[n-1]=1;
        //0:1
        newInt[n-2]=s.charAt(n-2)=='0'?0:1;
        //[2,3,4,2,3,4]
        //[4,2,2,2,2,1,1]
        for(int i=n-3;i>=0;i--){
            if(s.charAt(i)=='0')continue;
            else
                newInt[i]=(Integer.parseInt(s.substring(i,i+2)))<=26?newInt[i+1]+newInt[i+2]:newInt[i+1];
        }
        return newInt[0];
    }
}
