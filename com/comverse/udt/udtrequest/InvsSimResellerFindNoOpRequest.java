/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsSimResellerFindNoOpRequest Udt Request/Response
 *
 */
public class InvsSimResellerFindNoOpRequest extends InvsSimResellerRequest {
/**
 *
 * Constructor to create a   InvsSimResellerFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSimResellerFindNoOpRequest(String id, InvsSimResellerObjectDataList noOpIn) {
    super(id, "InvsSimResellerFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsSimResellerObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsSimReseller", noOpIn);
      }
      addInput("InvsSimReseller", mapList);
    }
  }
/**
 *
 * Retrieves the InvsSimResellerObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimResellerObjectDataList getOutput() {
    return InvsSimResellerObjectHelper.fromMapList(outputMap, "InvsSimResellerList");
  }
}
