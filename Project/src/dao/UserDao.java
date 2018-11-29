package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.User;

/**
 * ユーザテーブル用のDao
 * @author takano
 *
 */

public class UserDao {

    /**
     * ログインIDとパスワードに紐づくユーザ情報を返す
     * @param loginId
     * @param password
     * @return
     */
    public User findByLoginInfo(String loginId, String password) {
        Connection conn = null;
        try {
            // データベースへ接続
            conn = DBManager.getConnection();

            // SELECT文を準備
            String sql = "SELECT * FROM user WHERE login_id = ? and password = ?";

             // SELECTを実行し、結果表を取得
            PreparedStatement pStmt = conn.prepareStatement(sql);
            pStmt.setString(1, loginId);
            pStmt.setString(2, password);
            ResultSet rs = pStmt.executeQuery();

             // 主キーに紐づくレコードは1件のみなので、rs.next()は1回だけ行う
            if (!rs.next()) {
                return null;
            }

            String loginIdData = rs.getString("login_id");
            String nameData = rs.getString("name");
            return new User(loginIdData, nameData);

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            // データベース切断
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
    }


    /**
     * 全てのユーザ情報を取得する
     * @return
     */
    public List<User> findAll() {
        Connection conn = null;
        List<User> userList = new ArrayList<User>();

        try {
            // データベースへ接続
            conn = DBManager.getConnection();

            // SELECT文を準備
            // TODO: 未実装：管理者以外を取得するようSQLを変更する
            String sql = "SELECT * FROM user";

             // SELECTを実行し、結果表を取得
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // 結果表に格納されたレコードの内容を
            // Userインスタンスに設定し、ArrayListインスタンスに追加
            while (rs.next()) {
                int id = rs.getInt("id");
                String loginId = rs.getString("login_id");
                String name = rs.getString("name");
                Date birthDate = rs.getDate("birth_date");
                String password = rs.getString("password");
                String createDate = rs.getString("create_date");
                String updateDate = rs.getString("update_date");
                User user = new User(id, loginId, name, birthDate, password, createDate, updateDate);

                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            // データベース切断
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        return userList;
    }





//自分で足したコード//

//新規登録画面のコード//

    /**
     * ログインIDに紐づくユーザ情報を返す
     * @param loginId
     * @return
     * @throws SQLException
     */
    public void NewInfo(String loginId,String password,String password2,String name,String birthDate) throws SQLException {
        Connection conn = null;
        try {
            // データベースへ接続
            conn = DBManager.getConnection();

            // INSERT文を準備
            String sql = "INSERT INTO user(login_id,password,name,birth_date,create_date,update_date)VALUES(?,?,?,?,now(),now())";

             // INSERTを実行し、結果表を取得
            PreparedStatement pStmt = conn.prepareStatement(sql);
            pStmt.setString(1, loginId);
            pStmt.setString(2, password);
            pStmt.setString(3, name);
            pStmt.setString(4, birthDate);

            int rs = pStmt.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
            throw e;

        } finally {
            // データベース切断
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();

                }
            }
        }
    }

//詳細画面のコード//
/**
 * ログインIDに紐づくユーザ情報を返す
 * @param loginId
 * @return
 */
public User findByInfo(String id) {
    Connection conn = null;
    try {
        // データベースへ接続
        conn = DBManager.getConnection();

        // SELECT文を準備
        String sql = "SELECT * FROM user WHERE id = ?";

         // SELECTを実行し、結果表を取得
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.setString(1, id);

        ResultSet rs = pStmt.executeQuery();

         // 主キーに紐づくレコードは1件のみなので、rs.next()は1回だけ行う
        if (!rs.next()) {
            return null;
        }

        String syologinId = rs.getString("login_id");
        String syonameData = rs.getString("name");
        Date syobirthDate = rs.getDate("birth_date");
        String syocreateDate = rs.getString("create_date");
        String syoupdateDate = rs.getString("update_date");
        return new User(syologinId, syonameData,syobirthDate,syocreateDate,syoupdateDate);


    } catch (SQLException e) {
        e.printStackTrace();
        return null;
    } finally {
        // データベース切断
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}




//////////更新画面のコード////////////
/**
* ログインIDに紐づくユーザ情報を返す
* @param loginId
* @return
*/

//更新画面でのデータベースから情報を取得する場合//
public User findByUpInfo(String id) {
  Connection conn = null;
  try {
      // データベースへ接続
      conn = DBManager.getConnection();

      // SELECT文を準備
      String sql = "SELECT * FROM user WHERE id = ?";

       // SELECTを実行し、結果表を取得
      PreparedStatement pStmt = conn.prepareStatement(sql);
      pStmt.setString(1, id);

      ResultSet rs = pStmt.executeQuery();

       // 主キーに紐づくレコードは1件のみなので、rs.next()は1回だけ行う
      if (!rs.next()) {
          return null;
      }

      String kouloginId = rs.getString("login_id");
      String kounameData = rs.getString("name");
      Date koubirthDate = rs.getDate("birth_date");

      return new User(kouloginId, kounameData, koubirthDate);

  } catch (SQLException e) {
      e.printStackTrace();
      return null;
  } finally {
      // データベース切断
      if (conn != null) {
          try {
              conn.close();
          } catch (SQLException e) {
              e.printStackTrace();
              return null;
          }
      }
  }
}

//更新画面でのデータベースへ情報を登録する場合//
/**
 * ログインIDに紐づくユーザ情報を返す
 * @param loginId
 * @return
 * @throws SQLException
 */
public void UpDateInfo(String loginId,String password,String password2,String name,String birthDate) throws SQLException {
    Connection conn = null;
    try {
        // データベースへ接続
        conn = DBManager.getConnection();

        // INSERT文を準備
        String sql = "UPDATE user(password,name,birth_date,create_date,update_date)VALUES(?,?,?,now(),now())";

         // INSERTを実行し、結果表を取得
        PreparedStatement pStmt = conn.prepareStatement(sql);

        pStmt.setString(1, loginId);
        pStmt.setString(2, password);
        pStmt.setString(3, name);
        pStmt.setString(4, birthDate);

        int rs = pStmt.executeUpdate();


    } catch (SQLException e) {
        e.printStackTrace();
        throw e;

    } finally {
        // データベース切断
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();

            }
        }
    }
}



//削除画面のコード//
/**
* ログインIDに紐づくユーザ情報を返す
* @param loginId
* @return
*/
public User findByDelInfo(String id) {
Connection conn = null;
try {
    // データベースへ接続
    conn = DBManager.getConnection();

    // SELECT文を準備
    String sql = "SELECT * FROM user WHERE id = ?";

     // SELECTを実行し、結果表を取得
    PreparedStatement pStmt = conn.prepareStatement(sql);
    pStmt.setString(1, id);

    ResultSet rs = pStmt.executeQuery();

     // 主キーに紐づくレコードは1件のみなので、rs.next()は1回だけ行う
    if (!rs.next()) {
        return null;
    }

    String delloginId = rs.getString("login_id");


    return new User(delloginId);

} catch (SQLException e) {
    e.printStackTrace();
    return null;
} finally {
    // データベース切断
    if (conn != null) {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
}


//ここまで//

}

