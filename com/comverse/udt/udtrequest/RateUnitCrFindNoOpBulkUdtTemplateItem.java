/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUnitCrFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateUnitCrFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateUnitCrFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateUnitCrObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RateUnitCrFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateUnitCrFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUnitCrObjectDataList noOpInIn) {
    super(id, context, "RateUnitCrFind");
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
        mapArray[i] = RateUnitCrObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateUnitCr", noOpIn);
      }
      addInput("RateUnitCr", mapList);
    }
  }
/**
 *
 * Sets the  RateUnitCr
 * @param noOpInIn RateUnitCrObjectDataList to set
 *
 */
  public void setRateUnitCr(RateUnitCrObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateUnitCr passed into the constructor
 * @return Simulated response
 *
 */
  public RateUnitCrObjectDataList getRateUnitCr() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RateUnitCrObjectHelper.fromMapList(inputMap, "RateUnitCrList");
  }
}
