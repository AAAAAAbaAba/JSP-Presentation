package wzy.jsp.simplest.demo.domain.algorithm.represent;

import wzy.jsp.simplest.demo.domain.algorithm.represent.DelayTimeRepresentModel;
import wzy.jsp.simplest.demo.domain.communication.Solution;


/**
 *
 */
public class SAParametersWithDelayTimeRepresentModel {
    private DelayTimeRepresentModel delayTimeRepresentModel;
    //Penalty value for hard constraints violating
    private int I=1000;
    //Loop num in annealing
    private int loopN=1000;
    //Min temperature to terminate
    private double minTemperature=0.01;
    //Init temperature
    private double temperature0=10000;
    //Temperature cooling coefficient
    private double a=0.95;




    private Solution solution;


    public SAParametersWithDelayTimeRepresentModel(DelayTimeRepresentModel delayTimeRepresentModel, Solution solution){
        this.delayTimeRepresentModel=delayTimeRepresentModel;
        this.solution=solution;
    }

    public SAParametersWithDelayTimeRepresentModel(DelayTimeRepresentModel delayTimeRepresentModel, Solution solution,
                                                   int I,int loopN,double minTemperature,double temperature0, double a){
        this.delayTimeRepresentModel=delayTimeRepresentModel;
        this.solution=solution;
        this.I=I;
        this.loopN=loopN;
        this.minTemperature=minTemperature;
        this.temperature0=temperature0;
        this.a=a;
    }

    public DelayTimeRepresentModel getDelayTimeRepresentModel() {
        return delayTimeRepresentModel;
    }

    public int getI() {
        return I;
    }

    public int getLoopN() {
        return loopN;
    }

    public double getMinTemperature() {
        return minTemperature;
    }

    public double getTemperature0() {
        return temperature0;
    }

    public double getA() {
        return a;
    }

    public Solution getSolution() {
        return solution;
    }

    public void setSolution(Solution solution) {
        this.solution = solution;
    }
}
