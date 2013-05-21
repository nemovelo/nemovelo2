/*==============================================================*/
/* Nom de SGBD :  MySQL 5.0                                     */
/* Date de création :  21/05/2013 11:58:46                      */
/*==============================================================*/

/*
drop table if exists AgentMaintenance;

drop table if exists Client;

drop index IDX_LOUE on LOUE;

drop table if exists LOUE;

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
   nom                  varchar(254) comment 'Nom de l''agent de maintenance',
   prenom               varchar(254) comment 'Prenom de l''agent de maintenance',
   dateDeNaissance      datetime comment 'Date de naissance de l''agent de maintenance',
   lieuDeNaissance      varchar(254) comment 'Lieu de naissance de l''agent de maintenance',
   primary key (idAgent)
);

alter table AgentMaintenance comment 'Objet définissant les agents de maintenance';

/*==============================================================*/
/* Table : Client                                               */
/*==============================================================*/
create table Client
(
   idClient             int not null auto_increment comment 'Identifiant du client',
   nom                  varchar(254) comment 'Nom du client',
   prenom               varchar(254) comment 'Prénom du client',
   dateDeNaissance      datetime comment 'Date de naissance du client',
   lieuDeNaissance      varchar(254) comment 'Lieu de naissance du client',
   primary key (idClient)
);

alter table Client comment 'Objet définissant les cliens';

/*==============================================================*/
/* Table : LOUE                                                 */
/*==============================================================*/
create table LOUE
(
   idStation            int not null comment 'Identifiant de la station',
   idClient             int not null comment 'Identifiant du client',
   idVelo               int not null comment 'Identifiant du vélo',
   dateDeDebut          datetime not null,
   dateDeFin            datetime,
   primary key (idStation, idClient, idVelo)
);

/*==============================================================*/
/* Index : IDX_LOUE                                             */
/*==============================================================*/
create index IDX_LOUE on LOUE
(
   idStation,
   idClient,
   idVelo
);

/*==============================================================*/
/* Table : Reparation                                           */
/*==============================================================*/
create table Reparation
(
   idAgent              int not null comment 'Identifiant de l''agent de maintenance',
   idVelo               int not null comment 'Identifiant du vélo',
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
   intitule             varchar(254) comment 'Intitulé de la station',
   nbMaxVelo            int comment 'Nombre max de vélos que peut accueillir la station',
   coordX               int comment 'Coordonnées X de la station',
   coordY               int comment 'Coordonnées Y de la station',
   primary key (idStation)
);

alter table Station comment 'Objet définissant les stations';

/*==============================================================*/
/* Table : Stationnement                                        */
/*==============================================================*/
create table Stationnement
(
   idStation            int not null comment 'Identifiant de la station',
   idVelo               int not null comment 'Identifiant du vélo',
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
   idVelo               int not null auto_increment comment 'Identifiant du vélo',
   estFonctionnel       bool comment 'Booléen le vélo est fonctionnel',
   dateAchat            datetime comment 'Date d''achat du vélo',
   primary key (idVelo)
);

alter table Velo comment 'Objet définissant les vélos';

alter table LOUE add constraint FK_LOUE_CLIENT foreign key (idClient)
      references Client (idClient) on delete restrict on update restrict;

alter table LOUE add constraint FK_LOUE_STATION foreign key (idStation)
      references Station (idStation) on delete restrict on update restrict;

alter table LOUE add constraint FK_LOUE_VELO foreign key (idVelo)
      references Velo (idVelo) on delete restrict on update restrict;

alter table Reparation add constraint FK_REPARATION_AGENTMAINTENANCE foreign key (idAgent)
      references AgentMaintenance (idAgent) on delete restrict on update restrict;

alter table Reparation add constraint FK_REPARATION_VELO foreign key (idVelo)
      references Velo (idVelo) on delete restrict on update restrict;

alter table Stationnement add constraint FK_STATIONNEMENT_STATION foreign key (idStation)
      references Station (idStation) on delete restrict on update restrict;

alter table Stationnement add constraint FK_STATIONNEMENT_VELO foreign key (idVelo)
      references Velo (idVelo) on delete restrict on update restrict;

