/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerMainFindNoOpRequest.java
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
 * NoOp class used to simulate a InvContainerMainFindNoOpRequest Udt Request/Response
 *
 */
public class InvContainerMainFindNoOpRequest extends InvContainerMainRequest {
/**
 *
 * Constructor to create a   InvContainerMainFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvContainerMainFindNoOpRequest(String id, InvContainerMainObjectDataList noOpIn) {
    super(id, "InvContainerMainFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvContainerMainObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvContainerMain", noOpIn);
      }
      addInput("InvContainerMain", mapList);
    }
  }
/**
 *
 * Retrieves the InvContainerMainObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvContainerMainObjectDataList getOutput() {
    return InvContainerMainObjectHelper.fromMapList(outputMap, "InvContainerMainList");
  }
}
