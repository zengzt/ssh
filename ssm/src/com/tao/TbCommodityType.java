package com.tao;

public class TbCommodityType {
    private Integer id;

    private String typename;

    private String grade;

    private String fathergrade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getFathergrade() {
        return fathergrade;
    }

    public void setFathergrade(String fathergrade) {
        this.fathergrade = fathergrade == null ? null : fathergrade.trim();
    }
}