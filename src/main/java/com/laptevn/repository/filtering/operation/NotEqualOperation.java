package com.laptevn.repository.filtering.operation;

import com.laptevn.auth.entity.Role;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import java.time.LocalDate;
import java.time.LocalTime;

class NotEqualOperation extends Operation {
    @Override
    protected Predicate executeRoleOperation(
            CriteriaBuilder criteriaBuilder, Expression<? extends Role> leftExpression, Role value) {
        return criteriaBuilder.notEqual(leftExpression, value);
    }

    @Override
    protected Predicate executeIntegerOperation(
            CriteriaBuilder criteriaBuilder, Expression<? extends Integer> leftExpression, Integer value) {
        return criteriaBuilder.notEqual(leftExpression, value);
    }

    @Override
    protected Predicate executeStringOperation(
            CriteriaBuilder criteriaBuilder, Expression<? extends String> leftExpression, String value) {
        return criteriaBuilder.notEqual(leftExpression, value);
    }

    @Override
    protected Predicate executeDateOperation(
            CriteriaBuilder criteriaBuilder, Expression<? extends LocalDate> leftExpression, LocalDate value) {
        return criteriaBuilder.notEqual(leftExpression, value);
    }

    @Override
    protected Predicate executeTimeOperation(
            CriteriaBuilder criteriaBuilder, Expression<? extends LocalTime> leftExpression, LocalTime value) {
        return criteriaBuilder.notEqual(leftExpression, value);
    }

    @Override
    public OperationType getOperationType() {
        return OperationType.NE;
    }
}