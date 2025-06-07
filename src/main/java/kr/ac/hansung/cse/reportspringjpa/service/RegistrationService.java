package kr.ac.hansung.cse.reportspringjpa.service;

import kr.ac.hansung.cse.reportspringjpa.entity.MyRole;
import kr.ac.hansung.cse.reportspringjpa.entity.MyUser;

import java.util.List;

public interface RegistrationService {
    MyUser createUser(MyUser user, List<MyRole> userRoles);

    boolean checkEmailExists(String email);

    MyRole findByRolename(String rolename);
}