public class Library {
    private String name;
    Calculator[] calculators = new Calculator[10];
    int nbCalc;

    public Library(){
        this.name = "default library";
    }

    public int buyCalculator(Calculator calculator){
        if(calculator != null && nbCalc < calculators.length){
            calculators[nbCalc] = calculator;
            nbCalc++;
        }
        return nbCalc;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int sellLastCalculator(){
        if(nbCalc > 0){
            calculators[nbCalc] = null;
            nbCalc--;
        }
        return nbCalc;
    }
}
