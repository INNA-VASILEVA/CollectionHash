package Autoracing.Sponsor;

import java.util.Objects;

public class Sponsor {
    private final String sponsorName;
    private final int AmountOfSupport;

    public Sponsor(String sponsorName, int amountOfSupport) {
        this.sponsorName = sponsorName;
        AmountOfSupport = amountOfSupport;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public int getAmountOfSupport() {
        return AmountOfSupport;
    }

    public void sponsorTheRace() {
        System.out.printf("Спонсор %s, выделил сумму %d",sponsorName,AmountOfSupport);
    }

    @Override
    public String toString() {
        return "Имя спонсора" + sponsorName + " Сумма поддержки " + AmountOfSupport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return AmountOfSupport == sponsor.AmountOfSupport && Objects.equals(sponsorName, sponsor.sponsorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sponsorName, AmountOfSupport);
    }
}
