package cn.tedu.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.ssm.pojo.User;
import cn.tedu.ssm.service.UserService;

@RestController // RESTFul形式请求+json返回
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	// 查询所有用户信息
	@RequestMapping("/findAll")
	public List<User> findAll() {
		return userService.findAll();
	}

	// 获取某一个用户信息
	// springClound采用RESTFul，SpringBoot它@PathVariable必须写后面变量@PathVariable("id")
	@RequestMapping("/get/{id}")
	public User get(@PathVariable("id") Integer id) {
		return userService.get(id);
	}

	// 插入一个用户信息
	@RequestMapping("/insert/{name}/{birthday}/{address}")
	public String insert(User user) {
		try {
			userService.insert(user);
			return "insert success";
		} catch (Exception e) {
			return "insert error";
		}
	}

	// 更新用户信息
	@RequestMapping("/update/{name}/{birthday}/{address}/{id}")
	public String update(User user) {
		try {
			userService.update(user);
			return "update success";
		} catch (Exception e) {
			return "update error";
		}
	}

	// 删除用户信息
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		try {
			userService.delete(id);
			return "delete success";
		} catch (Exception e) {
			return "delete error";
		}
	}

}
