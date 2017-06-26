/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author User
 * 
 * TODO
 * dorobić liczbę maksymalną osób
 * dorobić metody wsiadania i wysiadania
 * z wyjątkami
 * 
 */
public class Car {
    private boolean engineState = false;

    public boolean isEngineState() {
        return engineState;
    }

    public void setEngineState(boolean engineState) {
        this.engineState = engineState;
    }
    
    public void start() throws CarStartEngineException{
        if(engineState){
            throw new CarStartEngineException();
        }
        engineState = true;
    }
    public void stop(){
        engineState = false;
    }
}
