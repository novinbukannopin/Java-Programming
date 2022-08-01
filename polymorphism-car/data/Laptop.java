package data;
public interface Laptop extends Brand, SizeRam {
    void showLaptop();
    @Override
    public String getBrand() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getSizeRam() {
        // TODO Auto-generated method stub
        return 0;
    }
}
