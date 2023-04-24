package week09_competitionwithfiles;

public class Runner {
    private int number = -1;
    private String name;
    private long startTime = -1;
    private long finishTime = -1;
    
    private long runningTime = -1;

    public Runner(String name) {
        this.name = name;
    }

    public Runner(int number, String name) {
        this.number = number;
        this.name = name;
    }
    
    public static Runner getInstance(String registrace){
        String[] parts = registrace.split(" +");
        int number1 = Integer.parseInt(parts[0]);
        String name1 = parts[1];
        return new Runner(number1, name1);        
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getFinishTime() {
        return finishTime;
    }
    
    public long getRunningTime(){
        return runningTime;
    }

    public void setFinishTime(long finishTime) {
        this.finishTime = finishTime;
        runningTime = runningTime();
    }
    
    private long runningTime(){
        return finishTime - startTime;
    }

    @Override
    public String toString() {
        if(startTime == -1){
            return String.format("%d %s", number, name);
        } else if (finishTime == -1){
            return String.format("%d %s %d", number, name, startTime); 
        } else {
            return String.format("%d %s %d %d %d", number, name, startTime, finishTime, runningTime); 
        }
    }
    
    
    
    
    
    
}
