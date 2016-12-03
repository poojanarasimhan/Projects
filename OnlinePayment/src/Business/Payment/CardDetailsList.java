/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Payment;

import java.util.ArrayList;

/**
 *
 * @author Pooja Narasimhan
 */
public class CardDetailsList {
    private ArrayList<CardDetails> cardDetailsList;
    
    public CardDetailsList(){
   cardDetailsList = new ArrayList<>();
}

    public ArrayList<CardDetails> getCardDetailsList() {
        return cardDetailsList;
    }

    public void setCardDetailsList(ArrayList<CardDetails> cardDetailsList) {
        this.cardDetailsList = cardDetailsList;
    }
     public CardDetails createCardDetails() {
        CardDetails cardDetails = new CardDetails();
        cardDetailsList.add(cardDetails);
        return cardDetails;
    }
}
