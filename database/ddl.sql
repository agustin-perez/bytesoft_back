/*
ByteSoft - 2020
DDL - Creación de tablas para backend web
*/

/* Inicio */
	DROP DATABASE IF EXISTS bytesoft_backend;
	CREATE DATABASE IF NOT EXISTS bytesoft_backend;
    USE bytesoft_backend;
    
    /* Creación de tablas */
    CREATE TABLE component (
        routerPage VARCHAR(16) NOT NULL,
        pageTitle VARCHAR (32),
        favicon MEDIUMBLOB,
        pageInfo JSON,
        bajalogica BOOLEAN NOT NULL DEFAULT FALSE,
        PRIMARY KEY (routerPage),
    ) ENGINE = InnoDB DEFAULT CHARSET = UTF8; 

    CREATE TABLE subComponent (
        subComponentID INT AUTO_INCREMENT,
        routerPage VARCHAR(16) NOT NULL,
        componentInfo JSON,
        bajalogica BOOLEAN NOT NULL DEFAULT FALSE,
        PRIMARY KEY (id, routerPage),
        CONSTRAINT fk_subComponent_component FOREIGN KEY (routerPage) REFERENCES component (routerPage)
    ) ENGINE = InnoDB DEFAULT CHARSET = UTF8; 

    CREATE TABLE componentImage (
        componentImageID INT AUTO_INCREMENT,
        image MEDIUMBLOB
        PRIMARY KEY (componentImageID)
        CONSTRAINT fk_componentImage_component FOREIGN KEY (routerPage) REFERENCES subComponent (routerPage)
    ) ENGINE = InnoDB DEFAULT CHARSET = UTF8; 
    /* Fin de tablas */
/* Fin */