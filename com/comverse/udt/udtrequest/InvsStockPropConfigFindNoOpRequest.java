/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStockPropConfigFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsStockPropConfigFindNoOpRequest Udt Request/Response
 *
 */
public class InvsStockPropConfigFindNoOpRequest extends InvsStockPropConfigRequest {
/**
 *
 * Constructor to create a   InvsStockPropConfigFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsStockPropConfigFindNoOpRequest(String id, InvsStockPropConfigObjectDataList noOpIn) {
    super(id, "InvsStockPropConfigFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsStockPropConfigObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsStockPropConfig", noOpIn);
      }
      addInput("InvsStockPropConfig", mapList);
    }
  }
/**
 *
 * Retrieves the InvsStockPropConfigObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsStockPropConfigObjectDataList getOutput() {
    return InvsStockPropConfigObjectHelper.fromMapList(outputMap, "InvsStockPropConfigList");
  }
}
