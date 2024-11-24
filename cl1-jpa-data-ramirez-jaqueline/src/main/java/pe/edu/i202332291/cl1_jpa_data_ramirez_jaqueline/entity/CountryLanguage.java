package pe.edu.I202332291.cl1_jpa_data_ramirez_jaqueline.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "country")
public class CountryLanguage {

    @Id
    @Column(name = "CountryCode", length = 3, nullable = false)
    private String countryCode;

    @Id
    @Column(name = "Language", length = 2, nullable = false)
    private String language;

    private String isOfficial;
    private Double percentage;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "CountryCode", insertable = false, updatable = false)
    private pe.edu.I202332291.cl1_jpa_data_ramirez_jaqueline.entity.Country country;
}