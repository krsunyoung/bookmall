package com.bit2015.bookmall.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bit2016.bookmall.vo.CartVo;
import com.bit2016.bookmall.vo.OrdergoVo;

public class CartDao {
	private Connection getConnection() throws SQLException{ //코드 중복으로 계속 사용해서 만들어줌. 수정일 경우에 다 하나씩 고쳐야 하므로 이것을 만들어서 한번에 수정.
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";	
			conn = DriverManager.getConnection(url,"bitdb","bitdb");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 :"+e);
		} 
		return conn;
	}
	public boolean update(CartVo vo){
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result= 0;
		try{
			conn = getConnection();
			String sql ="update ordergo set address = ? where no=?";
			pstmt = conn.prepareStatement(sql);
			
			
			pstmt.setString(1, vo.getAddress());
			pstmt.setLong(2, vo.getNo());
			
			result = pstmt.executeUpdate();
			
		}catch(SQLException e){
			System.out.println("error : "+e);
		}finally {
			try{
				if(pstmt != null){
					pstmt.close();
				}
				if(conn != null){
					conn.close();
				}
			}catch(SQLException e){
				System.out.println("error : "+e);
				
			}
		}
		return result == 1;
	}
	
	public boolean delete(Long no){
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result= 0;
		try{
			conn = getConnection();
			String sql ="delete from cart where no = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setLong(1, no);
			
			result = pstmt.executeUpdate();
			
		}catch(SQLException e){
			System.out.println("error : "+e);
		}finally {
			try{
				if(pstmt != null){
					pstmt.close();
				}
				if(conn != null){
					conn.close();
				}
			}catch(SQLException e){
				System.out.println("error : "+e);
				
			}
		}
		return result == 1;
	}
//	public void delete(String name ){
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		try{
//			conn = getConnection();
//			String sql ="delete from book where title = ? ";
//			pstmt = conn.prepareStatement(sql);
//			
//			pstmt.setString(1, title );
//			
//			result = pstmt.executeUpdate();
//			
//		}catch(SQLException e){
//			System.out.println("error : "+e);
//		}finally {
//			try{
//				if(pstmt != null){
//					pstmt.close();
//				}
//				if(conn != null){
//					conn.close();
//				}
//			}catch(SQLException e){
//				System.out.println("error : "+e);
//				
//			}
//		}
//	}
	public List<CartVo> getList(){
		List<CartVo> list = new ArrayList<CartVo>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			conn = getConnection();
			stmt = conn.createStatement();
			
			String sql = "select book_no, customer_no, count from cart ";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				int book_no = rs.getInt(1);
				int customer_no = rs.getInt(2);
				int count = rs.getInt(3);
				
				CartVo vo = new CartVo();
				vo.setBook_no(book_no);
				vo.setCustomer_no(customer_no);
				vo.setCount(count);
				
				list.add(vo);
			}
			
		}catch(SQLException e){
			System.out.println("error :"+e);
		}finally{
			try{
				if(rs != null){
					rs.close();
				}
				if(stmt != null){
					stmt.close();
				}
				if(conn != null){
					conn.close();
				}
			}catch(SQLException ex){
				System.out.println("error:"+ex);
			}
		}
		
		return list;
	}
//	public void insert(String name){
//		
//	}
	public void insert(OrdergoVo vo){
	
			
			Connection conn =null;
			PreparedStatement pstmt = null;

			try {
				 conn = getConnection();

				 //3.statement 생성
				 String sql = 
				"insert into cart Values(?,?,?)";
				 pstmt = conn.prepareStatement(sql);
				 
				 //4.바인딩
				 pstmt.setInt(1, vo.getPrice());
				 pstmt.setString(2, vo.getAddress());
				 
				 int count = pstmt.executeUpdate();
				 System.out.println( count );
				 
			}  catch (SQLException e ){
				System.out.println("error" +e);;
				
			} finally{
				try {
					//3 자원정리
				
					if(pstmt != null ){
						pstmt.close();}
					if(conn != null ){
					conn.close();}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	}
}