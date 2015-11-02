/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateRcFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateRcFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateRcFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RACObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RateRcFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateRcFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RACObjectDataList noOpInIn) {
    super(id, context, "RateRcFind");
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
        mapArray[i] = RACObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateRc", noOpIn);
      }
      addInput("RateRc", mapList);
    }
  }
/**
 *
 * Sets the  RateRc
 * @param noOpInIn RACObjectDataList to set
 *
 */
  public void setRateRc(RACObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateRc passed into the constructor
 * @return Simulated response
 *
 */
  public RACObjectDataList getRateRc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RACObjectHelper.fromMapList(inputMap, "RateRcList");
  }
}
