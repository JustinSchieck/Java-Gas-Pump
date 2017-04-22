/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductFile;

/**
 *
 * @author Justin
 */
public class GasTypes {
    private String name;
    private double cost;
    
    //constructor
    public GasTypes(String name,double cost)
    {

        this.name = name;
        this.cost = cost;
    }
    
    public String getName()
    {
        return this.name;
    }
    

    public double getCost()
    {
        return this.cost;
    }
    
    @Override
    public String toString()
    {
        return "\nProduct Name:\t" + getName() + "\nCost per unit:\t" + getCost();
    }
}

