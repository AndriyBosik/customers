package com.example.customers.entity;

import javax.json.bind.annotation.JsonbNillable;
import java.sql.Timestamp;

@JsonbNillable
public class Slip {

    private Integer id;
    private String slipNumber;
    private Double tonnage;
    private Timestamp createdAt;
    private Integer customerId;
    private String customerName;
    private Long shiftId;

    public Slip() {}

    public Slip(Integer id, String slipNumber, Double tonnage) {
        this.id = id;
        this.slipNumber = slipNumber;
        this.tonnage = tonnage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSlipNumber() {
        return slipNumber;
    }

    public void setSlipNumber(String slipNumber) {
        this.slipNumber = slipNumber;
    }

    public Double getTonnage() {
        return tonnage;
    }

    public void setTonnage(Double tonnage) {
        this.tonnage = tonnage;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getShiftId() {
        return shiftId;
    }

    public void setShiftId(Long shiftId) {
        this.shiftId = shiftId;
    }
}
