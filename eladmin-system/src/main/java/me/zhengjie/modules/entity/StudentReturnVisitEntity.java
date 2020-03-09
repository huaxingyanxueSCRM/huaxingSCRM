package me.zhengjie.modules.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "student_return_visit", schema = "huaxingSCRM", catalog = "")
public class StudentReturnVisitEntity {
    private Integer sId;
    private String reTeacher;
    private Date reDate;
    private String reSMessage;

    @Basic
    @Column(name = "s_id")
    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    @Basic
    @Column(name = "re_teacher")
    public String getReTeacher() {
        return reTeacher;
    }

    public void setReTeacher(String reTeacher) {
        this.reTeacher = reTeacher;
    }

    @Basic
    @Column(name = "re_date")
    public Date getReDate() {
        return reDate;
    }

    public void setReDate(Date reDate) {
        this.reDate = reDate;
    }

    @Basic
    @Column(name = "re_s_message")
    public String getReSMessage() {
        return reSMessage;
    }

    public void setReSMessage(String reSMessage) {
        this.reSMessage = reSMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentReturnVisitEntity that = (StudentReturnVisitEntity) o;
        return Objects.equals(sId, that.sId) &&
                Objects.equals(reTeacher, that.reTeacher) &&
                Objects.equals(reDate, that.reDate) &&
                Objects.equals(reSMessage, that.reSMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sId, reTeacher, reDate, reSMessage);
    }
}
