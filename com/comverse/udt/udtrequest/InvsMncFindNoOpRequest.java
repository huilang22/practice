/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsMncFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsMncFindNoOpRequest Udt Request/Response
 *
 */
public class InvsMncFindNoOpRequest extends InvsMncRequest {
/**
 *
 * Constructor to create a   InvsMncFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsMncFindNoOpRequest(String id, InvsMncObjectDataList noOpIn) {
    super(id, "InvsMncFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsMncObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsMnc", noOpIn);
      }
      addInput("InvsMnc", mapList);
    }
  }
/**
 *
 * Retrieves the InvsMncObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsMncObjectDataList getOutput() {
    return InvsMncObjectHelper.fromMapList(outputMap, "InvsMncList");
  }
}
