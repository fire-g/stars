package edu.wf.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("User")
public class User {
    @Id
    private int id;
    private String username;
    private String email;

    @JsonIgnore
    private String password;

    @JsonIgnore
    private String salt;

}
