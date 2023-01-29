public class DRoot {
    public static int digital_root(int n) {
        int sum = 0;
        if(n == 0){
          return sum;
        }else{
          while(n >= 10){
            sum += n % 10;
            n /= 10;
          }
          sum += n;
        }
        
        return sum < 10 ? sum: digital_root(sum);
    }
}
