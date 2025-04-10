package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class PortfolioSecurity {

    @Id
    @GeneratedValue()
    private long id;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "security_id", nullable = false)
    private Security security;

    @Column(nullable = false)
    private int quantity;

    protected PortfolioSecurity() {}

    public PortfolioSecurity(Portfolio portfolio, Security security, int quantity) {
        this.portfolio = portfolio;
        this.security = security;
        this.quantity = quantity;
    }

    public long getId() { return id; }

    public Portfolio getPortfolio() { return portfolio; }

    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }

    public Security getSecurity() { return security; }

    public void setSecurity(Security security) { this.security = security; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }
}
