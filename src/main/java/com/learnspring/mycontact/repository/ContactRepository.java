package com.learnspring.mycontact.repository;
import com.learnspring.mycontact.entity.ContactEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ContactRepository extends CrudRepository<ContactEntity, Integer> {
    List<ContactEntity> findByNameContaining(String name);

}
