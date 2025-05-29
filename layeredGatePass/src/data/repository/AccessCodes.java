package data.repository;

import data.models.AccessCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccessCodes implements AccessCodeRepository{

    private List<AccessCode> accessCodes = new ArrayList<>();
    private int count;


    @Override
    public AccessCode save(AccessCode accessCode) {
        if (isNew(accessCode)) saveNew(accessCode); else update(accessCode);
        return accessCode;
    }

    private void update(AccessCode accessCode) {
        for(AccessCode access : accessCodes) {
            if(access.getId().equals(accessCode.getId())) access.setId(accessCode.getId());
        }
    }

    private void saveNew(AccessCode accessCode) {
        accessCode.setId(generateId());
        accessCodes.add(accessCode);
    }

    private boolean isNew(AccessCode accessCode) {
        return accessCode.getId() == null;
    }

    private String generateId() {
        return String.valueOf(++count);
    }

    @Override
    public void delete(AccessCode accessCode) {
        accessCodes.remove(accessCode);
    }

    @Override
    public void deleteById(String id) {
        accessCodes.removeIf(accessCode -> accessCode.getId().equals(id));
    }

    @Override
    public void deleteAll() {
        accessCodes.clear();
    }

    @Override
    public Optional<AccessCode> findById(String id) {
        for (AccessCode accessCode : accessCodes) {
            if (accessCode.getId().equals(id)) return Optional.of(accessCode);
        } return Optional.empty();
    }

    @Override
    public List<AccessCode> findAll() {
        return List.copyOf(accessCodes);
    }

    @Override
    public long count() {
        return accessCodes.size();
    }
}
