package com.zjcpx.cms.pojo;

import java.io.Serializable;

/**
 * t_qainfo
 * @author 
 */
public class TQainfo implements Serializable {
    /**
     * 序号
     */
    private Integer id;

    /**
     * QA字段名
     */
    private String fieldname;

    /**
     * 需展示的QA内容，不同内容以”;“分割
     */
    private String qacontent;

    /**
     * 字段中文名
     */
    private String fieldcname;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFieldname() {
        return fieldname;
    }

    public void setFieldname(String fieldname) {
        this.fieldname = fieldname;
    }

    public String getQacontent() {
        return qacontent;
    }

    public void setQacontent(String qacontent) {
        this.qacontent = qacontent;
    }

    public String getFieldcname() {
        return fieldcname;
    }

    public void setFieldcname(String fieldcname) {
        this.fieldcname = fieldcname;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TQainfo other = (TQainfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFieldname() == null ? other.getFieldname() == null : this.getFieldname().equals(other.getFieldname()))
            && (this.getQacontent() == null ? other.getQacontent() == null : this.getQacontent().equals(other.getQacontent()))
            && (this.getFieldcname() == null ? other.getFieldcname() == null : this.getFieldcname().equals(other.getFieldcname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFieldname() == null) ? 0 : getFieldname().hashCode());
        result = prime * result + ((getQacontent() == null) ? 0 : getQacontent().hashCode());
        result = prime * result + ((getFieldcname() == null) ? 0 : getFieldcname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fieldname=").append(fieldname);
        sb.append(", qacontent=").append(qacontent);
        sb.append(", fieldcname=").append(fieldcname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}