package data.repository;

import data.models.Resident;

import java.util.List;
import java.util.Optional;

public interface ResidentRepository {


    Resident save(Resident resident);
    void deleteById(String id);
    void delete(Resident resident);
    void deleteAll();
    Optional<Resident> findById(String id);
    Optional<Resident> existByEmail(String email);
    List<Resident> findAllByFullName(String fullName);
    List<Resident> findAll();
    long count();
}
