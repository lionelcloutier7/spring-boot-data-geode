/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.springframework.boot.data.geode.repository.repo;

import org.springframework.boot.data.geode.repository.model.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * The {@link CustomerRepository} interface defines a Spring Data {@link CrudRepository} for performing basic CRUD
 * and simple query data access operations on {@link Customer} objects stored in Apache Geode or Pivotal GemFire.
 *
 * @author John Blum
 * @see org.springframework.boot.data.geode.repository.model.Customer
 * @see org.springframework.data.repository.CrudRepository
 * @since 1.0.0
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

	Customer findByName(String name);

}
