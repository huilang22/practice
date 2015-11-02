/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrRateLimitFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UnitCrRateLimitFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnitCrRateLimitFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnitCrRateLimitsObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UnitCrRateLimitFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnitCrRateLimitFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRateLimitsObjectDataList noOpInIn) {
    super(id, context, "UnitCrRateLimitFind");
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
        mapArray[i] = UnitCrRateLimitsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UnitCrRateLimit", noOpIn);
      }
      addInput("UnitCrRateLimit", mapList);
    }
  }
/**
 *
 * Sets the  UnitCrRateLimit
 * @param noOpInIn UnitCrRateLimitsObjectDataList to set
 *
 */
  public void setUnitCrRateLimit(UnitCrRateLimitsObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnitCrRateLimit passed into the constructor
 * @return Simulated response
 *
 */
  public UnitCrRateLimitsObjectDataList getUnitCrRateLimit() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnitCrRateLimitsObjectHelper.fromMapList(inputMap, "UnitCrRateLimitList");
  }
}
