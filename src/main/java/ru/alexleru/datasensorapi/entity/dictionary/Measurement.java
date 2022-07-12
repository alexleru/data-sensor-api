package ru.alexleru.datasensorapi.entity.dictionary;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import ru.alexleru.datasensorapi.entity.data.Value;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "measurement")
public class Measurement {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "uuid", columnDefinition = "BINARY(16)")
    private UUID uuid;

    @Column(name = "name")
    private String name;

    @Column(name = "unit")
    private String unitMeasurement;

    @Column(name = "type")
    private String type;

    @OneToMany(mappedBy = "measurement", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Value> valuesList;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "sensor_id")
    @JsonIgnore
    private Sensor sensor;
}
