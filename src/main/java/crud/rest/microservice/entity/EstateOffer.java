package crud.rest.microservice.entity;

import javax.persistence.*;
import java.time.Instant;
import java.util.Currency;
import java.util.List;

@Entity
public class EstateOffer {
    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Embedded
    private EstateAdress adress;

    @Embedded
    private EstateOwner owner;

    @Column
    @ElementCollection(targetClass=String.class)
    private List<String> keywords;

    private Instant createdAt;
    private Currency currencyType;
    private double pricePerMeter;
    private double priceValue;
    private double areaSize;
    private int lotSize;
    private int floorTotal;
    private int floor;
    private int numberOfBathrooms;
    private int yearBuilt;
    private String description;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public EstateAdress getAdress() {
        return adress;
    }

    public void setAdress(EstateAdress adress) {
        this.adress = adress;
    }

    public EstateOwner getOwner() {
        return owner;
    }

    public void setOwner(EstateOwner owner) {
        this.owner = owner;
    }

    public Currency getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(Currency currencyType) {
        this.currencyType = currencyType;
    }

    public double getPricePerMeter() {
        return pricePerMeter;
    }

    public void setPricePerMeter(double pricePerMeter) {
        this.pricePerMeter = pricePerMeter;
    }

    public double getPriceValue() {
        return priceValue;
    }

    public void setPriceValue(double priceValue) {
        this.priceValue = priceValue;
    }

    public double getAreaSize() {
        return areaSize;
    }

    public void setAreaSize(double areaSize) {
        this.areaSize = areaSize;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public int getFloorTotal() {
        return floorTotal;
    }

    public void setFloorTotal(int floorTotal) {
        this.floorTotal = floorTotal;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EstateOffer that = (EstateOffer) o;

        return getId() != null ? getId().equals(that.getId()) : that.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
