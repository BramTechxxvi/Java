package data.repository;

import data.models.Visitor;

import java.util.Optional;
import java.util.List;

public interface VisitorRepository {

    Visitor save(Visitor visitor);
    void deleteById(String id);
    void delete(Visitor visitor);
    void deleteAll();
    Optional<Visitor> findById(String id);
    Optional<Visitor> existByPhone(String phone);
    List<Visitor> findAllByFullName(String fullName);
    List<Visitor> findAll();
    long count();
}
