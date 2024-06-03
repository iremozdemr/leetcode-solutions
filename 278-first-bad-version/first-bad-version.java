/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n == 1){
            return 1;
        }
        else if(n<9){
            int result = -1;
            for(int i=1; i<=n; i++){
                if(isBadVersion(i) == true){
                    result = i;
                    break;
                }
            }
            return result;
        }
        else if(isBadVersion(n) == true && isBadVersion(n-1) == false){
            return n;
        }
        else{
            long result = -1;
            long start = 1;
            long end = n;

            while(start < end){
                long middle = (start+end)/2;
                if(isBadVersion((int) middle) == false){
                    start = middle;
                }
                else{
                    end = middle;
                }
                if(isBadVersion((int) middle) == true){
                    if(isBadVersion((int) (middle-1)) == false){
                        result = middle;
                        break;
                    }
                }
            }

            return (int) result;
        }
    }
}