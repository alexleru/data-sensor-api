package ru.alexleru.datasensorapi.entity.data;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "data")
public class Data {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "uuid", columnDefinition = "BINARY(16)")
    private UUID uuid;

    @Column(name = "datetime")
    @CreationTimestamp
    private Date dataTime;

    @OneToMany(mappedBy = "data", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Value> values;
}
