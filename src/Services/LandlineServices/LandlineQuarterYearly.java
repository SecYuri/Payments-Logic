package Services.LandlineServices;

public class LandlineQuarterYearly extends AbstractLandlineService {

    @Override
    public void serviceProviderPayLogic() {

        serviceHandler.pay("http://www.we.com/landline/quarter-yearly/pay", serviceForm);
    }

    @Override
    public float serviceProviderGetBillLogic() {
        float billAmount = serviceHandler.getBill("http://www.we.com/landline/quarter-yearly/getbill", serviceForm);
        return billAmount;
    }

    @Override
    protected String creatserviceProviderName() {
        return "Landline Quarter Yearly";
    }

}
