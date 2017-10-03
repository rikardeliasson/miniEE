package com.cybercom;

import javax.persistence.*;

@Entity
@Table(name = "test", schema = "eemini", catalog = "")
public class TestEntity {
    private Integer column1;

    @Basic
    @Column(name = "column_1")
    public Integer getColumn1() {
        return column1;
    }

    public void setColumn1(Integer column1) {
        this.column1 = column1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestEntity that = (TestEntity) o;

        if (column1 != null ? !column1.equals(that.column1) : that.column1 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return column1 != null ? column1.hashCode() : 0;
    }

    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
