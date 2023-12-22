package guru.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * created by Almaz
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private UUID id;
    private String name;
}
