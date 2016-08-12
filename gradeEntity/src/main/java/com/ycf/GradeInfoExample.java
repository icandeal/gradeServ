package com.ycf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GradeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradeInfoExample() {
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

        public Criteria andGradeIdIsNull() {
            addCriterion("GRADE_ID is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("GRADE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(Integer value) {
            addCriterion("GRADE_ID =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Integer value) {
            addCriterion("GRADE_ID <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Integer value) {
            addCriterion("GRADE_ID >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("GRADE_ID >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Integer value) {
            addCriterion("GRADE_ID <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("GRADE_ID <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Integer> values) {
            addCriterion("GRADE_ID in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Integer> values) {
            addCriterion("GRADE_ID not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("GRADE_ID between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("GRADE_ID not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNull() {
            addCriterion("GRADE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNotNull() {
            addCriterion("GRADE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGradeNameEqualTo(String value) {
            addCriterion("GRADE_NAME =", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotEqualTo(String value) {
            addCriterion("GRADE_NAME <>", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThan(String value) {
            addCriterion("GRADE_NAME >", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE_NAME >=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThan(String value) {
            addCriterion("GRADE_NAME <", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThanOrEqualTo(String value) {
            addCriterion("GRADE_NAME <=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLike(String value) {
            addCriterion("GRADE_NAME like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotLike(String value) {
            addCriterion("GRADE_NAME not like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameIn(List<String> values) {
            addCriterion("GRADE_NAME in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotIn(List<String> values) {
            addCriterion("GRADE_NAME not in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameBetween(String value1, String value2) {
            addCriterion("GRADE_NAME between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotBetween(String value1, String value2) {
            addCriterion("GRADE_NAME not between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeValueIsNull() {
            addCriterion("GRADE_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andGradeValueIsNotNull() {
            addCriterion("GRADE_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeValueEqualTo(String value) {
            addCriterion("GRADE_VALUE =", value, "gradeValue");
            return (Criteria) this;
        }

        public Criteria andGradeValueNotEqualTo(String value) {
            addCriterion("GRADE_VALUE <>", value, "gradeValue");
            return (Criteria) this;
        }

        public Criteria andGradeValueGreaterThan(String value) {
            addCriterion("GRADE_VALUE >", value, "gradeValue");
            return (Criteria) this;
        }

        public Criteria andGradeValueGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE_VALUE >=", value, "gradeValue");
            return (Criteria) this;
        }

        public Criteria andGradeValueLessThan(String value) {
            addCriterion("GRADE_VALUE <", value, "gradeValue");
            return (Criteria) this;
        }

        public Criteria andGradeValueLessThanOrEqualTo(String value) {
            addCriterion("GRADE_VALUE <=", value, "gradeValue");
            return (Criteria) this;
        }

        public Criteria andGradeValueLike(String value) {
            addCriterion("GRADE_VALUE like", value, "gradeValue");
            return (Criteria) this;
        }

        public Criteria andGradeValueNotLike(String value) {
            addCriterion("GRADE_VALUE not like", value, "gradeValue");
            return (Criteria) this;
        }

        public Criteria andGradeValueIn(List<String> values) {
            addCriterion("GRADE_VALUE in", values, "gradeValue");
            return (Criteria) this;
        }

        public Criteria andGradeValueNotIn(List<String> values) {
            addCriterion("GRADE_VALUE not in", values, "gradeValue");
            return (Criteria) this;
        }

        public Criteria andGradeValueBetween(String value1, String value2) {
            addCriterion("GRADE_VALUE between", value1, value2, "gradeValue");
            return (Criteria) this;
        }

        public Criteria andGradeValueNotBetween(String value1, String value2) {
            addCriterion("GRADE_VALUE not between", value1, value2, "gradeValue");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNull() {
            addCriterion("C_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNotNull() {
            addCriterion("C_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCTimeEqualTo(Date value) {
            addCriterion("C_TIME =", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotEqualTo(Date value) {
            addCriterion("C_TIME <>", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThan(Date value) {
            addCriterion("C_TIME >", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("C_TIME >=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThan(Date value) {
            addCriterion("C_TIME <", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThanOrEqualTo(Date value) {
            addCriterion("C_TIME <=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeIn(List<Date> values) {
            addCriterion("C_TIME in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotIn(List<Date> values) {
            addCriterion("C_TIME not in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeBetween(Date value1, Date value2) {
            addCriterion("C_TIME between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotBetween(Date value1, Date value2) {
            addCriterion("C_TIME not between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andMTimeIsNull() {
            addCriterion("M_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMTimeIsNotNull() {
            addCriterion("M_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMTimeEqualTo(Date value) {
            addCriterion("M_TIME =", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotEqualTo(Date value) {
            addCriterion("M_TIME <>", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeGreaterThan(Date value) {
            addCriterion("M_TIME >", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("M_TIME >=", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLessThan(Date value) {
            addCriterion("M_TIME <", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLessThanOrEqualTo(Date value) {
            addCriterion("M_TIME <=", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeIn(List<Date> values) {
            addCriterion("M_TIME in", values, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotIn(List<Date> values) {
            addCriterion("M_TIME not in", values, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeBetween(Date value1, Date value2) {
            addCriterion("M_TIME between", value1, value2, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotBetween(Date value1, Date value2) {
            addCriterion("M_TIME not between", value1, value2, "mTime");
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