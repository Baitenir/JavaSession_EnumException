package service.serviceImpl;

import models.Agency;
import service.AgencyService;

public class AgencyServiceImpl implements AgencyService {
    @Override
    public String addAgency(Agency agency) {
        return "";
    }

    @Override
    public Agency getAgencyById(long id) {
        return null;
    }

    @Override
    public Agency[] getAllAgency() {
        return new Agency[0];
    }

    @Override
    public String updateAgencyById(long id, Agency newAgency) {
        return "";
    }

    @Override
    public String deleteAgencyById(long id) {
        return "";
    }
}
