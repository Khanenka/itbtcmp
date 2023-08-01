package com.khanenka.personandrole;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Data
@Entity(name = "btcmp")
@Table(name = "btcmp")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Integer idPerson;

  @Column
  @Size(max = 40)
  @NotNull
  String surname;

  @NotNull
  @Column
  @Size(max = 20)
  String name;

  @NotNull
  @Column
  @Size(max = 40)
  String middlename;

  @NotNull
  @Email
  @Column
  @Size(max = 50)
  String email;

  @NotNull
  @Column
  Role role;


}