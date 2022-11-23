package sponsors;

import java.util.LinkedList;

public class Sponsor {
    private String sponsor;
    private int sumSupport;

    public Sponsor(String sponsor, int sumSupport) {
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

    private LinkedList<Sponsor> sponsorLinkedList;

    public Sponsor(LinkedList<Sponsor> sponsorLinkedList) {
        this.sponsorLinkedList = sponsorLinkedList;
    }

    public LinkedList<Sponsor> getSponsorLinkedList() {
        return sponsorLinkedList;
    }

    @Override
    public String toString() {
        return "Спонсор " + sponsor;
    }

    public void sponsorRace() {
        System.out.println("Спонсировать на сумму " + getSumSupport() + " тугриков");
    }
}
