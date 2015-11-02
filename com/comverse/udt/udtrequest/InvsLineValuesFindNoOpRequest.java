/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineValuesFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsLineValuesFindNoOpRequest Udt Request/Response
 *
 */
public class InvsLineValuesFindNoOpRequest extends InvsLineValuesRequest {
/**
 *
 * Constructor to create a   InvsLineValuesFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLineValuesFindNoOpRequest(String id, InvsLineValuesObjectDataList noOpIn) {
    super(id, "InvsLineValuesFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsLineValuesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsLineValues", noOpIn);
      }
      addInput("InvsLineValues", mapList);
    }
  }
/**
 *
 * Retrieves the InvsLineValuesObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLineValuesObjectDataList getOutput() {
    return InvsLineValuesObjectHelper.fromMapList(outputMap, "InvsLineValuesList");
  }
}
