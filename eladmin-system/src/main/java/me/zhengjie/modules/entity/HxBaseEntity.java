package me.zhengjie.modules.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hx_base", schema = "huaxingSCRM", catalog = "")
public class HxBaseEntity {
    private int id;
    private String baseName;
    private String baseValue;
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
    @Column(name = "base_name")
    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    @Basic
    @Column(name = "base_value")
    public String getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(String baseValue) {
        this.baseValue = baseValue;
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
        HxBaseEntity that = (HxBaseEntity) o;
        return id == that.id &&
                Objects.equals(baseName, that.baseName) &&
                Objects.equals(baseValue, that.baseValue) &&
                Objects.equals(ifDel, that.ifDel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, baseName, baseValue, ifDel);
    }
}
