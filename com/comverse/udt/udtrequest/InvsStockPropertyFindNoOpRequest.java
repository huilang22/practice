/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStockPropertyFindNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsStockPropertyFindNoOpRequest Udt Request/Response
 *
 */
public class InvsStockPropertyFindNoOpRequest extends InvsStockPropertyRequest {
/**
 *
 * Constructor to create a   InvsStockPropertyFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsStockPropertyFindNoOpRequest(String id, InvsStockPropertyObjectDataList noOpIn) {
    super(id, "InvsStockPropertyFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsStockPropertyObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsStockProperty", noOpIn);
      }
      addInput("InvsStockProperty", mapList);
    }
  }
/**
 *
 * Retrieves the InvsStockPropertyObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsStockPropertyObjectDataList getOutput() {
    return InvsStockPropertyObjectHelper.fromMapList(outputMap, "InvsStockPropertyList");
  }
}
