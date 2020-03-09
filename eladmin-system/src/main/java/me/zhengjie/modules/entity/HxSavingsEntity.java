package me.zhengjie.modules.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "hx_savings", schema = "huaxingSCRM", catalog = "")
public class HxSavingsEntity {
    private Integer id;
    private BigDecimal savingsMoney;
    private BigDecimal totalMoney;

    @Basic
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "savings_money")
    public BigDecimal getSavingsMoney() {
        return savingsMoney;
    }

    public void setSavingsMoney(BigDecimal savingsMoney) {
        this.savingsMoney = savingsMoney;
    }

    @Basic
    @Column(name = "total_money")
    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HxSavingsEntity that = (HxSavingsEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(savingsMoney, that.savingsMoney) &&
                Objects.equals(totalMoney, that.totalMoney);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, savingsMoney, totalMoney);
    }
}
