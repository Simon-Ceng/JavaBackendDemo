package com.manager.system.model;

import java.util.ArrayList;
import java.util.List;

public class ManagerUserGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerUserGroupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGroupPkidIsNull() {
            addCriterion("GROUP_PKID is null");
            return (Criteria) this;
        }

        public Criteria andGroupPkidIsNotNull() {
            addCriterion("GROUP_PKID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupPkidEqualTo(Integer value) {
            addCriterion("GROUP_PKID =", value, "groupPkid");
            return (Criteria) this;
        }

        public Criteria andGroupPkidNotEqualTo(Integer value) {
            addCriterion("GROUP_PKID <>", value, "groupPkid");
            return (Criteria) this;
        }

        public Criteria andGroupPkidGreaterThan(Integer value) {
            addCriterion("GROUP_PKID >", value, "groupPkid");
            return (Criteria) this;
        }

        public Criteria andGroupPkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GROUP_PKID >=", value, "groupPkid");
            return (Criteria) this;
        }

        public Criteria andGroupPkidLessThan(Integer value) {
            addCriterion("GROUP_PKID <", value, "groupPkid");
            return (Criteria) this;
        }

        public Criteria andGroupPkidLessThanOrEqualTo(Integer value) {
            addCriterion("GROUP_PKID <=", value, "groupPkid");
            return (Criteria) this;
        }

        public Criteria andGroupPkidIn(List<Integer> values) {
            addCriterion("GROUP_PKID in", values, "groupPkid");
            return (Criteria) this;
        }

        public Criteria andGroupPkidNotIn(List<Integer> values) {
            addCriterion("GROUP_PKID not in", values, "groupPkid");
            return (Criteria) this;
        }

        public Criteria andGroupPkidBetween(Integer value1, Integer value2) {
            addCriterion("GROUP_PKID between", value1, value2, "groupPkid");
            return (Criteria) this;
        }

        public Criteria andGroupPkidNotBetween(Integer value1, Integer value2) {
            addCriterion("GROUP_PKID not between", value1, value2, "groupPkid");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("GROUP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("GROUP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("GROUP_NAME =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("GROUP_NAME <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("GROUP_NAME >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("GROUP_NAME <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("GROUP_NAME like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("GROUP_NAME not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("GROUP_NAME in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("GROUP_NAME not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("GROUP_NAME between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("GROUP_NAME not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFromEmailIsNull() {
            addCriterion("FROM_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andFromEmailIsNotNull() {
            addCriterion("FROM_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andFromEmailEqualTo(String value) {
            addCriterion("FROM_EMAIL =", value, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailNotEqualTo(String value) {
            addCriterion("FROM_EMAIL <>", value, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailGreaterThan(String value) {
            addCriterion("FROM_EMAIL >", value, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_EMAIL >=", value, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailLessThan(String value) {
            addCriterion("FROM_EMAIL <", value, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailLessThanOrEqualTo(String value) {
            addCriterion("FROM_EMAIL <=", value, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailLike(String value) {
            addCriterion("FROM_EMAIL like", value, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailNotLike(String value) {
            addCriterion("FROM_EMAIL not like", value, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailIn(List<String> values) {
            addCriterion("FROM_EMAIL in", values, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailNotIn(List<String> values) {
            addCriterion("FROM_EMAIL not in", values, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailBetween(String value1, String value2) {
            addCriterion("FROM_EMAIL between", value1, value2, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailNotBetween(String value1, String value2) {
            addCriterion("FROM_EMAIL not between", value1, value2, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromPasswordIsNull() {
            addCriterion("FROM_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andFromPasswordIsNotNull() {
            addCriterion("FROM_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andFromPasswordEqualTo(String value) {
            addCriterion("FROM_PASSWORD =", value, "fromPassword");
            return (Criteria) this;
        }

        public Criteria andFromPasswordNotEqualTo(String value) {
            addCriterion("FROM_PASSWORD <>", value, "fromPassword");
            return (Criteria) this;
        }

        public Criteria andFromPasswordGreaterThan(String value) {
            addCriterion("FROM_PASSWORD >", value, "fromPassword");
            return (Criteria) this;
        }

        public Criteria andFromPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_PASSWORD >=", value, "fromPassword");
            return (Criteria) this;
        }

        public Criteria andFromPasswordLessThan(String value) {
            addCriterion("FROM_PASSWORD <", value, "fromPassword");
            return (Criteria) this;
        }

        public Criteria andFromPasswordLessThanOrEqualTo(String value) {
            addCriterion("FROM_PASSWORD <=", value, "fromPassword");
            return (Criteria) this;
        }

        public Criteria andFromPasswordLike(String value) {
            addCriterion("FROM_PASSWORD like", value, "fromPassword");
            return (Criteria) this;
        }

        public Criteria andFromPasswordNotLike(String value) {
            addCriterion("FROM_PASSWORD not like", value, "fromPassword");
            return (Criteria) this;
        }

        public Criteria andFromPasswordIn(List<String> values) {
            addCriterion("FROM_PASSWORD in", values, "fromPassword");
            return (Criteria) this;
        }

        public Criteria andFromPasswordNotIn(List<String> values) {
            addCriterion("FROM_PASSWORD not in", values, "fromPassword");
            return (Criteria) this;
        }

        public Criteria andFromPasswordBetween(String value1, String value2) {
            addCriterion("FROM_PASSWORD between", value1, value2, "fromPassword");
            return (Criteria) this;
        }

        public Criteria andFromPasswordNotBetween(String value1, String value2) {
            addCriterion("FROM_PASSWORD not between", value1, value2, "fromPassword");
            return (Criteria) this;
        }

        public Criteria andFromPortIsNull() {
            addCriterion("FROM_PORT is null");
            return (Criteria) this;
        }

        public Criteria andFromPortIsNotNull() {
            addCriterion("FROM_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andFromPortEqualTo(String value) {
            addCriterion("FROM_PORT =", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortNotEqualTo(String value) {
            addCriterion("FROM_PORT <>", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortGreaterThan(String value) {
            addCriterion("FROM_PORT >", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_PORT >=", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortLessThan(String value) {
            addCriterion("FROM_PORT <", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortLessThanOrEqualTo(String value) {
            addCriterion("FROM_PORT <=", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortLike(String value) {
            addCriterion("FROM_PORT like", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortNotLike(String value) {
            addCriterion("FROM_PORT not like", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortIn(List<String> values) {
            addCriterion("FROM_PORT in", values, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortNotIn(List<String> values) {
            addCriterion("FROM_PORT not in", values, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortBetween(String value1, String value2) {
            addCriterion("FROM_PORT between", value1, value2, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortNotBetween(String value1, String value2) {
            addCriterion("FROM_PORT not between", value1, value2, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromSmtpIsNull() {
            addCriterion("FROM_SMTP is null");
            return (Criteria) this;
        }

        public Criteria andFromSmtpIsNotNull() {
            addCriterion("FROM_SMTP is not null");
            return (Criteria) this;
        }

        public Criteria andFromSmtpEqualTo(String value) {
            addCriterion("FROM_SMTP =", value, "fromSmtp");
            return (Criteria) this;
        }

        public Criteria andFromSmtpNotEqualTo(String value) {
            addCriterion("FROM_SMTP <>", value, "fromSmtp");
            return (Criteria) this;
        }

        public Criteria andFromSmtpGreaterThan(String value) {
            addCriterion("FROM_SMTP >", value, "fromSmtp");
            return (Criteria) this;
        }

        public Criteria andFromSmtpGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_SMTP >=", value, "fromSmtp");
            return (Criteria) this;
        }

        public Criteria andFromSmtpLessThan(String value) {
            addCriterion("FROM_SMTP <", value, "fromSmtp");
            return (Criteria) this;
        }

        public Criteria andFromSmtpLessThanOrEqualTo(String value) {
            addCriterion("FROM_SMTP <=", value, "fromSmtp");
            return (Criteria) this;
        }

        public Criteria andFromSmtpLike(String value) {
            addCriterion("FROM_SMTP like", value, "fromSmtp");
            return (Criteria) this;
        }

        public Criteria andFromSmtpNotLike(String value) {
            addCriterion("FROM_SMTP not like", value, "fromSmtp");
            return (Criteria) this;
        }

        public Criteria andFromSmtpIn(List<String> values) {
            addCriterion("FROM_SMTP in", values, "fromSmtp");
            return (Criteria) this;
        }

        public Criteria andFromSmtpNotIn(List<String> values) {
            addCriterion("FROM_SMTP not in", values, "fromSmtp");
            return (Criteria) this;
        }

        public Criteria andFromSmtpBetween(String value1, String value2) {
            addCriterion("FROM_SMTP between", value1, value2, "fromSmtp");
            return (Criteria) this;
        }

        public Criteria andFromSmtpNotBetween(String value1, String value2) {
            addCriterion("FROM_SMTP not between", value1, value2, "fromSmtp");
            return (Criteria) this;
        }

        public Criteria andFromTlsIsNull() {
            addCriterion("FROM_TLS is null");
            return (Criteria) this;
        }

        public Criteria andFromTlsIsNotNull() {
            addCriterion("FROM_TLS is not null");
            return (Criteria) this;
        }

        public Criteria andFromTlsEqualTo(Integer value) {
            addCriterion("FROM_TLS =", value, "fromTls");
            return (Criteria) this;
        }

        public Criteria andFromTlsNotEqualTo(Integer value) {
            addCriterion("FROM_TLS <>", value, "fromTls");
            return (Criteria) this;
        }

        public Criteria andFromTlsGreaterThan(Integer value) {
            addCriterion("FROM_TLS >", value, "fromTls");
            return (Criteria) this;
        }

        public Criteria andFromTlsGreaterThanOrEqualTo(Integer value) {
            addCriterion("FROM_TLS >=", value, "fromTls");
            return (Criteria) this;
        }

        public Criteria andFromTlsLessThan(Integer value) {
            addCriterion("FROM_TLS <", value, "fromTls");
            return (Criteria) this;
        }

        public Criteria andFromTlsLessThanOrEqualTo(Integer value) {
            addCriterion("FROM_TLS <=", value, "fromTls");
            return (Criteria) this;
        }

        public Criteria andFromTlsIn(List<Integer> values) {
            addCriterion("FROM_TLS in", values, "fromTls");
            return (Criteria) this;
        }

        public Criteria andFromTlsNotIn(List<Integer> values) {
            addCriterion("FROM_TLS not in", values, "fromTls");
            return (Criteria) this;
        }

        public Criteria andFromTlsBetween(Integer value1, Integer value2) {
            addCriterion("FROM_TLS between", value1, value2, "fromTls");
            return (Criteria) this;
        }

        public Criteria andFromTlsNotBetween(Integer value1, Integer value2) {
            addCriterion("FROM_TLS not between", value1, value2, "fromTls");
            return (Criteria) this;
        }

        public Criteria andToEmailIsNull() {
            addCriterion("TO_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andToEmailIsNotNull() {
            addCriterion("TO_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andToEmailEqualTo(String value) {
            addCriterion("TO_EMAIL =", value, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailNotEqualTo(String value) {
            addCriterion("TO_EMAIL <>", value, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailGreaterThan(String value) {
            addCriterion("TO_EMAIL >", value, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailGreaterThanOrEqualTo(String value) {
            addCriterion("TO_EMAIL >=", value, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailLessThan(String value) {
            addCriterion("TO_EMAIL <", value, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailLessThanOrEqualTo(String value) {
            addCriterion("TO_EMAIL <=", value, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailLike(String value) {
            addCriterion("TO_EMAIL like", value, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailNotLike(String value) {
            addCriterion("TO_EMAIL not like", value, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailIn(List<String> values) {
            addCriterion("TO_EMAIL in", values, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailNotIn(List<String> values) {
            addCriterion("TO_EMAIL not in", values, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailBetween(String value1, String value2) {
            addCriterion("TO_EMAIL between", value1, value2, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailNotBetween(String value1, String value2) {
            addCriterion("TO_EMAIL not between", value1, value2, "toEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailIsNull() {
            addCriterion("TEST_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andTestEmailIsNotNull() {
            addCriterion("TEST_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andTestEmailEqualTo(String value) {
            addCriterion("TEST_EMAIL =", value, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailNotEqualTo(String value) {
            addCriterion("TEST_EMAIL <>", value, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailGreaterThan(String value) {
            addCriterion("TEST_EMAIL >", value, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_EMAIL >=", value, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailLessThan(String value) {
            addCriterion("TEST_EMAIL <", value, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailLessThanOrEqualTo(String value) {
            addCriterion("TEST_EMAIL <=", value, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailLike(String value) {
            addCriterion("TEST_EMAIL like", value, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailNotLike(String value) {
            addCriterion("TEST_EMAIL not like", value, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailIn(List<String> values) {
            addCriterion("TEST_EMAIL in", values, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailNotIn(List<String> values) {
            addCriterion("TEST_EMAIL not in", values, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailBetween(String value1, String value2) {
            addCriterion("TEST_EMAIL between", value1, value2, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailNotBetween(String value1, String value2) {
            addCriterion("TEST_EMAIL not between", value1, value2, "testEmail");
            return (Criteria) this;
        }

        public Criteria andEmailPeriodIsNull() {
            addCriterion("EMAIL_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andEmailPeriodIsNotNull() {
            addCriterion("EMAIL_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andEmailPeriodEqualTo(Integer value) {
            addCriterion("EMAIL_PERIOD =", value, "emailPeriod");
            return (Criteria) this;
        }

        public Criteria andEmailPeriodNotEqualTo(Integer value) {
            addCriterion("EMAIL_PERIOD <>", value, "emailPeriod");
            return (Criteria) this;
        }

        public Criteria andEmailPeriodGreaterThan(Integer value) {
            addCriterion("EMAIL_PERIOD >", value, "emailPeriod");
            return (Criteria) this;
        }

        public Criteria andEmailPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("EMAIL_PERIOD >=", value, "emailPeriod");
            return (Criteria) this;
        }

        public Criteria andEmailPeriodLessThan(Integer value) {
            addCriterion("EMAIL_PERIOD <", value, "emailPeriod");
            return (Criteria) this;
        }

        public Criteria andEmailPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("EMAIL_PERIOD <=", value, "emailPeriod");
            return (Criteria) this;
        }

        public Criteria andEmailPeriodIn(List<Integer> values) {
            addCriterion("EMAIL_PERIOD in", values, "emailPeriod");
            return (Criteria) this;
        }

        public Criteria andEmailPeriodNotIn(List<Integer> values) {
            addCriterion("EMAIL_PERIOD not in", values, "emailPeriod");
            return (Criteria) this;
        }

        public Criteria andEmailPeriodBetween(Integer value1, Integer value2) {
            addCriterion("EMAIL_PERIOD between", value1, value2, "emailPeriod");
            return (Criteria) this;
        }

        public Criteria andEmailPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("EMAIL_PERIOD not between", value1, value2, "emailPeriod");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("START_TIME like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("START_TIME not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNull() {
            addCriterion("STOP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNotNull() {
            addCriterion("STOP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStopTimeEqualTo(String value) {
            addCriterion("STOP_TIME =", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotEqualTo(String value) {
            addCriterion("STOP_TIME <>", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThan(String value) {
            addCriterion("STOP_TIME >", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThanOrEqualTo(String value) {
            addCriterion("STOP_TIME >=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThan(String value) {
            addCriterion("STOP_TIME <", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThanOrEqualTo(String value) {
            addCriterion("STOP_TIME <=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLike(String value) {
            addCriterion("STOP_TIME like", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotLike(String value) {
            addCriterion("STOP_TIME not like", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeIn(List<String> values) {
            addCriterion("STOP_TIME in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotIn(List<String> values) {
            addCriterion("STOP_TIME not in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeBetween(String value1, String value2) {
            addCriterion("STOP_TIME between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotBetween(String value1, String value2) {
            addCriterion("STOP_TIME not between", value1, value2, "stopTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}