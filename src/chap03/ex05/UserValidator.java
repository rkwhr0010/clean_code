package chap03.ex05;

public class UserValidator {
  private Crytograher crytograher;

  public boolean checkPassword(String username, String password) {
    User user = UserGateway.findByName(username);
    
    if(user != User.NULL) {
      String codePhrase = user.getPhraseEncodeByPassword();
      String phrase = crytograher.decrpt(codePhrase, password);

      if("Valid Password".equals(phrase)) {
        Session.initialize();

        return true;
      }
    }

    return false;
  }
}
