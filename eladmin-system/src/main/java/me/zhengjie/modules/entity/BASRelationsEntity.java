package me.zhengjie.modules.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "b_a_s_relations", schema = "huaxingSCRM", catalog = "")
public class BASRelationsEntity {
    private Integer baseId;
    private Integer activitiesId;
    private Integer studentId;

    @Basic
    @Column(name = "base_id")
    public Integer getBaseId() {
        return baseId;
    }

    public void setBaseId(Integer baseId) {
        this.baseId = baseId;
    }

    @Basic
    @Column(name = "activities_id")
    public Integer getActivitiesId() {
        return activitiesId;
    }

    public void setActivitiesId(Integer activitiesId) {
        this.activitiesId = activitiesId;
    }

    @Basic
    @Column(name = "student_id")
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BASRelationsEntity that = (BASRelationsEntity) o;
        return Objects.equals(baseId, that.baseId) &&
                Objects.equals(activitiesId, that.activitiesId) &&
                Objects.equals(studentId, that.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseId, activitiesId, studentId);
    }
}
