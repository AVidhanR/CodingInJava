/**
 * OOP Concept: Inner Classes [RECAP]
 */

// can't make the outer class static
class Database {
  String connectionString;

  public void show() {
    System.out.println(connectionString + " is the db");
  }

  class DBConfig {
    public void config() {
      System.out.println("DB Configuration");
    }
  }

  static class Platform {
    public void showPlatform() {
      System.out.println("Platform is Azure");
    }
  }
}

public class InnerClass {
  public static void main(String[] args) {
    Database db = new Database();
    db.connectionString = "MongoDB";
    db.show();

    Database.DBConfig configs = db.new DBConfig();
    configs.config();

    // is possible if the inner class is static
    Database.Platform platform = new Database.Platform();
    platform.showPlatform();

    // Anonymous Inner Class
    Database newDB = new Database() {
      public void show() {
        System.out.println("In the new Database Anonymous show method");
      }
    };
    newDB.show();

  }
}