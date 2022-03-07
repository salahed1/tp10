package ma.cigma.pfe.models;
import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
@Data
@DiscriminatorValue("vip")

public class clientVip extends client{
	private String preferences;
	public clientVip(String name, String preferences) {
	super(name);
	this.preferences = preferences;
	}
}
