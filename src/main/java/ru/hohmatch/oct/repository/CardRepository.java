package ru.hohmatch.oct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hohmatch.oct.model.Card;

public interface CardRepository extends JpaRepository<Card, Integer> {

}