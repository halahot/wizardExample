-- begin WIZARD_OWN_DOCUMENT
alter table WIZARD_OWN_DOCUMENT add constraint FK_WIZARD_OWN_DOCUMENT_ON_OWN foreign key (OWN_ID) references WIZARD_OWN(ID)^
create index IDX_WIZARD_OWN_DOCUMENT_ON_OWN on WIZARD_OWN_DOCUMENT (OWN_ID)^
-- end WIZARD_OWN_DOCUMENT
