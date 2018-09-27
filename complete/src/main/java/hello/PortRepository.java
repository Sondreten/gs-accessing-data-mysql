package hello;

import org.springframework.data.repository.CrudRepository;

public interface PortRepository extends CrudRepository<Port, String> {

}
