package com.objective.portal.repositories;

import com.objective.portal.models.Groups;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GroupsRepository extends CrudRepository<Groups, Long> {

    Groups findById(String id);

    List<Groups> findByDateinactivateIsNull();

}
