public class StepTracker {
    private int days;
    private int activeDays;
    private int totalSteps;
    private int minActive;


    public StepTracker(int x){
        this. minActive=x;
    }

    public int getDays(){
        return days;
    }

    public int getActiveDays(){
        return activeDays;
    }

    public int activeDays() {
        return activeDays;
    }

    public int getTotalSteps(){
        return totalSteps;
    }

    public int getStepsForActiveDay(){
        return minActive;
    }


    public double averageSteps(){
        if (days==0) return 0.0;
        return (double) totalSteps/days;
    }

    public void addDailySteps(int s){
        days++;
        totalSteps+=s;
        if (s> minActive) activeDays++;
    }
}
