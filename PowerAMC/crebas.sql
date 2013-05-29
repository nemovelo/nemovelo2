/*==============================================================*/
/* Nom de SGBD :  MySQL 5.0                                     */
/* Date de cr�ation :  29/05/2013 16:32:03                      */
/*==============================================================*/

/*
drop table if exists AgentMaintenance;

drop table if exists Client;

drop index IDX_LOCATION on Location;

drop table if exists Location;

drop index IDX_REPARATION on Reparation;

drop table if exists Reparation;

drop table if exists Station;

drop index IDX_STATIONNEMENT on Stationnement;

drop table if exists Stationnement;

drop table if exists Velo;

/*==============================================================*/
/* Table : AgentMaintenance                                     */
/*==============================================================*/
create table AgentMaintenance
(
   idAgent              int not null auto_increment comment 'Identifiant de l''agent de maintenance',
   nom                  varchar(40) not null comment 'Nom de l''agent de maintenance',
   prenom               varchar(40) not null comment 'Prenom de l''agent de maintenance',
   dateDeNaissance      datetime not null comment 'Date de naissance de l''agent de maintenance',
   lieuDeNaissance      varchar(150) not null comment 'Lieu de naissance de l''agent de maintenance',
   primary key (idAgent)
);

alter table AgentMaintenance comment 'Objet d�finissant les agents de maintenance';

/*==============================================================*/
/* Table : Client                                               */
/*==============================================================*/
create table Client
(
   idClient             int not null auto_increment comment 'Identifiant du client',
   nom                  varchar(40) not null comment 'Nom du client',
   prenom               varchar(40) not null comment 'Pr�nom du client',
   dateDeNaissance      datetime not null comment 'Date de naissance du client',
   lieuDeNaissance      varchar(150) not null comment 'Lieu de naissance du client',
   primary key (idClient)
);

alter table Client comment 'Objet d�finissant les cliens';

/*==============================================================*/
/* Table : Location                                             */
/*==============================================================*/
create table Location
(
   idStationDebut       int not null comment 'Identifiant de la station de d�part',
   idStationFin         int not null comment 'Identifiant de la station d''arriv�e',
   idClient             int not null comment 'Identifiant du client',
   idVelo               int not null comment 'Identifiant du v�lo',
   dateDeDebut          datetime not null,
   dateDeFin            datetime,
   primary key (idStationDebut, idClient, idVelo, idStationFin)
);

/*==============================================================*/
/* Index : IDX_LOCATION                                         */
/*==============================================================*/
create index IDX_LOCATION on Location
(
   idStationDebut,
   idClient,
   idVelo,
   idStationFin
);

/*==============================================================*/
/* Table : Reparation                                           */
/*==============================================================*/
create table Reparation
(
   idAgent              int not null comment 'Identifiant de l''agent de maintenance',
   idVelo               int not null comment 'Identifiant du v�lo',
   DateDeReparation     datetime not null,
   primary key (idAgent, idVelo)
);

/*==============================================================*/
/* Index : IDX_REPARATION                                       */
/*==============================================================*/
create index IDX_REPARATION on Reparation
(
   idVelo,
   idAgent
);

/*==============================================================*/
/* Table : Station                                              */
/*==============================================================*/
create table Station
(
   idStation            int not null auto_increment comment 'Identifiant de la station',
   intitule             varchar(150) not null comment 'Intitul� de la station',
   nbMaxVelo            int not null comment 'Nombre max de v�los que peut accueillir la station',
   coordX               int not null comment 'Coordonn�es X de la station',
   coordY               int not null comment 'Coordonn�es Y de la station',
   primary key (idStation)
);

alter table Station comment 'Objet d�finissant les stations';

/*==============================================================*/
/* Table : Stationnement                                        */
/*==============================================================*/
create table Stationnement
(
   idStation            int not null comment 'Identifiant de la station',
   idVelo               int not null comment 'Identifiant du v�lo',
   DateDeDebut          datetime not null,
   DateDeFin            datetime,
   primary key (idStation, idVelo)
);

/*==============================================================*/
/* Index : IDX_STATIONNEMENT                                    */
/*==============================================================*/
create index IDX_STATIONNEMENT on Stationnement
(
   idStation,
   idVelo
);

/*==============================================================*/
/* Table : Velo                                                 */
/*==============================================================*/
create table Velo
(
   idVelo               int not null auto_increment comment 'Identifiant du v�lo',
   estFonctionnel       bool comment 'Bool�en le v�lo est fonctionnel',
   dateAchat            datetime comment 'Date d''achat du v�lo',
   primary key (idVelo)
);

alter table Velo comment 'Objet d�finissant les v�los';

alter table Location add constraint FK_LOUE_CLIENT foreign key (idClient)
      references Client (idClient) on delete restrict on update restrict;

alter table Location add constraint FK_LOUE_STATION_DEBUT foreign key (idStationDebut)
      references Station (idStation) on delete restrict on update restrict;

alter table Location add constraint FK_LOUE_VELO foreign key (idVelo)
      references Velo (idVelo) on delete restrict on update restrict;

alter table Location add constraint FK_LOUE_STATION_FIN foreign key (idStationFin)
      references Station (idStation) on delete restrict on update restrict;

alter table Reparation add constraint FK_REPARATION_AGENTMAINTENANCE foreign key (idAgent)
      references AgentMaintenance (idAgent) on delete restrict on update restrict;

alter table Reparation add constraint FK_REPARATION_VELO foreign key (idVelo)
      references Velo (idVelo) on delete restrict on update restrict;

alter table Stationnement add constraint FK_STATIONNEMENT_STATION foreign key (idStation)
      references Station (idStation) on delete restrict on update restrict;

alter table Stationnement add constraint FK_STATIONNEMENT_VELO foreign key (idVelo)
      references Velo (idVelo) on delete restrict on update restrict;

