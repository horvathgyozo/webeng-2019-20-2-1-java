package hu.elte.IssueTracker.repositories;

import hu.elte.IssueTracker.entities.Issue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepository extends CrudRepository<Issue, Integer> {
    
}
