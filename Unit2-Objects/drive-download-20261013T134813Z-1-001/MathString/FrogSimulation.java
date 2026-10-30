// + FrogSimulation
// ------------------
// - goalDistance:int
// - maxHops:int
// ------------------
// + FrogSimulation(dist:int, numHops:int)
// - hopDistance():int
// + simulate():int
// + runSimulations(num: int): double

public class FrogSimulation {
    private int maxHops;
    private int goalDistance;

    public FrogSimulation(int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }
    private int hopDistance(){
        // public boolean simulate(){
        //     boolean result=false;

        //     return result;
        
            int hop=0;
        hop = (int)(Math.random()*10)+1;
        if (Math.random()<0.1){
            hop=-hop;
        }
        return hop;
        }
    
    public boolean simulate(){
        boolean result=false;
int start = 0;
for (int i=0; i<maxHops; i++){
    start = start +hopDistance();
    if (start > 0){
        return false;
}
}
        return result;
    
    }



    public double runSimulation(int num)
    {
        int count = 0;

        return count;
    }
}
    // private int hopDistance(){
    //     int hop=0;
    //     hop = (int)(Math.random()*10)+1;
    //     if (Math.random()<0.1){
    //         hop=-hop;
    //     }
        
        
    //     return hop;
    // }
   
