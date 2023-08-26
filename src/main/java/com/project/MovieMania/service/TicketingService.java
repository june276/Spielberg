package com.project.MovieMania.service;

import com.project.MovieMania.domain.TicketInfo;

import java.util.List;

public interface TicketingService {

    TicketInfo writeTicket(Long showInfoId,Long userId,Long priceId);

    List<TicketInfo> findTicket(Long showInfoId, Long userId);
}