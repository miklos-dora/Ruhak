package hu.nye.progkor.Ruhak.data.model;

import java.util.Objects;

/**
 * Ruhaknak model osztaly
 */
public class Ruhak {

    private Long Id;
    private String meret;
    private String szin;
    private int ar;
    private Marka marka;

    public Ruhak(Long id, String meret, String szin, int ar, Marka marka) {
        Id = id;
        this.meret = meret;
        this.szin = szin;
        this.ar = ar;
        this.marka = marka;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getMeret() {
        return meret;
    }

    public void setMeret(String meret) {
        this.meret = meret;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ruhak ruhak = (Ruhak) o;

        if (ar != ruhak.ar) return false;
        if (!Objects.equals(Id, ruhak.Id)) return false;
        if (!Objects.equals(meret, ruhak.meret)) return false;
        if (!Objects.equals(szin, ruhak.szin)) return false;
        return marka == ruhak.marka;
    }

    @Override
    public int hashCode() {
        int result = Id != null ? Id.hashCode() : 0;
        result = 31 * result + (meret != null ? meret.hashCode() : 0);
        result = 31 * result + (szin != null ? szin.hashCode() : 0);
        result = 31 * result + ar;
        result = 31 * result + (marka != null ? marka.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ruhak{" +
                "Id=" + Id +
                ", meret='" + meret + '\'' +
                ", szin='" + szin + '\'' +
                ", ar=" + ar +
                ", marka=" + marka +
                '}';
    }
}
