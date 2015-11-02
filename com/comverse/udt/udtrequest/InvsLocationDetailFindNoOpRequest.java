/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsLocationDetailFindNoOpRequest Udt Request/Response
 *
 */
public class InvsLocationDetailFindNoOpRequest extends InvsLocationDetailRequest {
/**
 *
 * Constructor to create a   InvsLocationDetailFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLocationDetailFindNoOpRequest(String id, InvsLocationDetailObjectDataList noOpIn) {
    super(id, "InvsLocationDetailFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsLocationDetailObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsLocationDetail", noOpIn);
      }
      addInput("InvsLocationDetail", mapList);
    }
  }
/**
 *
 * Retrieves the InvsLocationDetailObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationDetailObjectDataList getOutput() {
    return InvsLocationDetailObjectHelper.fromMapList(outputMap, "InvsLocationDetailList");
  }
}
