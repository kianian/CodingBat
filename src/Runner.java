public class Runner {

    public static void main(String[] args){
        int[] first = {1,2,3};
        int[] second = {2,3,4,5};
        int[] fourth = {13,1,13};
        int[] fifth = {1,1,2};
        System.out.println(hasTeen(1,2,3));
        System.out.println(array123(first));
        System.out.println(endsLy("stupidly"));
        System.out.println(no23(second));
        System.out.println(more20(21));
        System.out.println(closeFar(1,2,19));
        System.out.println(sum13(fourth));
        System.out.println(catDog("catdog"));
        System.out.println(canBalance(fifth));
        System.out.println(sumDigits("abc12d"));
    }
    //Warmup 1
    public static boolean hasTeen(int a, int b, int c) {
        boolean result = false;
        if((a>=13 && a<= 19)|| (b>=13 && b<= 19)|| (c>=13 && c<= 19)){
            result = true;
        }
        return result;
    }
    //Warmup 2
    public static boolean array123(int[] nums) {
        boolean result = false;
        for(int i=0; i<nums.length-2; i++){
            if(nums[i]==1 && nums[i+1]==2 && nums[i+2]==3 ){
                result = true;
            }
        }
        return result;
    }
    //String 1
    public static boolean endsLy(String str) {
        boolean result = false;
        int length = str.length();
        if(length > 1){
            String cut = str.substring(length-2);
            if(cut.equals("ly")){
                result = true;
            }
        }
        return result;
    }
    //Array 1
    public static boolean no23(int[] nums) {
        boolean result = true;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==2 || nums[i]==3){
                result= false;
            }
        }
        return result;
    }
    //Logic 1
    public static boolean more20(int n) {
        int change = n%20;
        if(change== 1 || change == 2){
            return true;
        }else{
            return false;
        }
    }
    //Logic 2
    public static boolean closeFar(int a, int b, int c) {
        if(Math.abs(a-b)<=1 && Math.abs(c-a)>1 && Math.abs(c-b)>1){
            return true;
        }else if(Math.abs(a-c)<=1 && Math.abs(b-a)>1 && Math.abs(c-b)>1){
            return true;
        }else{
            return false;
        }
    }
    //Array 2
    public static int sum13(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length; i++){
            sum += nums[i];
        }
        for(int j=0;j<nums.length; j++){
            if(nums[j]==13){
                sum = sum-13;
            }
            if(j!=0){
                if(nums[j-1]==13){
                    sum = sum - nums[j];
                }
            }
        }
        if(sum<0){
            sum=0;
        }
        return sum;
    }
    //String 2
    public static boolean catDog(String str) {
        int length = str.length();
        int catCount = 0;
        int dogCount = 0;
        for(int i=0; i<length; i++){
            if(i<length -2){
                if(str.substring(i,i+3).equals("dog")){
                    dogCount ++;
                }
                if(str.substring(i,i+3).equals("cat")){
                    catCount ++;
                }
            }
        }
        if(catCount == dogCount){
            return true;
        }else{
            return false;
        }
    }
    //Array 3
    public static boolean canBalance(int[] nums) {
        int sum1 = 0;
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            int sum2 = 0;
            sum1 += nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sum2 += nums[j];
            }
            if (sum1 == sum2) {
                result = true;
            }
        }
        return result;
    }
    //String 3
    public static int sumDigits(String str) {
        int length = str.length();
        int sum = 0;
        for(int i=0;i<length;i++){
            if(i<length-1){
                if(Character.isDigit(str.charAt(i))){
                    sum += Integer.parseInt(str.substring(i,i+1));
                }
            }
        }
        if(length>0){
            if(Character.isDigit(str.charAt(length-1))){
                sum += Integer.parseInt(str.substring(length-1));
            }
        }
        return sum;
    }
}