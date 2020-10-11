package edu.wf.service;

import edu.wf.model.User;

public interface UserService {
    boolean register(User user);
    User login(User user);
    User findUser(String email);
    boolean modifyPassword(User user);
}
