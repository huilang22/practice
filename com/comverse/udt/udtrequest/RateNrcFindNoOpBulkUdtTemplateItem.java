/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateNrcFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateNrcFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateNrcFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateNrcObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RateNrcFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateNrcFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateNrcObjectDataList noOpInIn) {
    super(id, context, "RateNrcFind");
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
        mapArray[i] = RateNrcObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateNrc", noOpIn);
      }
      addInput("RateNrc", mapList);
    }
  }
/**
 *
 * Sets the  RateNrc
 * @param noOpInIn RateNrcObjectDataList to set
 *
 */
  public void setRateNrc(RateNrcObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateNrc passed into the constructor
 * @return Simulated response
 *
 */
  public RateNrcObjectDataList getRateNrc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RateNrcObjectHelper.fromMapList(inputMap, "RateNrcList");
  }
}
