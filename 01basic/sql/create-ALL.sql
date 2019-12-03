CREATE TABLE Unit (
    unit_id VARCHAR(20) PRIMARY KEY,
    unit_name NVARCHAR(40) NOT NULL
);
DESCRIBE Unit;

CREATE TABLE Manager (
    manager_id VARCHAR(20) PRIMARY KEY,
    manager_name NVARCHAR(10) NOT NULL,
    manager_password VARCHAR(30) NOT NULL,
    unit_id VARCHAR(20) NOT NULL,
    manager_phone VARCHAR(13),
    FOREIGN KEY(unit_id) REFERENCES unit(unit_id) ON DELETE CASCADE ON UPDATE CASCADE
);
DESCRIBE Manager;

CREATE TABLE User (
    user_id VARCHAR(20) PRIMARY KEY,
    user_name NVARCHAR(10) NOT NULL,
    user_password VARCHAR(30) NOT NULL,
    unit_id VARCHAR(20) NOT NULL,
    user_phone VARCHAR(13),
    user_idcard CHAR(18) NOT NULL,
    activist_date DATE,
    candidate_date DATE,
    is_prepared_member BOOLEAN,
    lecture_score TINYINT,
    FOREIGN KEY(unit_id) REFERENCES unit(unit_id) ON DELETE CASCADE ON UPDATE CASCADE
);
DESCRIBE User;
