package ma.xproce.inventoryservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.function.LongFunction;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Creator {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @OneToMany (mappedBy = "creator")
    private List<Video> videos;

}
