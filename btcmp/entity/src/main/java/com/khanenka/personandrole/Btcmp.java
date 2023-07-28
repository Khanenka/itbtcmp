package com.khanenka.personandrole;


import lombok.*;
import org.springframework.data.annotation.Id;
import javax.persistence.*;

@Data
@Entity(name = "btcmp")
@Table(name = "btcmp")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Btcmp {

  @Id
  @GeneratedValue(strategy =GenerationType.AUTO)
  Integer idPerson;
  @Column
  String surname;
  @Column
  String name;
  @Column
  String middlename;
  @Column
  String email;
  @Column
  Role role;


}
