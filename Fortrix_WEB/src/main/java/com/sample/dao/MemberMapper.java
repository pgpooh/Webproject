package com.sample.dao;

import com.sample.vo.MemberVO;

public interface MemberMapper {
 public int signup(MemberVO vo);
 public MemberVO login(MemberVO vo);
 public int checkid(String userid);
}
