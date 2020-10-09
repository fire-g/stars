package edu.wf.service;

import edu.wf.dao.UserRepository;
import edu.wf.model.User;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository){
        this.repository= repository;
    }

    @Override
    public boolean register(User user) {
        User u = repository.findByEmail(user.getEmail());
        if (u!=null){
            return false;
        }
        user.setSalt(UUID.randomUUID().toString());
        user.setPassword(DigestUtils.md5DigestAsHex((user.getPassword()+user.getSalt()).getBytes()));
        repository.save(user);
        return true;
    }

    @Override
    public User login(User user) {
        User u=repository.findByEmail(user.getEmail());
        if (u==null){
            return null;
        }
        if (u.getPassword().equals(DigestUtils.md5DigestAsHex((user.getPassword()+u.getSalt()).getBytes()))){
            return u;
        }
        return null;
    }
}