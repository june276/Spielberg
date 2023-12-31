package com.project.MovieMania.repository;

import com.project.MovieMania.domain.ShowInfo;
import com.project.MovieMania.domain.Movie;
import com.project.MovieMania.domain.ShowInfo;
import com.project.MovieMania.domain.TicketInfo;
import com.project.MovieMania.domain.User;
import com.project.MovieMania.domain.type.Gender;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface TicketInfoRepository extends JpaRepository<TicketInfo, Long> {
    List<TicketInfo> findByUserAndShowInfo(User user, ShowInfo showInfo);

    List<TicketInfo> findByTicketCode(String ticketCode);

    List<TicketInfo> findByShowInfo(ShowInfo showInfo);

    List<TicketInfo> findByShowInfoIn(List<ShowInfo> showInfoList);

    List<TicketInfo> findByShowInfoInAndUser_Gender(List<ShowInfo> upcomingMovie, Gender gender);

    List<TicketInfo> findByShowInfoInAndUser_BirthdayBetween(List<ShowInfo> upcomingMovie, LocalDate localDate, LocalDate localDate1);

    List<TicketInfo> findByUser_id(Long id);

//    List<TicketInfo> findByFromRowAndPageRowsAndId(int fromRow,int pageRows,long id);


    // 페이징에서 전체페이지 찾기(long 타입으로)
    long findById(long id);

    Page<TicketInfo> findByUser(User user, PageRequest id);

    List<TicketInfo> findByUser(User user);
}
