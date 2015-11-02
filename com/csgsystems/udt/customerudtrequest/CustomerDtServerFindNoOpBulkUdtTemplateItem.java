/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerDtServerFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a CustomerDtServerFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CustomerDtServerFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CustomerDtServerObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CustomerDtServerFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CustomerDtServerFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerDtServerObjectDataList noOpInIn) {
    super(id, context, "CustomerDtServerFind");
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
        mapArray[i] = CustomerDtServerObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CustomerDtServer", noOpIn);
      }
      addInput("CustomerDtServer", mapList);
    }
  }
/**
 *
 * Sets the  CustomerDtServer
 * @param noOpInIn CustomerDtServerObjectDataList to set
 *
 */
  public void setCustomerDtServer(CustomerDtServerObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CustomerDtServer passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerDtServerObjectDataList getCustomerDtServer() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CustomerDtServerObjectHelper.fromMapList(inputMap, "CustomerDtServerList");
  }
}
