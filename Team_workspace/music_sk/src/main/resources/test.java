import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//장르db연결

public class test {
	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		//드라이버 로드
		//Class.forName함수는 임포트 되어있지않은 외부에 있는 파일을 로딩하는 함수
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
		"jdbc:oracle:thin:@localhost:1521:orcl",
		"scott",
		"tiger"
		);
				
		if(conn == null) {System.out.println("DB접속에 실패");}
		else {System.out.println("DB접속 성공");
		
		//sql문을 작성해서 conn객체를 이용하여 데이터베이스에 데이터 가져오기
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "select * from music_rank";
		stmt = conn.createStatement();
		rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			int rank = rs.getInt("rank");
			String genre = rs.getString("genre");
			String song = rs.getString("song");
			String album = rs.getString("album");
			String album_img_link = rs.getString("album_img_link");
			String video_link = rs.getString("video_link");
			
			System.out.printf("%d %s %s %s %s %s", rank, genre, song, album, album_img_link, video_link);
		}
		rs.close();
		stmt.close();
		conn.close();
		}
	}
}