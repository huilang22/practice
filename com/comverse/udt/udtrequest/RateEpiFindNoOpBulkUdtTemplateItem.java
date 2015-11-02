/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateEpiFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateEpiFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateEpiFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateEpiObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RateEpiFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateEpiFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateEpiObjectDataList noOpInIn) {
    super(id, context, "RateEpiFind");
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
        mapArray[i] = RateEpiObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateEpi", noOpIn);
      }
      addInput("RateEpi", mapList);
    }
  }
/**
 *
 * Sets the  RateEpi
 * @param noOpInIn RateEpiObjectDataList to set
 *
 */
  public void setRateEpi(RateEpiObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateEpi passed into the constructor
 * @return Simulated response
 *
 */
  public RateEpiObjectDataList getRateEpi() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RateEpiObjectHelper.fromMapList(inputMap, "RateEpiList");
  }
}
