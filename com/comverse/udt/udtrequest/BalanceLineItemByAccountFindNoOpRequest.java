/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemByAccountFindNoOpRequest.java
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
 * NoOp class used to simulate a BalanceLineItemByAccountFindNoOpRequest Udt Request/Response
 *
 */
public class BalanceLineItemByAccountFindNoOpRequest extends BalanceLineItemRequest {
/**
 *
 * Constructor to create a   BalanceLineItemByAccountFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BalanceLineItemByAccountFindNoOpRequest(String id, BalanceLineItemObjectDataList noOpIn) {
    super(id, "BalanceLineItemByAccountFindNoOpRequest");
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
