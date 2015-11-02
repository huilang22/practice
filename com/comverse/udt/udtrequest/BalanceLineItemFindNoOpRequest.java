/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemFindNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a BalanceLineItemFindNoOpRequest Udt Request/Response
 *
 */
public class BalanceLineItemFindNoOpRequest extends BalanceLineItemRequest {
/**
 *
 * Constructor to create a   BalanceLineItemFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BalanceLineItemFindNoOpRequest(String id, BalanceLineItemObjectDataList noOpIn) {
    super(id, "BalanceLineItemFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BalanceLineItemObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BalanceLineItem", noOpIn);
      }
      addInput("BalanceLineItem", mapList);
    }
  }
/**
 *
 * Retrieves the BalanceLineItemObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BalanceLineItemObjectDataList getOutput() {
    return BalanceLineItemObjectHelper.fromMapList(outputMap, "BalanceLineItemList");
  }
}
