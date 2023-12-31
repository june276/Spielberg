package com.project.MovieMania.service;

import com.project.MovieMania.domain.*;
import com.project.MovieMania.domain.DTO.ReviewDTO;
import org.springframework.ui.Model;

import java.time.LocalDate;
import java.util.List;


public interface UserService {

    // 아이디 정보 가져오기
    User findByUsername(String username);

    boolean isExistUsername(String username);

    boolean isExistEmail(String email);

    boolean isExistPhoneNum(String phoneNum);

    int register(User user);


    // 아이디 찾기
    User findUsernameId(String email, String name, LocalDate birthday);

    // 비밀번호 찾기
    User findPw(String username,String name, String email);

    List<Authority> findAuthorityById(Long id);


    User changePw(Long userId, String password);

    User findByUserId(Long userId);

    User profileUpdate(Long userId,String name,String username,String email,String phoneNum,String password);


    // 회원탈툇 시 비밀번호 확인
    boolean pwCheck(Long userId, String password);

    int delete(Long userId);

    List<ReviewDTO> findReview(Long id);

    List<TicketInfo> findTicketList(Long id);

    List<Question> findQuestionList(Long id);


}
