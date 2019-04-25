package com.sgy.feiyue.crms.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingRoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookingRoomExample() {
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

        public Criteria andBookingIdIsNull() {
            addCriterion("booking_id is null");
            return (Criteria) this;
        }

        public Criteria andBookingIdIsNotNull() {
            addCriterion("booking_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookingIdEqualTo(String value) {
            addCriterion("booking_id =", value, "bookingId");
            return (Criteria) this;
        }

        public Criteria andBookingIdNotEqualTo(String value) {
            addCriterion("booking_id <>", value, "bookingId");
            return (Criteria) this;
        }

        public Criteria andBookingIdGreaterThan(String value) {
            addCriterion("booking_id >", value, "bookingId");
            return (Criteria) this;
        }

        public Criteria andBookingIdGreaterThanOrEqualTo(String value) {
            addCriterion("booking_id >=", value, "bookingId");
            return (Criteria) this;
        }

        public Criteria andBookingIdLessThan(String value) {
            addCriterion("booking_id <", value, "bookingId");
            return (Criteria) this;
        }

        public Criteria andBookingIdLessThanOrEqualTo(String value) {
            addCriterion("booking_id <=", value, "bookingId");
            return (Criteria) this;
        }

        public Criteria andBookingIdLike(String value) {
            addCriterion("booking_id like", value, "bookingId");
            return (Criteria) this;
        }

        public Criteria andBookingIdNotLike(String value) {
            addCriterion("booking_id not like", value, "bookingId");
            return (Criteria) this;
        }

        public Criteria andBookingIdIn(List<String> values) {
            addCriterion("booking_id in", values, "bookingId");
            return (Criteria) this;
        }

        public Criteria andBookingIdNotIn(List<String> values) {
            addCriterion("booking_id not in", values, "bookingId");
            return (Criteria) this;
        }

        public Criteria andBookingIdBetween(String value1, String value2) {
            addCriterion("booking_id between", value1, value2, "bookingId");
            return (Criteria) this;
        }

        public Criteria andBookingIdNotBetween(String value1, String value2) {
            addCriterion("booking_id not between", value1, value2, "bookingId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(String value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(String value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(String value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(String value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(String value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(String value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLike(String value) {
            addCriterion("student_id like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotLike(String value) {
            addCriterion("student_id not like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<String> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<String> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(String value1, String value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(String value1, String value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
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

        public Criteria andNumberOfPeopleIsNull() {
            addCriterion("number_of_people is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleIsNotNull() {
            addCriterion("number_of_people is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleEqualTo(Integer value) {
            addCriterion("number_of_people =", value, "numberOfPeople");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleNotEqualTo(Integer value) {
            addCriterion("number_of_people <>", value, "numberOfPeople");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleGreaterThan(Integer value) {
            addCriterion("number_of_people >", value, "numberOfPeople");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_of_people >=", value, "numberOfPeople");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleLessThan(Integer value) {
            addCriterion("number_of_people <", value, "numberOfPeople");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("number_of_people <=", value, "numberOfPeople");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleIn(List<Integer> values) {
            addCriterion("number_of_people in", values, "numberOfPeople");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleNotIn(List<Integer> values) {
            addCriterion("number_of_people not in", values, "numberOfPeople");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleBetween(Integer value1, Integer value2) {
            addCriterion("number_of_people between", value1, value2, "numberOfPeople");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("number_of_people not between", value1, value2, "numberOfPeople");
            return (Criteria) this;
        }

        public Criteria andBookingStartIsNull() {
            addCriterion("booking_start is null");
            return (Criteria) this;
        }

        public Criteria andBookingStartIsNotNull() {
            addCriterion("booking_start is not null");
            return (Criteria) this;
        }

        public Criteria andBookingStartEqualTo(Date value) {
            addCriterion("booking_start =", value, "bookingStart");
            return (Criteria) this;
        }

        public Criteria andBookingStartNotEqualTo(Date value) {
            addCriterion("booking_start <>", value, "bookingStart");
            return (Criteria) this;
        }

        public Criteria andBookingStartGreaterThan(Date value) {
            addCriterion("booking_start >", value, "bookingStart");
            return (Criteria) this;
        }

        public Criteria andBookingStartGreaterThanOrEqualTo(Date value) {
            addCriterion("booking_start >=", value, "bookingStart");
            return (Criteria) this;
        }

        public Criteria andBookingStartLessThan(Date value) {
            addCriterion("booking_start <", value, "bookingStart");
            return (Criteria) this;
        }

        public Criteria andBookingStartLessThanOrEqualTo(Date value) {
            addCriterion("booking_start <=", value, "bookingStart");
            return (Criteria) this;
        }

        public Criteria andBookingStartIn(List<Date> values) {
            addCriterion("booking_start in", values, "bookingStart");
            return (Criteria) this;
        }

        public Criteria andBookingStartNotIn(List<Date> values) {
            addCriterion("booking_start not in", values, "bookingStart");
            return (Criteria) this;
        }

        public Criteria andBookingStartBetween(Date value1, Date value2) {
            addCriterion("booking_start between", value1, value2, "bookingStart");
            return (Criteria) this;
        }

        public Criteria andBookingStartNotBetween(Date value1, Date value2) {
            addCriterion("booking_start not between", value1, value2, "bookingStart");
            return (Criteria) this;
        }

        public Criteria andBookingEndIsNull() {
            addCriterion("booking_end is null");
            return (Criteria) this;
        }

        public Criteria andBookingEndIsNotNull() {
            addCriterion("booking_end is not null");
            return (Criteria) this;
        }

        public Criteria andBookingEndEqualTo(Date value) {
            addCriterion("booking_end =", value, "bookingEnd");
            return (Criteria) this;
        }

        public Criteria andBookingEndNotEqualTo(Date value) {
            addCriterion("booking_end <>", value, "bookingEnd");
            return (Criteria) this;
        }

        public Criteria andBookingEndGreaterThan(Date value) {
            addCriterion("booking_end >", value, "bookingEnd");
            return (Criteria) this;
        }

        public Criteria andBookingEndGreaterThanOrEqualTo(Date value) {
            addCriterion("booking_end >=", value, "bookingEnd");
            return (Criteria) this;
        }

        public Criteria andBookingEndLessThan(Date value) {
            addCriterion("booking_end <", value, "bookingEnd");
            return (Criteria) this;
        }

        public Criteria andBookingEndLessThanOrEqualTo(Date value) {
            addCriterion("booking_end <=", value, "bookingEnd");
            return (Criteria) this;
        }

        public Criteria andBookingEndIn(List<Date> values) {
            addCriterion("booking_end in", values, "bookingEnd");
            return (Criteria) this;
        }

        public Criteria andBookingEndNotIn(List<Date> values) {
            addCriterion("booking_end not in", values, "bookingEnd");
            return (Criteria) this;
        }

        public Criteria andBookingEndBetween(Date value1, Date value2) {
            addCriterion("booking_end between", value1, value2, "bookingEnd");
            return (Criteria) this;
        }

        public Criteria andBookingEndNotBetween(Date value1, Date value2) {
            addCriterion("booking_end not between", value1, value2, "bookingEnd");
            return (Criteria) this;
        }

        public Criteria andExamineIsNull() {
            addCriterion("examine is null");
            return (Criteria) this;
        }

        public Criteria andExamineIsNotNull() {
            addCriterion("examine is not null");
            return (Criteria) this;
        }

        public Criteria andExamineEqualTo(String value) {
            addCriterion("examine =", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineNotEqualTo(String value) {
            addCriterion("examine <>", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineGreaterThan(String value) {
            addCriterion("examine >", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineGreaterThanOrEqualTo(String value) {
            addCriterion("examine >=", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineLessThan(String value) {
            addCriterion("examine <", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineLessThanOrEqualTo(String value) {
            addCriterion("examine <=", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineLike(String value) {
            addCriterion("examine like", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineNotLike(String value) {
            addCriterion("examine not like", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineIn(List<String> values) {
            addCriterion("examine in", values, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineNotIn(List<String> values) {
            addCriterion("examine not in", values, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineBetween(String value1, String value2) {
            addCriterion("examine between", value1, value2, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineNotBetween(String value1, String value2) {
            addCriterion("examine not between", value1, value2, "examine");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
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