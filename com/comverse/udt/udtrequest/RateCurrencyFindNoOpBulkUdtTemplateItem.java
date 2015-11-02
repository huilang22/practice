/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCurrencyFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateCurrencyFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateCurrencyFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RCObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RateCurrencyFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateCurrencyFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RCObjectDataList noOpInIn) {
    super(id, context, "RateCurrencyFind");
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
        mapArray[i] = RCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateCurrency", noOpIn);
      }
      addInput("RateCurrency", mapList);
    }
  }
/**
 *
 * Sets the  RateCurrency
 * @param noOpInIn RCObjectDataList to set
 *
 */
  public void setRateCurrency(RCObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateCurrency passed into the constructor
 * @return Simulated response
 *
 */
  public RCObjectDataList getRateCurrency() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RCObjectHelper.fromMapList(inputMap, "RateCurrencyList");
  }
}
