/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageBandFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateUsageBandFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateUsageBandFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateUsageBandObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RateUsageBandFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateUsageBandFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageBandObjectDataList noOpInIn) {
    super(id, context, "RateUsageBandFind");
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
        mapArray[i] = RateUsageBandObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateUsageBand", noOpIn);
      }
      addInput("RateUsageBand", mapList);
    }
  }
/**
 *
 * Sets the  RateUsageBand
 * @param noOpInIn RateUsageBandObjectDataList to set
 *
 */
  public void setRateUsageBand(RateUsageBandObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateUsageBand passed into the constructor
 * @return Simulated response
 *
 */
  public RateUsageBandObjectDataList getRateUsageBand() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RateUsageBandObjectHelper.fromMapList(inputMap, "RateUsageBandList");
  }
}
