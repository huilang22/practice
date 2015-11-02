/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsLineFindNoOpRequest Udt Request/Response
 *
 */
public class InvsLineFindNoOpRequest extends InvsLineRequest {
/**
 *
 * Constructor to create a   InvsLineFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLineFindNoOpRequest(String id, InvsLineObjectDataList noOpIn) {
    super(id, "InvsLineFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsLineObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsLine", noOpIn);
      }
      addInput("InvsLine", mapList);
    }
  }
/**
 *
 * Retrieves the InvsLineObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLineObjectDataList getOutput() {
    return InvsLineObjectHelper.fromMapList(outputMap, "InvsLineList");
  }
}
