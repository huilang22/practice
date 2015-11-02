/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsProfileFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsProfileFindNoOpRequest Udt Request/Response
 *
 */
public class InvsProfileFindNoOpRequest extends InvsProfileRequest {
/**
 *
 * Constructor to create a   InvsProfileFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsProfileFindNoOpRequest(String id, InvsProfileObjectDataList noOpIn) {
    super(id, "InvsProfileFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsProfileObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsProfile", noOpIn);
      }
      addInput("InvsProfile", mapList);
    }
  }
/**
 *
 * Retrieves the InvsProfileObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsProfileObjectDataList getOutput() {
    return InvsProfileObjectHelper.fromMapList(outputMap, "InvsProfileList");
  }
}
