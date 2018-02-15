package com.curtinhome.issuetracker.issue;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IssueRepository extends CrudRepository<Issue, Long> {
    List<Issue> findByOwner(long owner);
    List<Issue> findByTenant(long tenant);
}
