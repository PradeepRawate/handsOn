package com.osius.repositoryimpl;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.osius.entity.Department;
import com.osius.entity.DepartmentDetails;
import com.osius.entity.User;
import com.osius.mongo.repository.DepartmentRepository;
import com.osius.mongo.repository.UserRepositoryCustom;

@Service
public class UserRepositoryImpl implements UserRepositoryCustom  {
	
	@Autowired
	MongoOperations operations; 
	
	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public List<DepartmentDetails> getUsersCount() {
		
		Aggregation aggregation = Aggregation.newAggregation(//
					Aggregation.group("departmentId")//
						.count().as("usersCount"), //
						project("usersCount").and("departmentId").as("id")
					);

		AggregationResults<DepartmentDetails> result= operations.aggregate(aggregation, User.class ,DepartmentDetails.class);
		
		List<DepartmentDetails> response = result.getMappedResults();
		for (DepartmentDetails departmentDetails : response) {
			Query query = new Query();
			query.addCriteria(Criteria.where("_id").is(departmentDetails.getId()));
			Department d = operations.findOne(query, Department.class);
			departmentDetails.setName(d.getName());
		}
		
		return response;
	}
	
}
