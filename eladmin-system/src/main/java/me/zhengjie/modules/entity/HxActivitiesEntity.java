package me.zhengjie.modules.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "hx_activities", schema = "huaxingSCRM", catalog = "")
public class HxActivitiesEntity {
    private int id;
    private Integer baseId;
    private String activitiesName;
    private String travelTime;
    private BigDecimal price;
    private String departurePlace;
    private String destination;
    private Integer studentTotal;
    private String insuranceName;
    private String teamTeacher;
    private String securityTeacher;
    private Date accumulationTime;
    private Date returnTime;
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
    @Column(name = "base_id")
    public Integer getBaseId() {
        return baseId;
    }

    public void setBaseId(Integer baseId) {
        this.baseId = baseId;
    }

    @Basic
    @Column(name = "activities_name")
    public String getActivitiesName() {
        return activitiesName;
    }

    public void setActivitiesName(String activitiesName) {
        this.activitiesName = activitiesName;
    }

    @Basic
    @Column(name = "travel_time")
    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    @Basic
    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "departure_place")
    public String getDeparturePlace() {
        return departurePlace;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    @Basic
    @Column(name = "destination")
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Basic
    @Column(name = "student_total")
    public Integer getStudentTotal() {
        return studentTotal;
    }

    public void setStudentTotal(Integer studentTotal) {
        this.studentTotal = studentTotal;
    }

    @Basic
    @Column(name = "insurance_name")
    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    @Basic
    @Column(name = "team_teacher")
    public String getTeamTeacher() {
        return teamTeacher;
    }

    public void setTeamTeacher(String teamTeacher) {
        this.teamTeacher = teamTeacher;
    }

    @Basic
    @Column(name = "security_teacher")
    public String getSecurityTeacher() {
        return securityTeacher;
    }

    public void setSecurityTeacher(String securityTeacher) {
        this.securityTeacher = securityTeacher;
    }

    @Basic
    @Column(name = "accumulation_time")
    public Date getAccumulationTime() {
        return accumulationTime;
    }

    public void setAccumulationTime(Date accumulationTime) {
        this.accumulationTime = accumulationTime;
    }

    @Basic
    @Column(name = "return_time")
    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
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
        HxActivitiesEntity that = (HxActivitiesEntity) o;
        return id == that.id &&
                Objects.equals(baseId, that.baseId) &&
                Objects.equals(activitiesName, that.activitiesName) &&
                Objects.equals(travelTime, that.travelTime) &&
                Objects.equals(price, that.price) &&
                Objects.equals(departurePlace, that.departurePlace) &&
                Objects.equals(destination, that.destination) &&
                Objects.equals(studentTotal, that.studentTotal) &&
                Objects.equals(insuranceName, that.insuranceName) &&
                Objects.equals(teamTeacher, that.teamTeacher) &&
                Objects.equals(securityTeacher, that.securityTeacher) &&
                Objects.equals(accumulationTime, that.accumulationTime) &&
                Objects.equals(returnTime, that.returnTime) &&
                Objects.equals(ifDel, that.ifDel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, baseId, activitiesName, travelTime, price, departurePlace, destination, studentTotal, insuranceName, teamTeacher, securityTeacher, accumulationTime, returnTime, ifDel);
    }
}
