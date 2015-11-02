/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimStockPropConfigFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsSimStockPropConfigFindNoOpRequest Udt Request/Response
 *
 */
public class InvsSimStockPropConfigFindNoOpRequest extends InvsSimStockPropConfigRequest {
/**
 *
 * Constructor to create a   InvsSimStockPropConfigFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSimStockPropConfigFindNoOpRequest(String id, InvsSimStockPropConfigObjectDataList noOpIn) {
    super(id, "InvsSimStockPropConfigFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsSimStockPropConfigObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsSimStockPropConfig", noOpIn);
      }
      addInput("InvsSimStockPropConfig", mapList);
    }
  }
/**
 *
 * Retrieves the InvsSimStockPropConfigObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimStockPropConfigObjectDataList getOutput() {
    return InvsSimStockPropConfigObjectHelper.fromMapList(outputMap, "InvsSimStockPropConfigList");
  }
}
