package com.azure.graduate.db.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table system_admin
 */
public class SystemAdmin {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_admin.admin_id
     *
     * @mbg.generated
     */
    private Long adminId;

    /**
     * Database Column Remarks:
     *   管理员登录账号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_admin.admin_account
     *
     * @mbg.generated
     */
    private String adminAccount;

    /**
     * Database Column Remarks:
     *   管理员登录密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_admin.admin_password
     *
     * @mbg.generated
     */
    private String adminPassword;

    /**
     * Database Column Remarks:
     *   管理员性别
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_admin.admin_gender
     *
     * @mbg.generated
     */
    private Integer adminGender;

    /**
     * Database Column Remarks:
     *   管理员备注信息
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_admin.admin_description
     *
     * @mbg.generated
     */
    private String adminDescription;

    /**
     * Database Column Remarks:
     *   管理员手机号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_admin.admin_phone
     *
     * @mbg.generated
     */
    private String adminPhone;

    /**
     * Database Column Remarks:
     *   管理员缩略图
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_admin.admin_thumb
     *
     * @mbg.generated
     */
    private String adminThumb;

    /**
     * Database Column Remarks:
     *   管理员创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_admin.admin_create_time
     *
     * @mbg.generated
     */
    private LocalDateTime adminCreateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_admin.admin_id
     *
     * @return the value of system_admin.admin_id
     *
     * @mbg.generated
     */
    public Long getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_admin.admin_id
     *
     * @param adminId the value for system_admin.admin_id
     *
     * @mbg.generated
     */
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_admin.admin_account
     *
     * @return the value of system_admin.admin_account
     *
     * @mbg.generated
     */
    public String getAdminAccount() {
        return adminAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_admin.admin_account
     *
     * @param adminAccount the value for system_admin.admin_account
     *
     * @mbg.generated
     */
    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount == null ? null : adminAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_admin.admin_password
     *
     * @return the value of system_admin.admin_password
     *
     * @mbg.generated
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_admin.admin_password
     *
     * @param adminPassword the value for system_admin.admin_password
     *
     * @mbg.generated
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_admin.admin_gender
     *
     * @return the value of system_admin.admin_gender
     *
     * @mbg.generated
     */
    public Integer getAdminGender() {
        return adminGender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_admin.admin_gender
     *
     * @param adminGender the value for system_admin.admin_gender
     *
     * @mbg.generated
     */
    public void setAdminGender(Integer adminGender) {
        this.adminGender = adminGender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_admin.admin_description
     *
     * @return the value of system_admin.admin_description
     *
     * @mbg.generated
     */
    public String getAdminDescription() {
        return adminDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_admin.admin_description
     *
     * @param adminDescription the value for system_admin.admin_description
     *
     * @mbg.generated
     */
    public void setAdminDescription(String adminDescription) {
        this.adminDescription = adminDescription == null ? null : adminDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_admin.admin_phone
     *
     * @return the value of system_admin.admin_phone
     *
     * @mbg.generated
     */
    public String getAdminPhone() {
        return adminPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_admin.admin_phone
     *
     * @param adminPhone the value for system_admin.admin_phone
     *
     * @mbg.generated
     */
    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone == null ? null : adminPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_admin.admin_thumb
     *
     * @return the value of system_admin.admin_thumb
     *
     * @mbg.generated
     */
    public String getAdminThumb() {
        return adminThumb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_admin.admin_thumb
     *
     * @param adminThumb the value for system_admin.admin_thumb
     *
     * @mbg.generated
     */
    public void setAdminThumb(String adminThumb) {
        this.adminThumb = adminThumb == null ? null : adminThumb.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_admin.admin_create_time
     *
     * @return the value of system_admin.admin_create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAdminCreateTime() {
        return adminCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_admin.admin_create_time
     *
     * @param adminCreateTime the value for system_admin.admin_create_time
     *
     * @mbg.generated
     */
    public void setAdminCreateTime(LocalDateTime adminCreateTime) {
        this.adminCreateTime = adminCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_admin
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminId=").append(adminId);
        sb.append(", adminAccount=").append(adminAccount);
        sb.append(", adminPassword=").append(adminPassword);
        sb.append(", adminGender=").append(adminGender);
        sb.append(", adminDescription=").append(adminDescription);
        sb.append(", adminPhone=").append(adminPhone);
        sb.append(", adminThumb=").append(adminThumb);
        sb.append(", adminCreateTime=").append(adminCreateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static SystemAdmin.Builder builder() {
        return new SystemAdmin.Builder();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table system_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table system_admin
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private SystemAdmin obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table system_admin
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder() {
            this.obj = new SystemAdmin();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column system_admin.admin_id
         *
         * @param adminId the value for system_admin.admin_id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder adminId(Long adminId) {
            obj.setAdminId(adminId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column system_admin.admin_account
         *
         * @param adminAccount the value for system_admin.admin_account
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder adminAccount(String adminAccount) {
            obj.setAdminAccount(adminAccount);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column system_admin.admin_password
         *
         * @param adminPassword the value for system_admin.admin_password
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder adminPassword(String adminPassword) {
            obj.setAdminPassword(adminPassword);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column system_admin.admin_gender
         *
         * @param adminGender the value for system_admin.admin_gender
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder adminGender(Integer adminGender) {
            obj.setAdminGender(adminGender);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column system_admin.admin_description
         *
         * @param adminDescription the value for system_admin.admin_description
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder adminDescription(String adminDescription) {
            obj.setAdminDescription(adminDescription);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column system_admin.admin_phone
         *
         * @param adminPhone the value for system_admin.admin_phone
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder adminPhone(String adminPhone) {
            obj.setAdminPhone(adminPhone);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column system_admin.admin_thumb
         *
         * @param adminThumb the value for system_admin.admin_thumb
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder adminThumb(String adminThumb) {
            obj.setAdminThumb(adminThumb);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column system_admin.admin_create_time
         *
         * @param adminCreateTime the value for system_admin.admin_create_time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder adminCreateTime(LocalDateTime adminCreateTime) {
            obj.setAdminCreateTime(adminCreateTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table system_admin
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public SystemAdmin build() {
            return this.obj;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table system_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        adminId("admin_id", "adminId", "BIGINT", false),
        adminAccount("admin_account", "adminAccount", "VARCHAR", false),
        adminPassword("admin_password", "adminPassword", "VARCHAR", false),
        adminGender("admin_gender", "adminGender", "INTEGER", false),
        adminDescription("admin_description", "adminDescription", "VARCHAR", false),
        adminPhone("admin_phone", "adminPhone", "VARCHAR", false),
        adminThumb("admin_thumb", "adminThumb", "VARCHAR", false),
        adminCreateTime("admin_create_time", "adminCreateTime", "TIMESTAMP", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table system_admin
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "\"";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table system_admin
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "\"";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table system_admin
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table system_admin
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table system_admin
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table system_admin
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table system_admin
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table system_admin
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table system_admin
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table system_admin
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table system_admin
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table system_admin
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table system_admin
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table system_admin
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table system_admin
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}