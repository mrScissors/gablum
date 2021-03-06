package com.gablum.proposals.proposal.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "proposals")
public class Proposal {
    @Id
    private String _id;
    private String proposalId = UUID.randomUUID().toString();
    private ProductDetails productDetails;
    private String productName;
    private List <String> productSpecList;
    private String userID;
    private String productId;
    private String businessDomain;
    private String businessSubDomain;
    private String createdBy;
    private String updatedBy;
    private int quantityValue;
    private String quantityUnit;
    private float price;
    private Date deliveryDate;
    private int creditPeriod;
    private boolean qualityCertification;
    private boolean methodOfSupply;
    private Date regStartDate;
    private Date regEndDate;
    private Date auctionStartDate;
    private Date auctionEndDate;
    private Date createdOn;
    private Date updatedOn;
    private int thresholdParticipants;
    private Set<String> viewSellerEmails = new HashSet<>();
    private int interested;
    private List<String> invitedUsersEmail = new ArrayList<>();
    private List<String> interestedUsersEmail = new ArrayList<>();
    private int priceWeight;
    private int creditPeriodWeight;
    private int deliveryDateWeight;
    private int methodOfSupplyWeight;
    private int qualityCertificationWeight;
    private String productDescription;
    private boolean auctionStarted;

    public String toStringContract(){
        return _id + productName + String.valueOf(quantityValue) + quantityUnit
                + String.valueOf(price) + String.valueOf(priceWeight)
                + String.valueOf(deliveryDateWeight) + String.valueOf(qualityCertification) + String.valueOf(qualityCertificationWeight)
                + String.valueOf(methodOfSupply) + String.valueOf(methodOfSupplyWeight);
    }
    @Override
    public String toString() {
        return "Proposal{" +
                "proposalId='" + proposalId + '\'' +
                ", productId='" + productId + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", businessDomain='" + businessDomain + '\'' +
                ", businessSubDomain='" + businessSubDomain + '\'' +
                ", productName='" + productName + '\'' +
                ", quantityValue=" + String.valueOf(quantityValue) +
                ", quantityUnit='" + quantityUnit + '\'' +
                ", price=" + String.valueOf(price) +
                ", deliveryDate=" + String.valueOf(deliveryDate) +
                ", creditPeriod=" + String.valueOf(creditPeriod) + "months" +
                ", qualityCertification=" + qualityCertification +
                ", methodOfSupply=" + methodOfSupply +
                ", regStartDate=" + regStartDate +
                ", regEndDate=" + regEndDate +
                ", auctionStartDate=" + auctionStartDate +
                ", auctionEndDate=" + auctionEndDate +
                ", createdOn=" + createdOn +
                ", updatedOn=" + updatedOn +
                ", priceWeight=" + priceWeight +
                ", creditPeriodWeight=" + creditPeriodWeight +
                ", deliveryDateWeight=" + deliveryDateWeight +
                ", methodOfSupplyWeight=" + methodOfSupplyWeight +
                ", qualityCertificationWeight=" + qualityCertificationWeight +
                '}';
    }
    public String toBeEncrypted() {
        return createdBy + String.valueOf(createdOn) + businessDomain + businessSubDomain + productName
                + String.valueOf(quantityValue) + quantityUnit + String.valueOf(price) + String.valueOf(priceWeight)
                + String.valueOf(deliveryDate) + String.valueOf(deliveryDateWeight) + String.valueOf(creditPeriod);
    }
}