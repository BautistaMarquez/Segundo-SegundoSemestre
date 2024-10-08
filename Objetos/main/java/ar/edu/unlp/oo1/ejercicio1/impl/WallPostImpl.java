package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	private String text;
	private int likes;
	private boolean featured;
	
	
	public WallPostImpl() {
		this.text = "Undefined post";
		this.likes = 0;
		this.featured = false;
	}
	

    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

	@Override
	public String getText() {
	
		return this.text;
	}

	@Override
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public int getLikes() {
		// TODO Auto-generated method stub
		return this.likes;
	}

	@Override
	public void like() {
		this.likes = this.likes+1;
		
	}

	@Override
	public void dislike() {
		if(this.likes>0) {
			this.likes = this.likes-1;
		}
		
	}

	@Override
	public boolean isFeatured() {
		
		return this.featured;
	}

	@Override
	public void toggleFeatured() {
		if(this.featured) {
			this.featured = false;
		} else {
			this.featured = true;
		}
		
	}

}
