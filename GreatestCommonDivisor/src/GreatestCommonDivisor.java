public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){

        if(first< 10 || second < 10){

            return -1;
        }
        //used math.min to find the smaller number e.g (12,30) 12 is smaller:)
        int maxDivisor= Math.min(first,second);
        int commonDivisor=1;
        // looping to find all factors
        for(int i=maxDivisor; i>=1;i--){
            //from above example 12 is smaller so i=12
            //Therefore, it will be first=12,12%12=1 and since it i-- means 12--
            // so next it will be 12%11 and so on... similarly second=30 %12 and so on..
            if((first % i == 0 ) && (second%i==0)){
                commonDivisor=i;
                break;
            }
        }
        return commonDivisor;
    }

}
