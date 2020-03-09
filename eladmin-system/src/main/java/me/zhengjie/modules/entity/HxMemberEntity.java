package me.zhengjie.modules.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "hx_member", schema = "huaxingSCRM", catalog = "")
public class HxMemberEntity {
    private int id;
    private Integer sId;
    private String memberName;
    private Integer memberLevel;
    private String memberNumber;
    private Integer memberSex;
    private Integer disease;
    private BigDecimal savingsMoney;
    private Integer ifDel;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "s_id")
    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    @Basic
    @Column(name = "member_name")
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Basic
    @Column(name = "member_level")
    public Integer getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(Integer memberLevel) {
        this.memberLevel = memberLevel;
    }

    @Basic
    @Column(name = "member_number")
    public String getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }

    @Basic
    @Column(name = "member_sex")
    public Integer getMemberSex() {
        return memberSex;
    }

    public void setMemberSex(Integer memberSex) {
        this.memberSex = memberSex;
    }

    @Basic
    @Column(name = "disease")
    public Integer getDisease() {
        return disease;
    }

    public void setDisease(Integer disease) {
        this.disease = disease;
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
    @Column(name = "if_del")
    public Integer getIfDel() {
        return ifDel;
    }

    public void setIfDel(Integer ifDel) {
        this.ifDel = ifDel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HxMemberEntity that = (HxMemberEntity) o;
        return id == that.id &&
                Objects.equals(sId, that.sId) &&
                Objects.equals(memberName, that.memberName) &&
                Objects.equals(memberLevel, that.memberLevel) &&
                Objects.equals(memberNumber, that.memberNumber) &&
                Objects.equals(memberSex, that.memberSex) &&
                Objects.equals(disease, that.disease) &&
                Objects.equals(savingsMoney, that.savingsMoney) &&
                Objects.equals(ifDel, that.ifDel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sId, memberName, memberLevel, memberNumber, memberSex, disease, savingsMoney, ifDel);
    }
}
