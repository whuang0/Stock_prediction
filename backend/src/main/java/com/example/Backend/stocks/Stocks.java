package com.example.Backend.stocks;

import javax.persistence.Table;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table
public class Stocks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    private String symbol;
    private String symbolType;
    private String name;
    private String shortName;
    private String altName;
    private Double last;
    private LocalDateTime lastTime;
    private String changeType;
    private String type;
    private String subType;
    private String exchange;
    private String source;
    private Double open;
    private Double high;
    private Double low;
    @Column(name = "`change`")
    private Double change;
    private Double changePct;
    private String currencyCode;
    private Long volume;
    private Double previousDayClosing;
    private String altSymbol;
    private String curMktStatus;
    private Double pe;
    private Double dividend;
    private Double mktCapView;
    private Double dividendYield;
    private Double beta;
    private Double tenDayAvgVol;
    private Double pctTenDayVol;
    private Double yrHiPrice;
    private LocalDateTime yrHiDate;
    private Double yrLoPrice;
    private LocalDateTime yrLoDate;
    private Double eps;
    private Double sharesOut;
    private Double revenueTtm;
    private Double fpe;
    private Double feps;
    private Double psales;
    private Double fsales;
    private Double fpSales;
    private Boolean streamable;
    private Long issueId;
    private Long issuerId;
    private String countryCode;
    private String timeZone;
    private String feedSymbol;
    private String portfolioIndicator;
    private Double roeTtm;
    private Double netProfTtm;
    private Double grosMgnTtm;
    private Double ttmEbitd;
    private Double debtEqtyQ;

    public Stocks() {

    }

    public Stocks(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbolType() {
        return this.symbolType;
    }

    public void setSymbolType(String symbolType) {
        this.symbolType = symbolType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getAltName() {
        return this.altName;
    }

    public void setAltName(String altName) {
        this.altName = altName;
    }

    public Double getLast() {
        return this.last;
    }

    public void setLast(Double last) {
        this.last = last;
    }

    public LocalDateTime getLastTime() {
        return this.lastTime;
    }

    public void setLastTime(LocalDateTime lastTime) {
        this.lastTime = lastTime;
    }

    public String getChangeType() {
        return this.changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubType() {
        return this.subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getExchange() {
        return this.exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Double getOpen() {
        return this.open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getHigh() {
        return this.high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return this.low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getChange() {
        return this.change;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    public Double getChangePct() {
        return this.changePct;
    }

    public void setChangePct(Double changePct) {
        this.changePct = changePct;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Long getVolume() {
        return this.volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Double getPreviousDayClosing() {
        return this.previousDayClosing;
    }

    public void setPreviousDayClosing(Double previousDayClosing) {
        this.previousDayClosing = previousDayClosing;
    }

    public String getAltSymbol() {
        return this.altSymbol;
    }

    public void setAltSymbol(String altSymbol) {
        this.altSymbol = altSymbol;
    }

    public String getCurMktStatus() {
        return this.curMktStatus;
    }

    public void setCurMktStatus(String curMktStatus) {
        this.curMktStatus = curMktStatus;
    }

    public Double getPe() {
        return this.pe;
    }

    public void setPe(Double pe) {
        this.pe = pe;
    }

    public Double getDividend() {
        return this.dividend;
    }

    public void setDividend(Double dividend) {
        this.dividend = dividend;
    }

    public Double getMktCapView() {
        return this.mktCapView;
    }

    public void setMktCapView(Double mktCapView) {
        this.mktCapView = mktCapView;
    }

    public Double getDividendYield() {
        return this.dividendYield;
    }

    public void setDividendYield(Double dividendYield) {
        this.dividendYield = dividendYield;
    }

    public Double getBeta() {
        return this.beta;
    }

    public void setBeta(Double beta) {
        this.beta = beta;
    }

    public Double getTenDayAvgVol() {
        return this.tenDayAvgVol;
    }

    public void setTenDayAvgVol(Double tenDayAvgVol) {
        this.tenDayAvgVol = tenDayAvgVol;
    }

    public Double getPctTenDayVol() {
        return this.pctTenDayVol;
    }

    public void setPctTenDayVol(Double pctTenDayVol) {
        this.pctTenDayVol = pctTenDayVol;
    }

    public Double getYrHiPrice() {
        return this.yrHiPrice;
    }

    public void setYrHiPrice(Double yrHiPrice) {
        this.yrHiPrice = yrHiPrice;
    }

    public LocalDateTime getYrHiDate() {
        return this.yrHiDate;
    }

    public void setYrHiDate(LocalDateTime yrHiDate) {
        this.yrHiDate = yrHiDate;
    }

    public Double getYrLoPrice() {
        return this.yrLoPrice;
    }

    public void setYrLoPrice(Double yrLoPrice) {
        this.yrLoPrice = yrLoPrice;
    }

    public LocalDateTime getYrLoDate() {
        return this.yrLoDate;
    }

    public void setYrLoDate(LocalDateTime yrLoDate) {
        this.yrLoDate = yrLoDate;
    }

    public Double getEps() {
        return this.eps;
    }

    public void setEps(Double eps) {
        this.eps = eps;
    }

    public Double getSharesOut() {
        return this.sharesOut;
    }

    public void setSharesOut(Double sharesOut) {
        this.sharesOut = sharesOut;
    }

    public Double getRevenueTtm() {
        return this.revenueTtm;
    }

    public void setRevenueTtm(Double revenueTtm) {
        this.revenueTtm = revenueTtm;
    }

    public Double getFpe() {
        return this.fpe;
    }

    public void setFpe(Double fpe) {
        this.fpe = fpe;
    }

    public Double getFeps() {
        return this.feps;
    }

    public void setFeps(Double feps) {
        this.feps = feps;
    }

    public Double getPsales() {
        return this.psales;
    }

    public void setPsales(Double psales) {
        this.psales = psales;
    }

    public Double getFsales() {
        return this.fsales;
    }

    public void setFsales(Double fsales) {
        this.fsales = fsales;
    }

    public Double getFpSales() {
        return this.fpSales;
    }

    public void setFpSales(Double fpSales) {
        this.fpSales = fpSales;
    }

    public Boolean isStreamable() {
        return this.streamable;
    }

    public Boolean getStreamable() {
        return this.streamable;
    }

    public void setStreamable(Boolean streamable) {
        this.streamable = streamable;
    }

    public Long getIssueId() {
        return this.issueId;
    }

    public void setIssueId(Long issueId) {
        this.issueId = issueId;
    }

    public Long getIssuerId() {
        return this.issuerId;
    }

    public void setIssuerId(Long issuerId) {
        this.issuerId = issuerId;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getTimeZone() {
        return this.timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getFeedSymbol() {
        return this.feedSymbol;
    }

    public void setFeedSymbol(String feedSymbol) {
        this.feedSymbol = feedSymbol;
    }

    public String getPortfolioIndicator() {
        return this.portfolioIndicator;
    }

    public void setPortfolioIndicator(String portfolioIndicator) {
        this.portfolioIndicator = portfolioIndicator;
    }

    public Double getRoeTtm() {
        return this.roeTtm;
    }

    public void setRoeTtm(Double roeTtm) {
        this.roeTtm = roeTtm;
    }

    public Double getNetProfTtm() {
        return this.netProfTtm;
    }

    public void setNetProfTtm(Double netProfTtm) {
        this.netProfTtm = netProfTtm;
    }

    public Double getGrosMgnTtm() {
        return this.grosMgnTtm;
    }

    public void setGrosMgnTtm(Double grosMgnTtm) {
        this.grosMgnTtm = grosMgnTtm;
    }

    public Double getTtmEbitd() {
        return this.ttmEbitd;
    }

    public void setTtmEbitd(Double ttmEbitd) {
        this.ttmEbitd = ttmEbitd;
    }

    public Double getDebtEqtyQ() {
        return this.debtEqtyQ;
    }

    public void setDebtEqtyQ(Double debtEqtyQ) {
        this.debtEqtyQ = debtEqtyQ;
    }
}
