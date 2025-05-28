package data.repository;

import data.models.Resident;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Residents implements ResidentRepository {

    private List<Resident> residents = new ArrayList<>();
    private int count;

    @Override
    public Resident save(Resident resident) {
        if (isNew(resident)) saveNew(resident); else update(resident);
        return resident;
    }

    private boolean isNew(Resident resident) {
        return resident.getId() == null;
    }

    private void saveNew(Resident resident) {
        resident.setId(generateId());
        residents.add(resident);
    }

    private void update(Resident resident) {
        for(Resident houseOwner : residents) {
            if(houseOwner.getId().equals(resident.getId())) {
                residents.set(residents.indexOf(houseOwner), resident);
            }
        }
    }

    private String generateId() {
        return String.valueOf(++count);
    }

    @Override
    public void deleteByid(String id) {
        for (int count = 0; count < residents.size(); count++) {
            if (residents.get(count).getId().equals(id)) residents.remove(residents.get(count));
        }
    }

    @Override
    public void delete(Resident resident) {
        residents.remove(resident);
    }

    @Override
    public void deleteAll() {
        residents.clear();
    }

    @Override
    public Optional<Resident> findById(String id) {
        for (Resident resident : residents) {
            if(resident.getId().equals(id)) {
                return Optional.of(resident);
            }
        } return  Optional.empty();
    }

    @Override
    public List<Resident> findAllByFullName(String fullName) {
        List<Resident> houseOwner = new ArrayList<>();
        for (Resident resident : residents) {
            if (resident.getFullName().equalsIgnoreCase(fullName)) houseOwner.add(resident);
        }
        return houseOwner;
    }

    @Override
    public List<Resident> findAll() {
        return List.copyOf(residents);
    }


    @Override
    public long count() {
        return residents.size();
    }

    /*
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Resident resident = (Resident) o;
        return Objects.equals(this, resident);
    }

     */

}
