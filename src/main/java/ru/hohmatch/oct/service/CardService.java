package ru.hohmatch.oct.service;


import org.springframework.stereotype.Service;
import ru.hohmatch.oct.model.Card;
import ru.hohmatch.oct.repository.CardRepository;

import java.util.List;

@Service
public class CardService {

    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public Card get(int id){
        return cardRepository.findById(id).orElse(null);
    }

    public void create(int id, String text){
        cardRepository.save(new Card(id, text));
    }

    public void delete(int id){
        cardRepository.deleteById(id);
    }

    public void update(int id, String text){
        Card card = cardRepository.getReferenceById(id);
        card.setText(text);
        cardRepository.save(card);
    }

    public List<Card> getAll(){
        return cardRepository.findAll();
    }

}
