package data.repository;

import data.models.Visitor;
import data.models.Visitor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisitorsTest {

    private Visitors visitorsRepository;

    @BeforeEach
    void setUp() {
        visitorsRepository = new Visitors();
    }

    @Test
    public void visitorHasNotBeenAdded__countIsZeroTest() {
        assertEquals(0, visitorsRepository.count());
    }

    @Test
    public void saveAvIsitor__contIsOneTest() {
        Visitor visitor = new Visitor();
        visitor.setFullName("Chibuzo Nnewi");
        visitor.setAddress("12 Main Street");
        visitor.setPhone("090752881");
        visitorsRepository.save(visitor);
        assertEquals(1, visitorsRepository.count());
    }

    @Test
    public void saveAVisitor__updateSavedVisitorTest() {
        Visitor visitor = new Visitor();
        visitor.setFullName("Chibuzo Nnewi");
        visitor.setAddress("12 Main Street");
        visitor.setPhone("090752881");
        var saved = visitorsRepository.save(visitor);
        assertEquals(1, visitorsRepository.count());
        Visitor updated = new Visitor();
        updated.setFullName("Grace Nnewi");
        updated.setId(saved.getId());
        visitorsRepository.save(updated);
        assertEquals(1, visitorsRepository.count());
    }

    @Test
    public void deleteAVisitor__deleteByIdTest() {
        Visitor visitor = new Visitor();
        visitor.setFullName("Chibuzo Nnewi");
        visitor.setAddress("12 Main Street");
        visitor.setPhone("090752881");
        visitorsRepository.save(visitor);
        Visitor secondVisitor = new Visitor();
        secondVisitor.setFullName(visitor.getFullName());
        secondVisitor.setAddress("98 Last Street");
        secondVisitor.setPhone("09865776556");
        visitorsRepository.save(secondVisitor);
        assertEquals(2, visitorsRepository.count());
        visitorsRepository.deleteById(visitor.getId());
        assertEquals(1, visitorsRepository.count());
        assertTrue(visitorsRepository.findAll().contains(secondVisitor));
        assertFalse(visitorsRepository.findAll().contains(visitor));
    }

    @Test
    public void deleteAVisitor__deleteTest() {
        Visitor visitor = new Visitor();
        visitor.setFullName("Chibuzo Nnewi");
        visitor.setAddress("12 Main Street");
        visitor.setPhone("090752881");
        visitorsRepository.save(visitor);
        visitorsRepository.delete(visitor);
        assertEquals(0, visitorsRepository.count());
    }

    @Test
    public void deleteAllVisitors__countIsZeroTest() {
        Visitor visitor = new Visitor();
        visitor.setFullName("Chibuzo Nnewi");
        visitor.setAddress("12 Main Street");
        visitor.setPhone("090752881");
        visitorsRepository.save(visitor);
        assertEquals(1, visitorsRepository.count());
        visitorsRepository.deleteAll();
        assertEquals(0, visitorsRepository.count());
    }

    @Test
    public void saveAResident__findByIdTest() {
        Visitor visitor = new Visitor();
        visitor.setFullName("Chibuzo Nnewi");
        visitor.setAddress("12 Main Street");
        visitor.setPhone("090752881");
        visitorsRepository.save(visitor);
        var savedVisitor = visitorsRepository.findById(visitor.getId()).get();
        assertEquals(visitor, savedVisitor);
    }

    @Test
    public void saveTwoVisitors__findByPhoneTest() {
        Visitor visitor = new Visitor();
        visitor.setFullName("Chibuzo Nnewi");
        visitor.setAddress("12 Main Street");
        visitor.setPhone("090752881");
        visitorsRepository.save(visitor);
        Visitor secondVisitor = new Visitor();
        secondVisitor.setFullName("Grace Nnewi");
        secondVisitor.setAddress("98 Last Street");
        secondVisitor.setPhone("09865776556");
        visitorsRepository.save(secondVisitor);
        assertEquals(2, visitorsRepository.count());
        var foundVisitor = visitorsRepository.existByPhone(visitor.getPhone()).get();
        assertEquals(visitor, foundVisitor);
    }

    @Test
    public void saveTwoVisitors__findByFullNameTest() {
        saveTwoVisitors__findByPhoneTest();
        assertEquals(1, visitorsRepository.findAllByFullName("Chibuzo Nnewi").size());
    }

    @Test
    public void saveTwoVisitors__findAllTest() {
        saveTwoVisitors__findByPhoneTest();
        assertEquals(2, visitorsRepository.findAll().size());
    }
}

