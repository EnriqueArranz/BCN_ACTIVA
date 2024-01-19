

CREATE DATABASE IF NOT EXISTS optica;
USE optica;
CREATE TABLE Proveidors (
    id_proveidor INT PRIMARY KEY,
    nom VARCHAR(100),
    adreca_carrer VARCHAR(100),
    adreca_numero INT,
    adreca_pis INT,
    adreca_porta VARCHAR(10),
    adreca_ciutat VARCHAR(50),
    adreca_codipostal VARCHAR(10),
    adreca_pais VARCHAR(50),
    telefon VARCHAR(20),
    fax VARCHAR(20),
    nif VARCHAR(20)
);

-- Crear la tabla de marques d'ulleres
CREATE TABLE MarquesUlleres (
    id_marca INT PRIMARY KEY,
    nom_marca VARCHAR(50)
);

-- Crear la tabla d'ulleres
CREATE TABLE Ulleres (
    id_ulleres INT PRIMARY KEY,
    id_proveidor INT,
    id_marca INT,
    graduacio_vidre VARCHAR(20),
    tipus_muntura VARCHAR(20),
    color_muntura VARCHAR(20),
    color_vidre VARCHAR(20),
    preu DECIMAL(10,2),
    FOREIGN KEY (id_proveidor) REFERENCES Proveidors(id_proveidor),
    FOREIGN KEY (id_marca) REFERENCES MarquesUlleres(id_marca)
);

-- Crear la taula de clients
CREATE TABLE Clients (
    id_client INT PRIMARY KEY,
    nom VARCHAR(100),
    adreca_postal VARCHAR(100),
    telefon VARCHAR(20),
    correu_electronic VARCHAR(50),
    data_registre DATE,
    id_client_recomanador INT,
    FOREIGN KEY (id_client_recomanador) REFERENCES Clients(id_client)
);

-- Crear la taula de venudes
CREATE TABLE Venudes (
    id_venda INT PRIMARY KEY,
    id_ulleres INT,
    id_empleat INT,
    id_client INT,
    data_venda DATE,
    FOREIGN KEY (id_ulleres) REFERENCES Ulleres(id_ulleres),
    FOREIGN KEY (id_empleat) REFERENCES Empleats(id_empleat),
    FOREIGN KEY (id_client) REFERENCES Clients(id_client)
);

-- Crear la taula d'empleats
CREATE TABLE Empleats (
    id_empleat INT PRIMARY KEY,
    nom VARCHAR(100)
);