package it.kamaladafrica.codicefiscale;

import java.time.LocalDate;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.AllArgsConstructor;
import lombok.AccessLevel;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Person {

	@NonNull
	public String firstname;

	@NonNull
	public String lastname;

	@NonNull
	public LocalDate birthDate;

	@NonNull
	public City city;

	public boolean isFemale;

}
