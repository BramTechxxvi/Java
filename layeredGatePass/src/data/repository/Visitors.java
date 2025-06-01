package data.repository;
 import data.models.Visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Visitors  implements VisitorRepository {

    private List<Visitor> visitors = new ArrayList<>();
    private int count;

    @Override
    public Visitor save(Visitor visitor) {
        if (isNew(visitor)) saveNew(visitor); else update(visitor);
        return visitor;
    }

    private boolean isNew(Visitor visitor) {
        return visitor.getId() == null;
    }

    private void saveNew(Visitor visitor) {
        visitor.setId(generateId());
        visitors.add(visitor);
    }

    private void update(Visitor visitor) {
        for (int count = 0; count < visitors.size(); count++) {
            if (visitor.getId().equals(visitors.get(count).getId())) visitors.set(count, visitor);
        }
    }

    private String generateId() {
        return String.valueOf(++count);
    }

    @Override
    public void deleteById(String id) {
        visitors.removeIf(visitor -> visitor.getId().equals(id));
    }

    @Override
    public void delete(Visitor visitor) {
        visitors.remove(visitor);
    }

    @Override
    public void deleteAll() {
        visitors.clear();
    }

    @Override
    public Optional<Visitor> findById(String id) {
        for (Visitor visitor : visitors) {
            if (visitor.getId().equals(id)) return Optional.of(visitor);
        } return Optional.empty();
    }

    @Override
    public Optional<Visitor> existByPhone(String phone) {
        for (Visitor visitor : visitors) {
            if (visitor.getPhone().equals(phone)) return Optional.of(visitor);
        } return Optional.empty();
    }

    @Override
    public List<Visitor> findAllByFullName(String fullName) {
        List<Visitor> newList = new ArrayList<>();
        for (Visitor visitor: visitors) {
            if (visitor.getFullName().equals(fullName)) newList.add(visitor);
        }
        return newList;
    }

    @Override
    public List<Visitor> findAll() {
        return List.copyOf(visitors);
    }

    @Override
    public long count() {
        return visitors.size();
    }
}
