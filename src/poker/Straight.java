/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

/**
 *
 * @author hp
 */
public class Straight extends Hand implements IHand {

    public Straight(String s) 
    {
        super(s);
    }

    @Override
    public boolean drawHand() 
    {
        return this.straight();
    }
    
}
