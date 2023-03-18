package com.eazybytes.accounts.repository;

import org.springframework.data.repository.CrudRepository;

import com.eazybytes.accounts.model.Accounts;

public interface AccountsRepository extends CrudRepository<Accounts, Long> {

	Accounts findByCustomerId(int customerId);

}
