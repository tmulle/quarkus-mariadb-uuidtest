package foo.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class MyEntity {
    
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "entity_name")
    private String name;
}
