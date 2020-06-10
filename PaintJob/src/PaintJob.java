//Bob and the buckets

public class PaintJob {

    public static int getBucketCount(double width, double height,double areaPerBucket, int extraBuckets){

        if(width <=0 || height<=0 || areaPerBucket <=0 || extraBuckets <0 ){
            return -1;
        }else {
            double area= width*height;
            double allBucket= area/areaPerBucket;
            double getBucketCount= allBucket-extraBuckets;
//            Math.ceil is used by this way
//
//            This method returns the double value that is greater than or equal
//            to the argument and is equal to the nearest mathematical integer.
//            double a = 4.3;
//            double b = 1.0 / 0;
//            double c = 0.0;
//            double d = -0.0;
//            double e = -0.12;
//            Output:
//
//            5.0
//            Infinity
//            0.0
//                    -0.0
//                    -0.0

            return (int)Math.ceil(getBucketCount);
        }

    }
    // Method overloading
    public static int getBucketCount(double width,double height,double areaPerBucket){
        if(width <=0 || height <=0 || areaPerBucket<=0){
            return -1;
        }else {
            double area = width*height;
            double allBucket = area / areaPerBucket;

            return (int)Math.ceil(allBucket);

        }

    }
    public static int getBucketCount(double area, double areaPerBucket){
            if(area <=0 || areaPerBucket <= 0){
                return -1;
            }else {
                return (int)Math.ceil(area/areaPerBucket);
            }

    }


}
