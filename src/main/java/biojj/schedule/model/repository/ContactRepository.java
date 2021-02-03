package biojj.schedule.model.repository;

import biojj.schedule.model.entity.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contacts, Integer> {

}
