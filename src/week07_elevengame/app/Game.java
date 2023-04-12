
package week07_elevengame.app;

import week07_elevengame.data.DataStore;
import java.util.ArrayList;
import java.util.List;
import week07_elevengame.utils.GameInterface;

public class Game implements GameInterface {
    
    private ArrayList<Card> deck = new ArrayList<>();
    private Card[] table = new Card[DataStore.getNCards()];

    public Game() {
        generateDeck();
        getRandomTable();
    }
    
    private void generateDeck(){
        Card card;
        for (int i = 0; i < DataStore.loadValues().length; i++){
            for (int j = 0; j < DataStore.loadSymbols().length; j++){
                card = new Card(DataStore.loadValues()[i], DataStore.loadSymbols()[j], DataStore.loadNPoints()[i]);
                deck.add(card);
            }
        }
    }
    
    private void getRandomTable(){
        for (int i = 0; i < 9; i++) {
            int r = (int) (Math.random() * (deck.size()));
            table[i] = deck.get(r);
            deck.remove(r);
        }
    }
    
    @Override
    public String getName() {
        return DataStore.getName();
    }

    @Override
    public int nCards() {
        return DataStore.getNCards();
    }

    @Override
    public int getDeckSize() {
        return deck.size();
    }

    @Override
    public String getCardDescriptionAt(int index) {
        return String.format("%10s - %s",table[index].getSymbol(), table[index].getValue()); 
    }

    @Override
    public boolean anotherPlayIsPossible() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean playAndReplace(List<Integer> iSelectedCards) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean isWon() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
