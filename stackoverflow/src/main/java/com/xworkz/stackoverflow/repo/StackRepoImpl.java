package com.xworkz.stackoverflow.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.stackoverflow.dto.StackDTO;
import com.xworkz.stackoverflow.utils.JdbcUtil;

public class StackRepoImpl implements StackRepoInter {

	@Override
	public boolean onSave(StackDTO dto) throws SQLException {
		System.out.println("Invoked onSave method");
		Connection con = JdbcUtil.getConnection();
		String insQuery = "INSERT INTO stackoverflow(name, email, phone_no, address, followers, no_of_ques_ans, no_of_ques_ask, badges, skill, member_since) VALUES(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(insQuery);
		ps.setString(1, dto.getName());
		ps.setString(2, dto.getEmail());
		ps.setLong(3, dto.getPhoneNo());
		ps.setString(4, dto.getAddress());
		ps.setInt(5, dto.getFollowers());
		ps.setInt(6, dto.getNoOfQuesAnswered());
		ps.setInt(7, dto.getNoOfQuesAsked());
		ps.setString(8, dto.getBadges());
		ps.setString(9, dto.getSkills());
		ps.setString(10, dto.getMemberSince());
		int rowInserted = ps.executeUpdate();
		if (rowInserted > 0) {
			System.out.println("Saved!");
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<StackDTO> getAllDetails() throws SQLException {
		System.out.println("Invoked getAllDetails method");
		List<StackDTO> dtos = new ArrayList<>();
		Connection con = JdbcUtil.getConnection();
		String selQuery = "SELECT * FROM stackoverflow";
		PreparedStatement ps = con.prepareStatement(selQuery);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			StackDTO dto = new StackDTO();
			dto.setId(rs.getInt(1));
			dto.setName(rs.getString(2));
			dto.setEmail(rs.getString(3));
			dto.setPhoneNo(rs.getLong(4));
			dto.setAddress(rs.getString(5));
			dto.setFollowers(rs.getInt(6));
			dto.setNoOfQuesAnswered(rs.getInt(7));
			dto.setNoOfQuesAsked(rs.getInt(8));
			dto.setBadges(rs.getString(9));
			dto.setSkills(rs.getString(10));
			dto.setMemberSince(rs.getString(11));
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	public StackDTO getById(int id) throws SQLException {
		System.out.println("Invoked getById method");
		StackDTO dto = null;
		Connection con = JdbcUtil.getConnection();
		String selQuery = "SELECT * FROM stackoverflow WHERE id=?";
		PreparedStatement ps = con.prepareStatement(selQuery);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			dto = new StackDTO();
			dto.setId(rs.getInt(1));
			dto.setName(rs.getString(2));
			dto.setEmail(rs.getString(3));
			dto.setPhoneNo(rs.getLong(4));
			dto.setAddress(rs.getString(5));
			dto.setFollowers(rs.getInt(6));
			dto.setNoOfQuesAnswered(rs.getInt(7));
			dto.setNoOfQuesAsked(rs.getInt(8));
			dto.setBadges(rs.getString(9));
			dto.setSkills(rs.getString(10));
			dto.setMemberSince(rs.getString(11));
		}
		return dto;
	}

	@Override
	public boolean onUpdate(StackDTO dto) throws SQLException {
		System.out.println("Invoked onUpdate method");
		Connection con = JdbcUtil.getConnection();
		String updQuery = "UPDATE stackoverflow	SET name=?, email=?, phone_no=?, address=?, followers=?, no_of_ques_ans=?, no_of_ques_ask=?, badges=?, skill=?, member_since=? WHERE id=?";
		PreparedStatement ps = con.prepareStatement(updQuery);
		ps.setString(1, dto.getName());
		ps.setString(2, dto.getEmail());
		ps.setLong(3, dto.getPhoneNo());
		ps.setString(4, dto.getAddress());
		ps.setInt(5, dto.getFollowers());
		ps.setInt(6, dto.getNoOfQuesAnswered());
		ps.setInt(7, dto.getNoOfQuesAsked());
		ps.setString(8, dto.getBadges());
		ps.setString(9, dto.getSkills());
		ps.setString(10, dto.getMemberSince());
		ps.setInt(11, dto.getId());
		int rowUpdated = ps.executeUpdate();
		if (rowUpdated > 0) {
			System.out.println("Updated!");
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean onDelete(int id) throws SQLException {
		System.out.println("Invoked onUpdate method");
		Connection con = JdbcUtil.getConnection();
		String delQuery = "DELETE FROM stackoverflow WHERE id=?";
		PreparedStatement ps = con.prepareStatement(delQuery);
		ps.setInt(1, id);
		int rowDeleted = ps.executeUpdate();
		if (rowDeleted > 0) {
			System.out.println("Deleted!");
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<StackDTO> search(String s) throws SQLException {
		System.out.println("Invoked search method");
		List<StackDTO> dtos = new ArrayList<>();
		Connection con = JdbcUtil.getConnection();
		String selQuery = "SELECT * FROM stackoverflow WHERE name=?";
		PreparedStatement ps = con.prepareStatement(selQuery);
		ps.setString(1, s);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			StackDTO dto = new StackDTO();
			dto.setId(rs.getInt(1));
			dto.setName(rs.getString(2));
			dto.setEmail(rs.getString(3));
			dto.setPhoneNo(rs.getLong(4));
			dto.setAddress(rs.getString(5));
			dto.setFollowers(rs.getInt(6));
			dto.setNoOfQuesAnswered(rs.getInt(7));
			dto.setNoOfQuesAsked(rs.getInt(8));
			dto.setBadges(rs.getString(9));
			dto.setSkills(rs.getString(10));
			dto.setMemberSince(rs.getString(11));
			dtos.add(dto);
		}
		return dtos;
	}
}
