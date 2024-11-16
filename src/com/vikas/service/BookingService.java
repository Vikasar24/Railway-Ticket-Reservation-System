package com.vikas.service;

import java.util.List;

import com.vikas.beans.HistoryBean;
import com.vikas.beans.TrainException;

public interface BookingService {

	public List<HistoryBean> getAllBookingsByCustomerId(String customerEmailId) throws TrainException;

	public HistoryBean createHistory(HistoryBean bookingDetails) throws TrainException;

}
