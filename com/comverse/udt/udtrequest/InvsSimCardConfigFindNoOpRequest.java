/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsSimCardConfigFindNoOpRequest Udt Request/Response
 *
 */
public class InvsSimCardConfigFindNoOpRequest extends InvsSimCardConfigRequest {
/**
 *
 * Constructor to create a   InvsSimCardConfigFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSimCardConfigFindNoOpRequest(String id, InvsSimCardConfigObjectDataList noOpIn) {
    super(id, "InvsSimCardConfigFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsSimCardConfigObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsSimCardConfig", noOpIn);
      }
      addInput("InvsSimCardConfig", mapList);
    }
  }
/**
 *
 * Retrieves the InvsSimCardConfigObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimCardConfigObjectDataList getOutput() {
    return InvsSimCardConfigObjectHelper.fromMapList(outputMap, "InvsSimCardConfigList");
  }
}
