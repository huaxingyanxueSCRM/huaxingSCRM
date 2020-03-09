package me.zhengjie.modules.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hx_school", schema = "huaxingSCRM", catalog = "")
public class HxSchoolEntity {
    private int id;
    private String schoolName;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "school_name")
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HxSchoolEntity that = (HxSchoolEntity) o;
        return id == that.id &&
                Objects.equals(schoolName, that.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, schoolName);
    }
}
