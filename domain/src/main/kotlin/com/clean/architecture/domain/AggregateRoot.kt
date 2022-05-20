package com.clean.architecture.domain

abstract class AggregateRoot<ID: Identifier>(id: ID) : Entity<ID>(id) {

}
