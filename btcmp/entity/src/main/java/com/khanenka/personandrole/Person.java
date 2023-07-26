package com.khanenka.personandrole;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "btcmp")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Person {

  @Id
  @Column(name = "id_Person")
  int id;
  @Column
  String surname;
  @Column
  String name;
  @Column
  String middleName;
  @Column
  String email;
  @Column
  Role role;


}
