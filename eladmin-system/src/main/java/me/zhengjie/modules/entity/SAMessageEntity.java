package me.zhengjie.modules.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "s_a_message", schema = "huaxingSCRM", catalog = "")
public class SAMessageEntity {
    private int id;
    private Integer baseId;
    private Integer activitiesId;
    private Integer sId;
    private String message;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
    @Column(name = "s_id")
    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    @Basic
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SAMessageEntity that = (SAMessageEntity) o;
        return id == that.id &&
                Objects.equals(baseId, that.baseId) &&
                Objects.equals(activitiesId, that.activitiesId) &&
                Objects.equals(sId, that.sId) &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, baseId, activitiesId, sId, message);
    }
}
