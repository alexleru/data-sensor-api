package ru.alexleru.datasensorapi.entity.data;

import lombok.*;

import javax.persistence.Entity;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RelayStatus {
    private UUID uuid;
    private boolean Status;


}
