package set.basicOperations;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {
  private Set<Guest> guestSet;

  public GuestSet() {
    this.guestSet = new HashSet<>();
  }

  public void addGuest(String name, int invitationCode) {
    guestSet.add(new Guest(name, invitationCode));
  }

  public void removeGuestByInvitationCode(int invitationCode) {
    for (Guest guestToRemove : guestSet) {
      if (guestToRemove.getInvitationCode() == invitationCode) {
        guestSet.remove(guestToRemove);
        break;
      }
    }
  }

  public int quantityOfGuests() {
    return guestSet.size();
  }

  public void showGuests() {
    System.out.println(guestSet);
  }
}
