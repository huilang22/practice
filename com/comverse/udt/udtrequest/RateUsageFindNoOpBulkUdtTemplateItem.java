/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageFindNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a RateUsageFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateUsageFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateUsageObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RateUsageFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateUsageFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageObjectDataList noOpInIn) {
    super(id, context, "RateUsageFind");
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
        mapArray[i] = RateUsageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateUsage", noOpIn);
      }
      addInput("RateUsage", mapList);
    }
  }
/**
 *
 * Sets the  RateUsage
 * @param noOpInIn RateUsageObjectDataList to set
 *
 */
  public void setRateUsage(RateUsageObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateUsage passed into the constructor
 * @return Simulated response
 *
 */
  public RateUsageObjectDataList getRateUsage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RateUsageObjectHelper.fromMapList(inputMap, "RateUsageList");
  }
}
