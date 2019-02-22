
/**
 * Purse
 */
import java.util.ArrayList;

public class Purse {

    private String purseName;
    ArrayList<String> names = new ArrayList<String>();

    public Purse(String usrName) {
        purseName = usrName;
    }

    public void addCoin(String coinName) {
        names.add(coinName);
    }

    public String toString() {
        if (names.size() != 0) {
            String foo = "";
            for (String name : names) {
                foo += "," + name;
            }
            return purseName + "[" + foo.substring(1) + "]";
        }
        return purseName + "[]";
    }

    public ArrayList getValue() {
        return names;
    }

    public ArrayList<String> reverse() {
        ArrayList<String> foo = new ArrayList<>();
        for (int i = 1; i < getSize() + 1; i++) {
            foo.add(names.get(getSize() - i));
        }
        return foo;
    }

    public int getSize() {
        return names.size();
    }

    public void tranfer(Purse otherPurse) {
        if (names.size() != 0) {
            for (String initCoin : names) {
                otherPurse.addCoin(initCoin);
            }
            names.clear();
        }
    }

    public boolean sameContent(Purse otherPurse) {
        return names.equals(otherPurse.getValue());
    }

    public boolean sameCoins(Purse otherPurse) {
        if (getSize() != otherPurse.getSize())
            return false;
        ArrayList foo = getValue();
        boolean bool = false;
        for (int i = 0; i < getSize(); i++) {
            for (String name : (ArrayList<String>) otherPurse.getValue()) {
                if (foo.get(i) == name) {
                    bool = true;
                    break;
                }
            }
            if (bool) {
                foo.remove(i);
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}