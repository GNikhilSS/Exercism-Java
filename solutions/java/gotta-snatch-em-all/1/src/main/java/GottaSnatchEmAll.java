import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {
    
    static Set<String> newCollection(List<String> cards) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < cards.size(); i++) {
            set.add(cards.get(i));
        }
        return set;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean iHaveSomethingTheyDont = false;
        boolean theyHaveSomethingIDont = false;
    
        for (String card : myCollection) {
            if (!theirCollection.contains(card)) {
                iHaveSomethingTheyDont = true;
                break;
            }
        }
    
        for (String card : theirCollection) {
            if (!myCollection.contains(card)) {
                theyHaveSomethingIDont = true;
                break;
            }
        }
    
        return iHaveSomethingTheyDont && theyHaveSomethingIDont;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common = new HashSet<>(collections.get(0));

        for (int i = 1; i < collections.size(); i++) {
            common.retainAll(collections.get(i));
        }

        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet<>();

        for (Set<String> cards : collections) {
            for (String i: cards) {
                all.add(i);
            }
        }

        return all;
    }
}
