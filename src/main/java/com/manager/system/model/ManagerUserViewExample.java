package com.manager.system.model;

import java.util.ArrayList;
import java.util.List;

public class ManagerUserViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerUserViewExample() {
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

        public Criteria andUserPkidIsNull() {
            addCriterion("USER_PKID is null");
            return (Criteria) this;
        }

        public Criteria andUserPkidIsNotNull() {
            addCriterion("USER_PKID is not null");
            return (Criteria) this;
        }

        public Criteria andUserPkidEqualTo(Integer value) {
            addCriterion("USER_PKID =", value, "userPkid");
            return (Criteria) this;
        }

        public Criteria andUserPkidNotEqualTo(Integer value) {
            addCriterion("USER_PKID <>", value, "userPkid");
            return (Criteria) this;
        }

        public Criteria andUserPkidGreaterThan(Integer value) {
            addCriterion("USER_PKID >", value, "userPkid");
            return (Criteria) this;
        }

        public Criteria andUserPkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_PKID >=", value, "userPkid");
            return (Criteria) this;
        }

        public Criteria andUserPkidLessThan(Integer value) {
            addCriterion("USER_PKID <", value, "userPkid");
            return (Criteria) this;
        }

        public Criteria andUserPkidLessThanOrEqualTo(Integer value) {
            addCriterion("USER_PKID <=", value, "userPkid");
            return (Criteria) this;
        }

        public Criteria andUserPkidIn(List<Integer> values) {
            addCriterion("USER_PKID in", values, "userPkid");
            return (Criteria) this;
        }

        public Criteria andUserPkidNotIn(List<Integer> values) {
            addCriterion("USER_PKID not in", values, "userPkid");
            return (Criteria) this;
        }

        public Criteria andUserPkidBetween(Integer value1, Integer value2) {
            addCriterion("USER_PKID between", value1, value2, "userPkid");
            return (Criteria) this;
        }

        public Criteria andUserPkidNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_PKID not between", value1, value2, "userPkid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("USER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("USER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Integer value) {
            addCriterion("USER_STATUS =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Integer value) {
            addCriterion("USER_STATUS <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Integer value) {
            addCriterion("USER_STATUS >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_STATUS >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Integer value) {
            addCriterion("USER_STATUS <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Integer value) {
            addCriterion("USER_STATUS <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Integer> values) {
            addCriterion("USER_STATUS in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Integer> values) {
            addCriterion("USER_STATUS not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Integer value1, Integer value2) {
            addCriterion("USER_STATUS between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_STATUS not between", value1, value2, "userStatus");
            return (Criteria) this;
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

        public Criteria andGroupStatusIsNull() {
            addCriterion("GROUP_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andGroupStatusIsNotNull() {
            addCriterion("GROUP_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andGroupStatusEqualTo(Integer value) {
            addCriterion("GROUP_STATUS =", value, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusNotEqualTo(Integer value) {
            addCriterion("GROUP_STATUS <>", value, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusGreaterThan(Integer value) {
            addCriterion("GROUP_STATUS >", value, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("GROUP_STATUS >=", value, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusLessThan(Integer value) {
            addCriterion("GROUP_STATUS <", value, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusLessThanOrEqualTo(Integer value) {
            addCriterion("GROUP_STATUS <=", value, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusIn(List<Integer> values) {
            addCriterion("GROUP_STATUS in", values, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusNotIn(List<Integer> values) {
            addCriterion("GROUP_STATUS not in", values, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusBetween(Integer value1, Integer value2) {
            addCriterion("GROUP_STATUS between", value1, value2, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("GROUP_STATUS not between", value1, value2, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorityPkidIsNull() {
            addCriterion("AUTHORITY_PKID is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityPkidIsNotNull() {
            addCriterion("AUTHORITY_PKID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityPkidEqualTo(Integer value) {
            addCriterion("AUTHORITY_PKID =", value, "authorityPkid");
            return (Criteria) this;
        }

        public Criteria andAuthorityPkidNotEqualTo(Integer value) {
            addCriterion("AUTHORITY_PKID <>", value, "authorityPkid");
            return (Criteria) this;
        }

        public Criteria andAuthorityPkidGreaterThan(Integer value) {
            addCriterion("AUTHORITY_PKID >", value, "authorityPkid");
            return (Criteria) this;
        }

        public Criteria andAuthorityPkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUTHORITY_PKID >=", value, "authorityPkid");
            return (Criteria) this;
        }

        public Criteria andAuthorityPkidLessThan(Integer value) {
            addCriterion("AUTHORITY_PKID <", value, "authorityPkid");
            return (Criteria) this;
        }

        public Criteria andAuthorityPkidLessThanOrEqualTo(Integer value) {
            addCriterion("AUTHORITY_PKID <=", value, "authorityPkid");
            return (Criteria) this;
        }

        public Criteria andAuthorityPkidIn(List<Integer> values) {
            addCriterion("AUTHORITY_PKID in", values, "authorityPkid");
            return (Criteria) this;
        }

        public Criteria andAuthorityPkidNotIn(List<Integer> values) {
            addCriterion("AUTHORITY_PKID not in", values, "authorityPkid");
            return (Criteria) this;
        }

        public Criteria andAuthorityPkidBetween(Integer value1, Integer value2) {
            addCriterion("AUTHORITY_PKID between", value1, value2, "authorityPkid");
            return (Criteria) this;
        }

        public Criteria andAuthorityPkidNotBetween(Integer value1, Integer value2) {
            addCriterion("AUTHORITY_PKID not between", value1, value2, "authorityPkid");
            return (Criteria) this;
        }

        public Criteria andLevel1IsNull() {
            addCriterion("LEVEL1 is null");
            return (Criteria) this;
        }

        public Criteria andLevel1IsNotNull() {
            addCriterion("LEVEL1 is not null");
            return (Criteria) this;
        }

        public Criteria andLevel1EqualTo(String value) {
            addCriterion("LEVEL1 =", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1NotEqualTo(String value) {
            addCriterion("LEVEL1 <>", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1GreaterThan(String value) {
            addCriterion("LEVEL1 >", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1GreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL1 >=", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1LessThan(String value) {
            addCriterion("LEVEL1 <", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1LessThanOrEqualTo(String value) {
            addCriterion("LEVEL1 <=", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1Like(String value) {
            addCriterion("LEVEL1 like", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1NotLike(String value) {
            addCriterion("LEVEL1 not like", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1In(List<String> values) {
            addCriterion("LEVEL1 in", values, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1NotIn(List<String> values) {
            addCriterion("LEVEL1 not in", values, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1Between(String value1, String value2) {
            addCriterion("LEVEL1 between", value1, value2, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1NotBetween(String value1, String value2) {
            addCriterion("LEVEL1 not between", value1, value2, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel2IsNull() {
            addCriterion("LEVEL2 is null");
            return (Criteria) this;
        }

        public Criteria andLevel2IsNotNull() {
            addCriterion("LEVEL2 is not null");
            return (Criteria) this;
        }

        public Criteria andLevel2EqualTo(String value) {
            addCriterion("LEVEL2 =", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2NotEqualTo(String value) {
            addCriterion("LEVEL2 <>", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2GreaterThan(String value) {
            addCriterion("LEVEL2 >", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2GreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL2 >=", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2LessThan(String value) {
            addCriterion("LEVEL2 <", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2LessThanOrEqualTo(String value) {
            addCriterion("LEVEL2 <=", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2Like(String value) {
            addCriterion("LEVEL2 like", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2NotLike(String value) {
            addCriterion("LEVEL2 not like", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2In(List<String> values) {
            addCriterion("LEVEL2 in", values, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2NotIn(List<String> values) {
            addCriterion("LEVEL2 not in", values, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2Between(String value1, String value2) {
            addCriterion("LEVEL2 between", value1, value2, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2NotBetween(String value1, String value2) {
            addCriterion("LEVEL2 not between", value1, value2, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel3IsNull() {
            addCriterion("LEVEL3 is null");
            return (Criteria) this;
        }

        public Criteria andLevel3IsNotNull() {
            addCriterion("LEVEL3 is not null");
            return (Criteria) this;
        }

        public Criteria andLevel3EqualTo(String value) {
            addCriterion("LEVEL3 =", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3NotEqualTo(String value) {
            addCriterion("LEVEL3 <>", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3GreaterThan(String value) {
            addCriterion("LEVEL3 >", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3GreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL3 >=", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3LessThan(String value) {
            addCriterion("LEVEL3 <", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3LessThanOrEqualTo(String value) {
            addCriterion("LEVEL3 <=", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3Like(String value) {
            addCriterion("LEVEL3 like", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3NotLike(String value) {
            addCriterion("LEVEL3 not like", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3In(List<String> values) {
            addCriterion("LEVEL3 in", values, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3NotIn(List<String> values) {
            addCriterion("LEVEL3 not in", values, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3Between(String value1, String value2) {
            addCriterion("LEVEL3 between", value1, value2, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3NotBetween(String value1, String value2) {
            addCriterion("LEVEL3 not between", value1, value2, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel4IsNull() {
            addCriterion("LEVEL4 is null");
            return (Criteria) this;
        }

        public Criteria andLevel4IsNotNull() {
            addCriterion("LEVEL4 is not null");
            return (Criteria) this;
        }

        public Criteria andLevel4EqualTo(String value) {
            addCriterion("LEVEL4 =", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4NotEqualTo(String value) {
            addCriterion("LEVEL4 <>", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4GreaterThan(String value) {
            addCriterion("LEVEL4 >", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4GreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL4 >=", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4LessThan(String value) {
            addCriterion("LEVEL4 <", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4LessThanOrEqualTo(String value) {
            addCriterion("LEVEL4 <=", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4Like(String value) {
            addCriterion("LEVEL4 like", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4NotLike(String value) {
            addCriterion("LEVEL4 not like", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4In(List<String> values) {
            addCriterion("LEVEL4 in", values, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4NotIn(List<String> values) {
            addCriterion("LEVEL4 not in", values, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4Between(String value1, String value2) {
            addCriterion("LEVEL4 between", value1, value2, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4NotBetween(String value1, String value2) {
            addCriterion("LEVEL4 not between", value1, value2, "level4");
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