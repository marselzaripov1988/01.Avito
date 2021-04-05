package tech.itpark.avito.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Flat {
    private long id;
    private int rooms;
    private String district;
    private int price;
}
