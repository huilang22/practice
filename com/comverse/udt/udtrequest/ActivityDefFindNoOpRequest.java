/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ActivityDefFindNoOpRequest.java
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

import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a ActivityDefFindNoOpRequest Udt Request/Response
 *
 */
public class ActivityDefFindNoOpRequest extends ActivityDefRequest {
/**
 *
 * Constructor to create a   ActivityDefFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ActivityDefFindNoOpRequest(String id, ActivityDefObjectDataList noOpIn) {
    super(id, "ActivityDefFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ActivityDefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ActivityDef", noOpIn);
      }
      addInput("ActivityDef", mapList);
    }
  }
/**
 *
 * Retrieves the ActivityDefObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ActivityDefObjectDataList getOutput() {
    return ActivityDefObjectHelper.fromMapList(outputMap, "ActivityDefList");
  }
}
