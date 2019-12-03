INSERT INTO Unit(unit_id, unit_name) VALUES
('USC', 'University of South Califonia'),
('EXO', 'EEEEEXO'),
('UCI', 'University of Califonia, Irvine'),
('NYU', '太贵了去不起大学');

INSERT INTO Manager(manager_id, manager_name, manager_password, unit_id, manager_phone) VALUES
('xb', '小宝', '123456789', 'NYU', '1811811811811'),
('tiger', '大猫儿', '987654321', 'EXO', '1341341341341'),
('doggy', '大狗子', '99999999', 'EXO', '1371371371371'),
('hi', '你好', '66666666', 'USC', NULL);

SELECT * FROM Manager;

INSERT INTO User(user_id, user_name, user_password, unit_id, user_phone, user_idcard, activist_date, candidate_date, 
is_prepared_member, lecture_score) VALUES
('Chanyeol', '灿烈', '88888888', 'EXO', '1731731731731', '442106198711102222', '2019-10-10', '2019-10-25', NULL, 98),
('Baekhyun', '伯贤', '88888888', 'EXO', '1011011011011', '443106198711103333', NULL, '2006-04-02', TRUE, 90),
('Shenun', '世勋', '88888888', 'EXO', NULL, '443106198711104444', '2009-05-06', '2020-01-20', FALSE, 99),
('eval', '仰度', '87878787', 'NYU', '4242424242424', '443106198711105555', NULL, NULL, TRUE, 95),
('The Lord', '安定侯', '54545454', 'USC', '5205205205205', '443106198711106666', '2010-10-20', '2010-11-11', TRUE, 92);