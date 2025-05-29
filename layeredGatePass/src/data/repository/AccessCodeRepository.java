package data.repository;

import data.models.AccessCode;

import java.util.List;
import java.util.Optional;

public interface AccessCodeRepository {

    AccessCode save(AccessCode accessCode);
    void delete(AccessCode accessCode);
    void deleteById(String id);
    void deleteAll();
    Optional<AccessCode> findById(String id);
    List<AccessCode> findAll();
    long count();
}
