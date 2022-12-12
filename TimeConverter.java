public class TimeConverter {
    public String Converted(int N){
        int h = N/3600;
        int m = (N - h*3600)/60;
        int s = (N - h*3600 - 60*m);
        return h+":"+m+":"+s;

    }
}
