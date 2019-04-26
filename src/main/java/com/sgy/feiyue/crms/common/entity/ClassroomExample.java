package com.sgy.feiyue.crms.common.entity;

import java.util.ArrayList;
import java.util.List;

public class ClassroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassroomExample() {
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

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(String value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(String value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(String value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(String value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(String value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(String value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLike(String value) {
            addCriterion("room_id like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotLike(String value) {
            addCriterion("room_id not like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<String> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<String> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(String value1, String value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(String value1, String value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIsNull() {
            addCriterion("room_number is null");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIsNotNull() {
            addCriterion("room_number is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNumberEqualTo(String value) {
            addCriterion("room_number =", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotEqualTo(String value) {
            addCriterion("room_number <>", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberGreaterThan(String value) {
            addCriterion("room_number >", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberGreaterThanOrEqualTo(String value) {
            addCriterion("room_number >=", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLessThan(String value) {
            addCriterion("room_number <", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLessThanOrEqualTo(String value) {
            addCriterion("room_number <=", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLike(String value) {
            addCriterion("room_number like", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotLike(String value) {
            addCriterion("room_number not like", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIn(List<String> values) {
            addCriterion("room_number in", values, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotIn(List<String> values) {
            addCriterion("room_number not in", values, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberBetween(String value1, String value2) {
            addCriterion("room_number between", value1, value2, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotBetween(String value1, String value2) {
            addCriterion("room_number not between", value1, value2, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNameIsNull() {
            addCriterion("room_name is null");
            return (Criteria) this;
        }

        public Criteria andRoomNameIsNotNull() {
            addCriterion("room_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNameEqualTo(String value) {
            addCriterion("room_name =", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotEqualTo(String value) {
            addCriterion("room_name <>", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameGreaterThan(String value) {
            addCriterion("room_name >", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameGreaterThanOrEqualTo(String value) {
            addCriterion("room_name >=", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLessThan(String value) {
            addCriterion("room_name <", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLessThanOrEqualTo(String value) {
            addCriterion("room_name <=", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLike(String value) {
            addCriterion("room_name like", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotLike(String value) {
            addCriterion("room_name not like", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameIn(List<String> values) {
            addCriterion("room_name in", values, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotIn(List<String> values) {
            addCriterion("room_name not in", values, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameBetween(String value1, String value2) {
            addCriterion("room_name between", value1, value2, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotBetween(String value1, String value2) {
            addCriterion("room_name not between", value1, value2, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomStateIsNull() {
            addCriterion("room_state is null");
            return (Criteria) this;
        }

        public Criteria andRoomStateIsNotNull() {
            addCriterion("room_state is not null");
            return (Criteria) this;
        }

        public Criteria andRoomStateEqualTo(String value) {
            addCriterion("room_state =", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateNotEqualTo(String value) {
            addCriterion("room_state <>", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateGreaterThan(String value) {
            addCriterion("room_state >", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateGreaterThanOrEqualTo(String value) {
            addCriterion("room_state >=", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateLessThan(String value) {
            addCriterion("room_state <", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateLessThanOrEqualTo(String value) {
            addCriterion("room_state <=", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateLike(String value) {
            addCriterion("room_state like", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateNotLike(String value) {
            addCriterion("room_state not like", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateIn(List<String> values) {
            addCriterion("room_state in", values, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateNotIn(List<String> values) {
            addCriterion("room_state not in", values, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateBetween(String value1, String value2) {
            addCriterion("room_state between", value1, value2, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateNotBetween(String value1, String value2) {
            addCriterion("room_state not between", value1, value2, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNull() {
            addCriterion("room_type is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNotNull() {
            addCriterion("room_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeEqualTo(String value) {
            addCriterion("room_type =", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotEqualTo(String value) {
            addCriterion("room_type <>", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThan(String value) {
            addCriterion("room_type >", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThanOrEqualTo(String value) {
            addCriterion("room_type >=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThan(String value) {
            addCriterion("room_type <", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThanOrEqualTo(String value) {
            addCriterion("room_type <=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLike(String value) {
            addCriterion("room_type like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotLike(String value) {
            addCriterion("room_type not like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIn(List<String> values) {
            addCriterion("room_type in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotIn(List<String> values) {
            addCriterion("room_type not in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeBetween(String value1, String value2) {
            addCriterion("room_type between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotBetween(String value1, String value2) {
            addCriterion("room_type not between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomCapacityIsNull() {
            addCriterion("room_capacity is null");
            return (Criteria) this;
        }

        public Criteria andRoomCapacityIsNotNull() {
            addCriterion("room_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andRoomCapacityEqualTo(Integer value) {
            addCriterion("room_capacity =", value, "roomCapacity");
            return (Criteria) this;
        }

        public Criteria andRoomCapacityNotEqualTo(Integer value) {
            addCriterion("room_capacity <>", value, "roomCapacity");
            return (Criteria) this;
        }

        public Criteria andRoomCapacityGreaterThan(Integer value) {
            addCriterion("room_capacity >", value, "roomCapacity");
            return (Criteria) this;
        }

        public Criteria andRoomCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_capacity >=", value, "roomCapacity");
            return (Criteria) this;
        }

        public Criteria andRoomCapacityLessThan(Integer value) {
            addCriterion("room_capacity <", value, "roomCapacity");
            return (Criteria) this;
        }

        public Criteria andRoomCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("room_capacity <=", value, "roomCapacity");
            return (Criteria) this;
        }

        public Criteria andRoomCapacityIn(List<Integer> values) {
            addCriterion("room_capacity in", values, "roomCapacity");
            return (Criteria) this;
        }

        public Criteria andRoomCapacityNotIn(List<Integer> values) {
            addCriterion("room_capacity not in", values, "roomCapacity");
            return (Criteria) this;
        }

        public Criteria andRoomCapacityBetween(Integer value1, Integer value2) {
            addCriterion("room_capacity between", value1, value2, "roomCapacity");
            return (Criteria) this;
        }

        public Criteria andRoomCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("room_capacity not between", value1, value2, "roomCapacity");
            return (Criteria) this;
        }

        public Criteria andRoomBuildingIsNull() {
            addCriterion("room_building is null");
            return (Criteria) this;
        }

        public Criteria andRoomBuildingIsNotNull() {
            addCriterion("room_building is not null");
            return (Criteria) this;
        }

        public Criteria andRoomBuildingEqualTo(String value) {
            addCriterion("room_building =", value, "roomBuilding");
            return (Criteria) this;
        }

        public Criteria andRoomBuildingNotEqualTo(String value) {
            addCriterion("room_building <>", value, "roomBuilding");
            return (Criteria) this;
        }

        public Criteria andRoomBuildingGreaterThan(String value) {
            addCriterion("room_building >", value, "roomBuilding");
            return (Criteria) this;
        }

        public Criteria andRoomBuildingGreaterThanOrEqualTo(String value) {
            addCriterion("room_building >=", value, "roomBuilding");
            return (Criteria) this;
        }

        public Criteria andRoomBuildingLessThan(String value) {
            addCriterion("room_building <", value, "roomBuilding");
            return (Criteria) this;
        }

        public Criteria andRoomBuildingLessThanOrEqualTo(String value) {
            addCriterion("room_building <=", value, "roomBuilding");
            return (Criteria) this;
        }

        public Criteria andRoomBuildingLike(String value) {
            addCriterion("room_building like", value, "roomBuilding");
            return (Criteria) this;
        }

        public Criteria andRoomBuildingNotLike(String value) {
            addCriterion("room_building not like", value, "roomBuilding");
            return (Criteria) this;
        }

        public Criteria andRoomBuildingIn(List<String> values) {
            addCriterion("room_building in", values, "roomBuilding");
            return (Criteria) this;
        }

        public Criteria andRoomBuildingNotIn(List<String> values) {
            addCriterion("room_building not in", values, "roomBuilding");
            return (Criteria) this;
        }

        public Criteria andRoomBuildingBetween(String value1, String value2) {
            addCriterion("room_building between", value1, value2, "roomBuilding");
            return (Criteria) this;
        }

        public Criteria andRoomBuildingNotBetween(String value1, String value2) {
            addCriterion("room_building not between", value1, value2, "roomBuilding");
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