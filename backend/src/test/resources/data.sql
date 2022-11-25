--AUTHORITIES
INSERT INTO authority(id, name)
VALUES ('2ebf301e-6c61-4076-98e3-2a38b31daf86', 'USER_TEST')
ON CONFLICT DO NOTHING;

--ROLES
INSERT INTO role(id, name)
VALUES ('d29e709c-0ff1-4f4c-a7ef-09f656c390f1', 'USER'),
       ('08c71152-c552-42e7-b094-f510ff44e9cb', 'ADMIN')
ON CONFLICT DO NOTHING;

--assign authorities to roles
INSERT INTO role_authority(role_id, authority_id)
VALUES ('d29e709c-0ff1-4f4c-a7ef-09f656c390f1', '2ebf301e-6c61-4076-98e3-2a38b31daf86'),
       ('08c71152-c552-42e7-b094-f510ff44e9cb', '2ebf301e-6c61-4076-98e3-2a38b31daf86')
ON CONFLICT DO NOTHING;

--USERS
insert into users (id, email,first_name,last_name, password)
values ('ba804cb9-fa14-42a5-afaf-be488742fc54', 'admin@gmail.com', 'James','Bond', '$2a$10$udYPPCXr78OCs9RwZyW/VO5flVhwhkByVEN4U9gPRQSNdIQlR5qT6' ),
       ('0d8fa44c-54fd-4cd0-ace9-2a7da57992de', 'user@gmail.com', 'Tyler','Durden', '$2a$10$udYPPCXr78OCs9RwZyW/VO5flVhwhkByVEN4U9gPRQSNdIQlR5qT6')
ON CONFLICT DO NOTHING;

--assign roles to users
insert into users_role (users_id, role_id)
values ('ba804cb9-fa14-42a5-afaf-be488742fc54', '08c71152-c552-42e7-b094-f510ff44e9cb'),
       ('0d8fa44c-54fd-4cd0-ace9-2a7da57992de', 'd29e709c-0ff1-4f4c-a7ef-09f656c390f1')
ON CONFLICT DO NOTHING;


--MY_LIST_ENTRIES
INSERT INTO my_list_entry(id, entry_date, entry_priority, entry_text, entry_title, user_id)
VALUES ('af7c1fe6-d669-414e-b066-e9733f0de7a8', '1922-02-02', 'HIGH', 'The test list entry I made', 'Testing :)', '0d8fa44c-54fd-4cd0-ace9-2a7da57992de')
ON CONFLICT DO NOTHING;