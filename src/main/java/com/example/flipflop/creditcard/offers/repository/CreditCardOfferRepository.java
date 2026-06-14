package com.example.flipflop.creditcard.offers.repository;

import com.example.flipflop.creditcard.offers.entity.CreditCardOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditCardOfferRepository extends JpaRepository<CreditCardOffer, Integer> {

    @Query("SELECT o FROM CreditCardOffer o WHERE o.cibilScoreRequired <= :cibilScore AND o.rewardPointsRequired <= :creditPoints")
    List<CreditCardOffer> findEligibleOffers(@Param("cibilScore") int cibilScore, @Param("creditPoints") int creditPoints);
}
