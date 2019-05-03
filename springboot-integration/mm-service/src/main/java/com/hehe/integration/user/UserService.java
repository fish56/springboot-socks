package com.hehe.integration.user;

import java.util.List;

public interface UserService {

     List<User> list();

     User insertUserByName(String name);
}
