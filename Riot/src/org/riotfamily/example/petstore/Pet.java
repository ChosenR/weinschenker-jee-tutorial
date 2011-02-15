package org.riotfamily.example.petstore;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.riotfamily.media.model.RiotImage;
import org.riotfamily.riot.hibernate.domain.ActiveRecordSupport;
import org.riotfamily.website.cache.TagCacheItems;

@Entity
@TagCacheItems
public class Pet extends ActiveRecordSupport {

	/**
	 * The serialVersionUID.
	 */
	private static final long serialVersionUID = 6581392200053996588L;

	/**
	 * The pet's name.
	 */
	private String name;
	
	/**
	 * The image.
	 */
	private RiotImage image;
	
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public final void setName(final String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return
	 */
	public static List<Pet> loadAll() {
		return find("from Pet");
	}

	@ManyToOne
	@Cascade(CascadeType.SAVE_UPDATE)
	public RiotImage getImage() {
		return image;
	}

	public void setImage(final RiotImage image) {
		this.image = image;
	}
	
}
