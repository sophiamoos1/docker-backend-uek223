package com.example.demo.domain.utils;
import com.example.demo.domain.authority.Authority;
import com.example.demo.domain.myListEntry.dto.Priority;
import com.example.demo.domain.role.Role;
import com.example.demo.domain.user.User;
import com.example.demo.domain.myListEntry.MyListEntry;

import java.time.LocalDate;
import java.util.*;

public class TestUtility {

    private Authority auth1 = new Authority(UUID.fromString("47cd707b-4346-428c-94c3-82f5e3648d10"), "admin1");
    private Authority auth2 = new Authority(UUID.fromString("47cd707b-4346-428c-94c3-82f5e3648d12"), "admin2");
    private Authority auth3 = new Authority(UUID.fromString("47cd707b-4346-428c-94c3-82f5e3648d13"), "user1");

    private Set<Authority> authSet1 = new HashSet<Authority>() {{
        add(auth1);
        add(auth2);
        add(auth3);
    }};
    private Set<Authority> authSet2 = new HashSet<Authority>() {{
        add(auth3);
    }};

    private Role role1 = new Role(UUID.fromString("47cd707b-4346-428c-94c3-82f5e3648d20"), "admin", authSet1);
    private Role role2 = new Role(UUID.fromString("47cd707b-4346-428c-94c3-82f5e3648d21"), "user", authSet2);

    private Set<Role> roleSet1 = new HashSet<Role>() {{
        add(role1);
    }};
    private Set<Role> roleSet2 = new HashSet<Role>() {{
        add(role2);
    }};
    LocalDate now = LocalDate.now();

    private Priority high = Priority.HIGH;
    private Priority low = Priority.LOW;

    private User user1 = new User(UUID.fromString("47cd707b-4346-428c-94c3-82f5e3648d30"),
            "admin", "test", "admin@gmail.com", "superTest", roleSet1, null);
    private User user2 = new User(UUID.fromString("47cd707b-4346-428c-94c3-82f5e3648d31"),
            "user", "test", "user@gmail.com", "superTest", roleSet2, null);

    private MyListEntry listEntry1 = new MyListEntry(UUID.fromString("47cd707b-4346-428c-94c3-82f5e3648d40"), "test1", "hello test1", now, low, user1);
    private MyListEntry listEntry2 = new MyListEntry(UUID.fromString("47cd707b-4346-428c-94c3-82f5e3648d41"), "test2", "hello test2", now, low, user1);
    private MyListEntry listEntry3 = new MyListEntry(UUID.fromString("47cd707b-4346-428c-94c3-82f5e3648d42"), "test3", "hello test3", now, high, user1);
    private MyListEntry listEntry4 = new MyListEntry(UUID.fromString("47cd707b-4346-428c-94c3-82f5e3648d43"), "test4", "hello test4", now, low, user2);
    private MyListEntry listEntry5 = new MyListEntry(UUID.fromString("47cd707b-4346-428c-94c3-82f5e3648d44"), "test5", "hello test5", now, high, user2);

    public MyListEntry getMyListEntry1() {
        return listEntry1;
    }
    public MyListEntry getMyListEntry2() {
        return listEntry2;
    }
    public MyListEntry getMyListEntry3() {
        return listEntry3;
    }
    public MyListEntry getMyListEntry4() {
        return listEntry4;
    }
    public MyListEntry getMyListEntry5() {
        return listEntry5;
    }
    public User getUser1(){
        return user1;
    }
    public User getUser2(){
        return user2;
    }
}
