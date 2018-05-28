package com.jainsp.controller;

import com.jainsp.entity.BillingInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/billing")
@RestController
public class BillingDataController {

    @RequestMapping(name = "/getAll", method = RequestMethod.GET)
    public List<BillingInfo> getAllBillingData() {
        System.out.println("Sending all billing info now");
        List<BillingInfo> dataList = new ArrayList<>();

        BillingInfo info1 = new BillingInfo();
        info1.setInvoiceGroupNumber(1111);
        info1.setAccountNumber(123123);
        info1.setAccountName("Apple Inc.");
        info1.setBillingRelationship("1232212");
        info1.setAccountType("CGA");
        info1.setBillableValue(new BigDecimal(1232212321));
        info1.setInvoiceFee(new BigDecimal(24125));
        info1.setInvoiceStatus("Pending Release");
        dataList.add(info1);

        BillingInfo info2 = new BillingInfo();
        info2.setInvoiceGroupNumber(1111);
        info2.setAccountNumber(1231333);
        info2.setAccountName("Apple Inc.");
        info2.setBillingRelationship("n/a");
        info2.setAccountType("Non-custody");
        info2.setBillableValue(new BigDecimal(7877878));
        info2.setInvoiceFee(new BigDecimal(7787));
        info2.setInvoiceStatus("Sent on Feb 1 2018");
        dataList.add(info2);

        BillingInfo info3 = new BillingInfo();
        info3.setInvoiceGroupNumber(2222);
        info3.setAccountNumber(23232);
        info3.setAccountName("Alphabet Inc.");
        info3.setBillingRelationship("23433412");
        info3.setAccountType("CGA");
        info3.setBillableValue(new BigDecimal(567555677));
        info3.setInvoiceFee(new BigDecimal(444343));
        info3.setInvoiceStatus("Pending Release");
        dataList.add(info3);

        BillingInfo info4 = new BillingInfo();
        info4.setInvoiceGroupNumber(2222);
        info4.setAccountNumber(33243);
        info4.setAccountName("Apple Inc.");
        info4.setBillingRelationship("787876867");
        info4.setAccountType("AIPR");
        info4.setBillableValue(new BigDecimal(234243423));
        info4.setInvoiceFee(new BigDecimal(34343));
        info4.setInvoiceStatus("Pending Release");
        dataList.add(info4);

        return dataList;
    }

    @RequestMapping(value = "/releaseBillingInvoice")
    public void releaseBillingInvoice(String billingInfo){
        System.out.println("Received billing info to release as : " + billingInfo);
    }
}
