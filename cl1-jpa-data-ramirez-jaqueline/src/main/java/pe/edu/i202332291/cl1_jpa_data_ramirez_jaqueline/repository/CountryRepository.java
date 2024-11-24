package pe.edu.I202332291.cl1_jpa_data_ramirez_jaqueline.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.I202332291.cl1_jpa_data_ramirez_jaqueline.entity.Country;

public interface CountryRepository  extends CrudRepository<Country, String> {
}
