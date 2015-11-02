/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsLocationFindNoOpRequest Udt Request/Response
 *
 */
public class InvsLocationFindNoOpRequest extends InvsLocationRequest {
/**
 *
 * Constructor to create a   InvsLocationFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLocationFindNoOpRequest(String id, InvsLocationObjectDataList noOpIn) {
    super(id, "InvsLocationFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsLocationObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsLocation", noOpIn);
      }
      addInput("InvsLocation", mapList);
    }
  }
/**
 *
 * Retrieves the InvsLocationObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationObjectDataList getOutput() {
    return InvsLocationObjectHelper.fromMapList(outputMap, "InvsLocationList");
  }
}
