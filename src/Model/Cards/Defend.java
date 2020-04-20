package Model.Cards;

import Model.Buff;
import Model.Card;
import Model.Effects.ApplyBuff;
import Model.Effects.Block;
import Model.Effects.Damage;
import Model.Effects.Effect;
import Model.*;

import java.util.ArrayList;

public class Defend extends Card {

    public Defend(String name, String rarity, String type, String color, String description, int energy, boolean upgrade) {
        super(name, rarity, type, color, description, energy, upgrade);
    }

    /*
        Gain 5(8) Block.
    */
    public ArrayList<Effect> getEffects(Enemy e){
        ArrayList<Effect> effects = new ArrayList<Effect>();
        Effect effect;
        if( upgrade ){
            effect = new Block(5,null);
        }
        else{
            effect = new Damage(8,null);
        }

        effects.add(effect);

        return effects;
    }

}