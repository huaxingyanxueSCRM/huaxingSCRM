package me.zhengjie.modules.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "hx_student", schema = "huaxingSCRM", catalog = "")
public class HxStudentEntity {
    private int id;
    private String studentName;
    private Integer sex;
    private String nation;
    private Date birthday;
    private String birthdayYear;
    private String birthdayMonth;
    private String birthdayDay;
    private Integer numberId;
    private String schoolName;
    private String motherNumber;
    private String fatherNumber;
    private String otherNumber;
    private String province;
    private String city;
    private String county;
    private String addr;
    private String hobby;
    private BigDecimal savingAllMoney;
    private Integer memberLevel;
    private String mLValue;
    private String dataSources;
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
    @Column(name = "student_name")
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Basic
    @Column(name = "sex")
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "nation")
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Basic
    @Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "birthday_year")
    public String getBirthdayYear() {
        return birthdayYear;
    }

    public void setBirthdayYear(String birthdayYear) {
        this.birthdayYear = birthdayYear;
    }

    @Basic
    @Column(name = "birthday_month")
    public String getBirthdayMonth() {
        return birthdayMonth;
    }

    public void setBirthdayMonth(String birthdayMonth) {
        this.birthdayMonth = birthdayMonth;
    }

    @Basic
    @Column(name = "birthday_day")
    public String getBirthdayDay() {
        return birthdayDay;
    }

    public void setBirthdayDay(String birthdayDay) {
        this.birthdayDay = birthdayDay;
    }

    @Basic
    @Column(name = "number_id")
    public Integer getNumberId() {
        return numberId;
    }

    public void setNumberId(Integer numberId) {
        this.numberId = numberId;
    }

    @Basic
    @Column(name = "school_name")
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Basic
    @Column(name = "mother_number")
    public String getMotherNumber() {
        return motherNumber;
    }

    public void setMotherNumber(String motherNumber) {
        this.motherNumber = motherNumber;
    }

    @Basic
    @Column(name = "father_number")
    public String getFatherNumber() {
        return fatherNumber;
    }

    public void setFatherNumber(String fatherNumber) {
        this.fatherNumber = fatherNumber;
    }

    @Basic
    @Column(name = "other_number")
    public String getOtherNumber() {
        return otherNumber;
    }

    public void setOtherNumber(String otherNumber) {
        this.otherNumber = otherNumber;
    }

    @Basic
    @Column(name = "province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "county")
    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Basic
    @Column(name = "addr")
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Basic
    @Column(name = "hobby")
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Basic
    @Column(name = "saving_all_money")
    public BigDecimal getSavingAllMoney() {
        return savingAllMoney;
    }

    public void setSavingAllMoney(BigDecimal savingAllMoney) {
        this.savingAllMoney = savingAllMoney;
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
    @Column(name = "m_l_value")
    public String getmLValue() {
        return mLValue;
    }

    public void setmLValue(String mLValue) {
        this.mLValue = mLValue;
    }

    @Basic
    @Column(name = "data_sources")
    public String getDataSources() {
        return dataSources;
    }

    public void setDataSources(String dataSources) {
        this.dataSources = dataSources;
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
        HxStudentEntity that = (HxStudentEntity) o;
        return id == that.id &&
                Objects.equals(studentName, that.studentName) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(nation, that.nation) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(birthdayYear, that.birthdayYear) &&
                Objects.equals(birthdayMonth, that.birthdayMonth) &&
                Objects.equals(birthdayDay, that.birthdayDay) &&
                Objects.equals(numberId, that.numberId) &&
                Objects.equals(schoolName, that.schoolName) &&
                Objects.equals(motherNumber, that.motherNumber) &&
                Objects.equals(fatherNumber, that.fatherNumber) &&
                Objects.equals(otherNumber, that.otherNumber) &&
                Objects.equals(province, that.province) &&
                Objects.equals(city, that.city) &&
                Objects.equals(county, that.county) &&
                Objects.equals(addr, that.addr) &&
                Objects.equals(hobby, that.hobby) &&
                Objects.equals(savingAllMoney, that.savingAllMoney) &&
                Objects.equals(memberLevel, that.memberLevel) &&
                Objects.equals(mLValue, that.mLValue) &&
                Objects.equals(dataSources, that.dataSources) &&
                Objects.equals(ifDel, that.ifDel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, studentName, sex, nation, birthday, birthdayYear, birthdayMonth, birthdayDay, numberId, schoolName, motherNumber, fatherNumber, otherNumber, province, city, county, addr, hobby, savingAllMoney, memberLevel, mLValue, dataSources, ifDel);
    }
}
