package ma.cigma.pfe.models;
import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
@Data
@PrimaryKeyJoinColumn(name="normal_id")
@DiscriminatorValue("normal")


public class clientNormal extends client {
	private int importanceLevel;
	public clientNormal(String name, int importanceLevel) {
	super(name);
	this.importanceLevel = importanceLevel;
	}
}
