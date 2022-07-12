package ru.alexleru.datasensorapi.entity.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import ru.alexleru.datasensorapi.entity.dictionary.Measurement;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"measurement", "data"})
@Table(name = "value")
public class Value {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "uuid", columnDefinition = "BINARY(16)")
    private UUID uuid;

    @Column(name = "value")
    private Double value;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "data_id")
    @JsonIgnore
    private Data data;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "measurement_id")
    @JsonIgnore
    private Measurement measurement;

    @Transient
    private UUID measurementUuid;

    @JsonIgnore
    public UUID getMeasurementUuid2() {
        return measurementUuid;
    }

}
