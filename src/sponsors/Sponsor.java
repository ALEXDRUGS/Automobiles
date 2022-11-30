package sponsors;

import java.util.Objects;
import java.util.Set;

public class Sponsor {
    private String sponsor;
    private Integer sumSupport;

    public Sponsor(String sponsor, Integer sumSupport) {
        this.sponsor = sponsor;
        this.sumSupport = sumSupport;
    }


    public String getSponsor() {
        if (sponsor != null && sponsor.isBlank()) {
            return sponsor;
        }
        return "error";
    }

    public int getSumSupport() {
        return sumSupport;
    }

    private Set<Sponsor> sponsorSet;

    public Sponsor(Set<Sponsor> sponsorSet) {
        this.sponsorSet = sponsorSet;
    }

    public Set<Sponsor> getSponsorSet() {
        return sponsorSet;
    }

    @Override
    public String toString() {
        return "Спонсор " + sponsor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor1 = (Sponsor) o;
        return sumSupport == sponsor1.sumSupport && sponsor.equals(sponsor1.sponsor) && sponsorSet.equals(sponsor1.sponsorSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sponsor, sumSupport, sponsorSet);
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public void setSumSupport(Integer sumSupport) {
        this.sumSupport = sumSupport;
    }

    public void setSponsorSet(Set<Sponsor> sponsorSet) {
        this.sponsorSet = sponsorSet;
    }

    public void sponsorRace() {
        System.out.println("Спонсировать на сумму " + getSumSupport() + " тугриков");
    }
}
