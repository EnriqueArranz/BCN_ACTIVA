

CREATE DATABASE IF NOT EXISTS pizzeria;
USE pizzeria;

CREATE TABLE Províncies (
    id_província INT PRIMARY KEY,
    nom_província VARCHAR(255) NOT NULL
);

CREATE TABLE Localitats (
    id_localitat INT PRIMARY KEY,
    nom_localitat VARCHAR(255) NOT NULL,
    id_província INT,
    FOREIGN KEY (id_província) REFERENCES Províncies(id_província)
);

CREATE TABLE Clients (
    id_client INT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    cognoms VARCHAR(255) NOT NULL,
    adreça VARCHAR(255) NOT NULL,
    codi_postal VARCHAR(10) NOT NULL,
    id_localitat INT,
    id_província INT,
    número_telèfon VARCHAR(15) NOT NULL,
    FOREIGN KEY (id_localitat) REFERENCES Localitats(id_localitat),
    FOREIGN KEY (id_província) REFERENCES Províncies(id_província)
);

CREATE TABLE Categories (
    id_categoria INT PRIMARY KEY,
    nom_categoria VARCHAR(255) NOT NULL
);

CREATE TABLE Pizzes (
    id_pizza INT PRIMARY KEY,
    id_categoria INT,
    nom VARCHAR(255) NOT NULL,
    descripció TEXT,
    imatge VARCHAR(255),
    preu DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (id_categoria) REFERENCES Categories(id_categoria)
);

CREATE TABLE Productes (
    id_producte INT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    descripció TEXT,
    imatge VARCHAR(255),
    preu DECIMAL(10, 2) NOT NULL
);

CREATE TABLE Botigues (
    id_botiga INT PRIMARY KEY,
    adreça VARCHAR(255) NOT NULL,
    codi_postal VARCHAR(10) NOT NULL,
    id_localitat INT,
    id_província INT,
    FOREIGN KEY (id_localitat) REFERENCES Localitats(id_localitat),
    FOREIGN KEY (id_província) REFERENCES Províncies(id_província)
);

CREATE TABLE Empleats (
    id_empleat INT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    cognoms VARCHAR(255) NOT NULL,
    NIF VARCHAR(20) NOT NULL,
    telèfon VARCHAR(15) NOT NULL,
    tipus_ocupació VARCHAR(20) NOT NULL,
    id_botiga INT,
    FOREIGN KEY (id_botiga) REFERENCES Botigues(id_botiga)
);

CREATE TABLE Comandes (
    id_comanda INT PRIMARY KEY,
    data_hora DATETIME NOT NULL,
    tipus_comanda VARCHAR(20) NOT NULL,
    quantitat_productes_per_tipus VARCHAR(255) NOT NULL,
    preu_total DECIMAL(10, 2) NOT NULL,
    id_client INT,
    id_botiga INT,
    FOREIGN KEY (id_client) REFERENCES Clients(id_client),
    FOREIGN KEY (id_botiga) REFERENCES Botigues(id_botiga)
);

CREATE TABLE Lliuraments (
    id_lliurament INT PRIMARY KEY,
    data_hora_lliurament DATETIME NOT NULL,
    id_repartidor INT,
    id_comanda INT,
    FOREIGN KEY (id_repartidor) REFERENCES Empleats(id_empleat),
    FOREIGN KEY (id_comanda) REFERENCES Comandes(id_comanda)
);