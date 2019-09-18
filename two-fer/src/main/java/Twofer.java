class Twofer {
    String twofer(String name) {
      String whoItsFor = name == null ? name = "you" : name;
      return "One for " + whoItsFor + ", one for me.";
    }
}
