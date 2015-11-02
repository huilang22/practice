/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerLifetimeIdFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a CustomerLifetimeIdFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CustomerLifetimeIdFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CustomerLifetimeIdObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CustomerLifetimeIdFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CustomerLifetimeIdFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerLifetimeIdObjectDataList noOpInIn) {
    super(id, context, "CustomerLifetimeIdFind");
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
        mapArray[i] = CustomerLifetimeIdObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CustomerLifetimeId", noOpIn);
      }
      addInput("CustomerLifetimeId", mapList);
    }
  }
/**
 *
 * Sets the  CustomerLifetimeId
 * @param noOpInIn CustomerLifetimeIdObjectDataList to set
 *
 */
  public void setCustomerLifetimeId(CustomerLifetimeIdObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CustomerLifetimeId passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerLifetimeIdObjectDataList getCustomerLifetimeId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CustomerLifetimeIdObjectHelper.fromMapList(inputMap, "CustomerLifetimeIdList");
  }
}
