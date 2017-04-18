package org.joyofcoding.objectcalisthenics.domain;

/**
 * Created by Jasper on 27-Mar-17.
 */
public class Quality {
    int quality = 0;

    public Quality(int quality){
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void reduceQuality() { quality--; }

    public void increaseQuality() { quality++; }

    public boolean isQualityGreaterThen(int quality) { return this.quality > quality; }

    public boolean isQualityLowerThen(int quality) { return this.quality < quality; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Quality quality1 = (Quality) o;

        return quality == quality1.quality;
    }

    @Override
    public int hashCode() {
        return quality;
    }

    public void resetQuality() {
        quality = 0;
    }
}
