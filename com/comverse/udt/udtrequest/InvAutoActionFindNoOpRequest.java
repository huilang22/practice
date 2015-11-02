/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvAutoActionFindNoOpRequest.java
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
 * NoOp class used to simulate a InvAutoActionFindNoOpRequest Udt Request/Response
 *
 */
public class InvAutoActionFindNoOpRequest extends InvAutoActionRequest {
/**
 *
 * Constructor to create a   InvAutoActionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvAutoActionFindNoOpRequest(String id, InvAutoActionObjDataList noOpIn) {
    super(id, "InvAutoActionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvAutoActionObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvAutoAction", noOpIn);
      }
      addInput("InvAutoAction", mapList);
    }
  }
/**
 *
 * Retrieves the InvAutoActionObjDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvAutoActionObjDataList getOutput() {
    return InvAutoActionObjHelper.fromMapList(outputMap, "InvAutoActionList");
  }
}
