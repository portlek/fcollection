package io.github.portlek.fcollection.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * a class that represents a Language.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity(name = "Language")
@Table(name = "supported_languages")
public class Language {

  /**
   * id of the language.
   */
  @Id
  @GeneratedValue
  @Column(
    name = "id",
    updatable = false
  )
  private long id;

  /**
   * language name of the language.
   */
  @Column(
    name = "language",
    unique = true
  )
  private String language;

  /**
   * ctor.
   *
   * @param language the language.
   */
  public Language(final String language) {
    this.language = language;
  }
}
