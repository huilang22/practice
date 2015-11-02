/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobErrorFindNoOpRequest.java
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
 * NoOp class used to simulate a InvJobErrorFindNoOpRequest Udt Request/Response
 *
 */
public class InvJobErrorFindNoOpRequest extends InvJobErrorRequest {
/**
 *
 * Constructor to create a   InvJobErrorFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvJobErrorFindNoOpRequest(String id, InvJobErrorObjectDataList noOpIn) {
    super(id, "InvJobErrorFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvJobErrorObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvJobError", noOpIn);
      }
      addInput("InvJobError", mapList);
    }
  }
/**
 *
 * Retrieves the InvJobErrorObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvJobErrorObjectDataList getOutput() {
    return InvJobErrorObjectHelper.fromMapList(outputMap, "InvJobErrorList");
  }
}
