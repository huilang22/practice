/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainFindNoOpRequest.java
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
 * NoOp class used to simulate a InvdMainFindNoOpRequest Udt Request/Response
 *
 */
public class InvdMainFindNoOpRequest extends InvdMainRequest {
/**
 *
 * Constructor to create a   InvdMainFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvdMainFindNoOpRequest(String id, InvdMainObjectDataList noOpIn) {
    super(id, "InvdMainFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvdMainObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvdMain", noOpIn);
      }
      addInput("InvdMain", mapList);
    }
  }
/**
 *
 * Retrieves the InvdMainObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvdMainObjectDataList getOutput() {
    return InvdMainObjectHelper.fromMapList(outputMap, "InvdMainList");
  }
}
