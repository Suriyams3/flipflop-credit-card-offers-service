package com.example.flipflop.creditcard.offers.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "credit_card_offers")
public class CreditCardOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "offer_id")
    private Integer offerId;

    @Column(name = "offer_name", nullable = false)
    private String offerName;

    @Column(name = "sponsor_name", nullable = false)
    private String sponsorName;

    @Column(name = "offer_valid_upto", nullable = false)
    private LocalDate offerValidUpto;

    @Column(name = "discount_percentage", nullable = false)
    private BigDecimal discountPercentage;

    @Column(name = "offer_description")
    private String offerDescription;

    @Column(name = "reward_points_required", nullable = false)
    private Integer rewardPointsRequired;

    @Column(name = "cibil_score_required", nullable = false)
    private Integer cibilScoreRequired;

    // Default Constructor
    public CreditCardOffer() {}

    // Getters and Setters
    public Integer getOfferId() { return offerId; }
    public void setOfferId(Integer offerId) { this.offerId = offerId; }

    public String getOfferName() { return offerName; }
    public void setOfferName(String offerName) { this.offerName = offerName; }

    public String getSponsorName() { return sponsorName; }
    public void setSponsorName(String sponsorName) { this.sponsorName = sponsorName; }

    public LocalDate getOfferValidUpto() { return offerValidUpto; }
    public void setOfferValidUpto(LocalDate offerValidUpto) { this.offerValidUpto = offerValidUpto; }

    public BigDecimal getDiscountPercentage() { return discountPercentage; }
    public void setDiscountPercentage(BigDecimal discountPercentage) { this.discountPercentage = discountPercentage; }

    public String getOfferDescription() { return offerDescription; }
    public void setOfferDescription(String offerDescription) { this.offerDescription = offerDescription; }

    public Integer getRewardPointsRequired() { return rewardPointsRequired; }
    public void setRewardPointsRequired(Integer rewardPointsRequired) { this.rewardPointsRequired = rewardPointsRequired; }

    public Integer getCibilScoreRequired() { return cibilScoreRequired; }
    public void setCibilScoreRequired(Integer cibilScoreRequired) { this.cibilScoreRequired = cibilScoreRequired; }
}