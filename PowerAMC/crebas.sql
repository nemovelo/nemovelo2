/*==============================================================*/
/* Nom de SGBD :  MySQL 5.0                                     */
/* Date de création :  11/05/2013 15:32:38                      */
/*==============================================================*/
use nemovelo;

drop table if exists AgentMaintenance;

-- drop index IDX_REPARATION on Reparation;

drop table if exists Reparation;

drop table if exists Station;

-- drop index IDX_STATIONNEMENT on Stationnement;

drop table if exists Stationnement;

drop table if exists Velo;

/*==============================================================*/
/* Table : AgentMaintenance                                     */
/*==============================================================*/
create table AgentMaintenance
(
   idAgent              int not null auto_increment,
   nom                  varchar(254),
   prenom               varchar(254),
   dateDeNaissance      datetime,
   lieuDeNaissance      varchar(254),
   primary key (idAgent)
);

/*==============================================================*/
/* Table : Reparation                                           */
/*==============================================================*/
create table Reparation
(
   idAgent              int not null,
   idVelo               int not null,
   DateDeReparation     datetime,
   primary key (idAgent, idVelo)
);

/*==============================================================*/
/* Index : IDX_REPARATION                                       */
/*==============================================================*/
create unique index IDX_REPARATION on Reparation
(
   idAgent,
   idVelo
);

/*==============================================================*/
/* Table : Station                                              */
/*==============================================================*/
create table Station
(
   IdStation            int not null auto_increment,
   intitule             varchar(254),
   nbMaxVelo            int,
   coordX               int,
   coordY               int,
   primary key (IdStation)
);

/*==============================================================*/
/* Table : Stationnement                                        */
/*==============================================================*/
create table Stationnement
(
   idVelo               int not null,
   idStation            int not null,
   DateDeDebut          datetime,
   DateDeFin            datetime,
   primary key (idVelo, idStation)
);

/*==============================================================*/
/* Index : IDX_STATIONNEMENT                                    */
/*==============================================================*/
create unique index IDX_STATIONNEMENT on Stationnement
(
   idVelo,
   idStation
);

/*==============================================================*/
/* Table : Velo                                                 */
/*==============================================================*/
create table Velo
(
   idVelo               int not null auto_increment,
   estFonctionnel       bool,
   dateAchat            datetime,
   primary key (idVelo)
);

alter table Reparation add constraint FK_REPARATION_AGENTMAINTENANCE foreign key (idAgent)
      references AgentMaintenance (idAgent) on delete restrict on update restrict;

alter table Reparation add constraint FK_REPARATION_VELO foreign key (idVelo)
      references Velo (idVelo) on delete restrict on update restrict;

alter table Stationnement add constraint FK_STATIONNEMENT_STATION foreign key (idStation)
      references Station (IdStation) on delete restrict on update restrict;

alter table Stationnement add constraint FK_STATIONNEMENT_VELO foreign key (idVelo)
      references Velo (idVelo) on delete restrict on update restrict;

