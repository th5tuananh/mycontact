package com.learnspring.mycontact.service;
import com.learnspring.mycontact.repository.ContactRepository;
import com.learnspring.mycontact.entity.ContactEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Iterable<ContactEntity> findAll() {
        return contactRepository.findAll();
    }

    @Override
    public List<ContactEntity> search(String term) {
        return contactRepository.findByNameContaining(term);
    }

    @Override
    public Optional<ContactEntity> findOne(Integer id) {
        return contactRepository.findById(id);
    }

    @Override
    public void save(ContactEntity contact) {
        contactRepository.save(contact);
    }

    @Override
    public void delete(Integer id) {
        contactRepository.deleteById(id);
    }
}
