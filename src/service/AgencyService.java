package service;

import models.Agency;

public interface AgencyService {
        String addAgency (Agency agency);
        Agency getAgencyById(long id);
        Agency[] getAllAgency();
        String updateAgencyById(long id, Agency newAgency);
        String deleteAgencyById(long id);

}
