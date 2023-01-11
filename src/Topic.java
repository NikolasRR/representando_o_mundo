public class Topic {
  String name;
  Question[] questions = new Question[10];

  public String getName() {
    return this.name;
  }

  public Question[] getQuestions() {
    return this.questions;
  }
}
