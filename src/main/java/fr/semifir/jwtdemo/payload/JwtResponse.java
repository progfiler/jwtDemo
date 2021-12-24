package fr.semifir.jwtdemo.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class JwtResponse implements Serializable {
    private final String jwtToken;
}
