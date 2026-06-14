package com.example.flipflop.creditcard.offers.controller;


import com.example.flipflop.creditcard.offers.entity.CreditCardOffer;
import com.example.flipflop.creditcard.offers.repository.CreditCardOfferRepository;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CreditCardOffersController {

    @Autowired
    private CreditCardOfferRepository offerRepository;

    @GetMapping("/offers")
    @RateLimiter(name = "offersRateLimiter") // References the config name in application.yml
    public List<CreditCardOffer> getOffers(
            @RequestParam("cibilScore") int cibilScore,
            @RequestParam("creditPoints") int creditPoints) {

        return offerRepository.findEligibleOffers(cibilScore, creditPoints);
    }
}