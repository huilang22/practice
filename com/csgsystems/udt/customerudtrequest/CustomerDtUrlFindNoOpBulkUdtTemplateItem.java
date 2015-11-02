/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerDtUrlFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CustomerDtUrlFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CustomerDtUrlFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CustomerDtUrlObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CustomerDtUrlFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CustomerDtUrlFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerDtUrlObjectDataList noOpInIn) {
    super(id, context, "CustomerDtUrlFind");
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
        mapArray[i] = CustomerDtUrlObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CustomerDtUrl", noOpIn);
      }
      addInput("CustomerDtUrl", mapList);
    }
  }
/**
 *
 * Sets the  CustomerDtUrl
 * @param noOpInIn CustomerDtUrlObjectDataList to set
 *
 */
  public void setCustomerDtUrl(CustomerDtUrlObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CustomerDtUrl passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerDtUrlObjectDataList getCustomerDtUrl() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CustomerDtUrlObjectHelper.fromMapList(inputMap, "CustomerDtUrlList");
  }
}
