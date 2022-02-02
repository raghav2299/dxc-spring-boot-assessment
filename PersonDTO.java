package com.dxclearninig1.DTO;
import java.time.LocalDate;

import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PersonDTO {
    private Integer id;
    private String name;
    private LocalDate dob;
    private String address;
    private String email;
    
}
