/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerServiceCenterFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CustomerServiceCenterFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CustomerServiceCenterFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CustomerServiceCenterObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CustomerServiceCenterFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CustomerServiceCenterFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerServiceCenterObjectDataList noOpInIn) {
    super(id, context, "CustomerServiceCenterFind");
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
        mapArray[i] = CustomerServiceCenterObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CustomerServiceCenter", noOpIn);
      }
      addInput("CustomerServiceCenter", mapList);
    }
  }
/**
 *
 * Sets the  CustomerServiceCenter
 * @param noOpInIn CustomerServiceCenterObjectDataList to set
 *
 */
  public void setCustomerServiceCenter(CustomerServiceCenterObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CustomerServiceCenter passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerServiceCenterObjectDataList getCustomerServiceCenter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CustomerServiceCenterObjectHelper.fromMapList(inputMap, "CustomerServiceCenterList");
  }
}
