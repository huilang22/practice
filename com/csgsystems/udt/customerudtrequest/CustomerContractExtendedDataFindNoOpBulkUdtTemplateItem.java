/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerContractExtendedDataFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CustomerContractExtendedDataFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CustomerContractExtendedDataFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CustomerContractEDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CustomerContractExtendedDataFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CustomerContractExtendedDataFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractEDObjectDataList noOpInIn) {
    super(id, context, "CustomerContractExtendedDataFind");
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
        mapArray[i] = CustomerContractEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CustomerContractExtendedData", noOpIn);
      }
      addInput("CustomerContractExtendedData", mapList);
    }
  }
/**
 *
 * Sets the  CustomerContractExtendedData
 * @param noOpInIn CustomerContractEDObjectDataList to set
 *
 */
  public void setCustomerContractExtendedData(CustomerContractEDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CustomerContractExtendedData passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerContractEDObjectDataList getCustomerContractExtendedData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CustomerContractEDObjectHelper.fromMapList(inputMap, "CustomerContractExtendedDataList");
  }
}
