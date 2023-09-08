package chap03.ex05;

public class UserValidator {
  private Crytograher crytograher;

  public boolean checkPasswordAndInitializeSession(String username, String password) {
    User user = UserGateway.findByName(username);
    
    if(user != User.NULL) {
      String codePhrase = user.getPhraseEncodeByPassword();
      String phrase = crytograher.decrypt(codePhrase, password);

      if("Valid Password".equals(phrase)) {
        Session.initialize();

        return true;
      }
    }

    return false;
  }
}
