/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerContractFindByServiceOrderNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a CustomerContractFindByServiceOrderNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CustomerContractFindByServiceOrderNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CustomerContractObjectBaseDataList noOpIn;

/**
 *
 * Constructor to create a   CustomerContractFindByServiceOrderNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CustomerContractFindByServiceOrderNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectBaseDataList noOpInIn) {
    super(id, context, "CustomerContractFindByServiceOrder");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = CustomerContractObjectBaseHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CustomerContract", noOpIn);
      }
      addInput("CustomerContract", mapList);
    }
  }
/**
 *
 * Sets the  CustomerContract
 * @param noOpInIn CustomerContractObjectBaseDataList to set
 *
 */
  public void setCustomerContract(CustomerContractObjectBaseDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CustomerContract passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerContractObjectBaseDataList getCustomerContract() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CustomerContractObjectBaseHelper.fromMapList(inputMap, "CustomerContractList");
  }
}
