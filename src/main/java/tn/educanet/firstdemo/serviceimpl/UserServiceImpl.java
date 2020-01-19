package tn.educanet.firstdemo.serviceimpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import tn.educanet.firstdemo.dao.UserDao;
import tn.educanet.firstdemo.persistence.User;
import tn.educanet.firstdemo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	UserDao userDao;

	@Override
	public User getUser(String barreCode) {
		
		User user = new User();
		user = userDao.findByBarreCode(barreCode);

		return user;
	}

}
