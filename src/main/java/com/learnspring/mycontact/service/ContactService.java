package com.learnspring.mycontact.service;
import com.learnspring.mycontact.entity.ContactEntity;
import java.util.List;
import java.util.Optional;

public interface ContactService {
    Iterable<ContactEntity> findAll();

    List<ContactEntity> search(String term);

    Optional<ContactEntity> findOne(Integer id);

    void save(ContactEntity contact);

    void delete(Integer id);


}
