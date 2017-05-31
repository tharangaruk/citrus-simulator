/*
 * Copyright 2006-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.consol.citrus.simulator.repository;

import com.consol.citrus.simulator.model.TestExecution;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * JPA repository for {@link TestExecution}
 */
@Repository
public interface TestExecutionRepository extends CrudRepository<TestExecution, Long> {
    List<TestExecution> findByTestNameOrderByStartDateDesc(String testName);

    List<TestExecution> findByStatusOrderByStartDateDesc(TestExecution.Status status);

    List<TestExecution> findByStartDateBetweenOrderByStartDateDesc(Date fromDate, Date toDate, Pageable pageable);
}