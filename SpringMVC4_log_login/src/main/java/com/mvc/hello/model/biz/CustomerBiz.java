package com.mvc.hello.model.biz;

import java.util.List;

import com.mvc.hello.dto.CustomerDto;

public interface CustomerBiz {

	public List<CustomerDto> selectList();
	public CustomerDto selectone(String id);
	public int insert(CustomerDto dto);
	public int update(CustomerDto dto);
	public int delete(String id);
	public CustomerDto login(String id, String pw);
}
