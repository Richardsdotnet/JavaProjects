package ChapterFive;

public class AutoPolicy {
    private int autoNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int autoNumber, String makeAndModel,String state){
        this.autoNumber = autoNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }
    public void setAutoNumber(int autoNumber){
        this.autoNumber = autoNumber;
    }
    public int getAutoNumber(){
        return autoNumber;
    }
    public void setMakeAndModel(String makeAndModel){
        this.makeAndModel = makeAndModel;
    }
    public String getMakeAndModel(){
        return makeAndModel;
    }
    public void setState(String stateCode){
        this.state = stateCode;
        if(state.equals("CT") || state.equals("MA")){
            System.out.println("no fault state");
            
        } else if (state.equals("ME") || state.equals("NH")) {
            System.out.println("no fault state");
            
        } else if (state.equals("NJ") || state.equals("NY")) {
            System.out.println("fault state");
            
        }else if(state.equals("PA") || state.equals("VT")){
            System.out.println("fault state");

        }else {
            System.out.println("invalid selection");
        }
    }
    public String getState(){
        return state;
    }
}
