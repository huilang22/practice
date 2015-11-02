/*
 * Generated code DO NOT EDIT
 * Generated file: RatePeriodUsageFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RatePeriodUsageFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RatePeriodUsageFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RatePeriodUsagesObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RatePeriodUsageFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RatePeriodUsageFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RatePeriodUsagesObjectDataList noOpInIn) {
    super(id, context, "RatePeriodUsageFind");
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
        mapArray[i] = RatePeriodUsagesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RatePeriodUsage", noOpIn);
      }
      addInput("RatePeriodUsage", mapList);
    }
  }
/**
 *
 * Sets the  RatePeriodUsage
 * @param noOpInIn RatePeriodUsagesObjectDataList to set
 *
 */
  public void setRatePeriodUsage(RatePeriodUsagesObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RatePeriodUsage passed into the constructor
 * @return Simulated response
 *
 */
  public RatePeriodUsagesObjectDataList getRatePeriodUsage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RatePeriodUsagesObjectHelper.fromMapList(inputMap, "RatePeriodUsageList");
  }
}
