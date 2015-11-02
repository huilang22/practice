/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionGrpFindNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ConditionGrpFindNoOpRequest Udt Request/Response
 *
 */
public class ConditionGrpFindNoOpRequest extends ConditionGrpRequest {
/**
 *
 * Constructor to create a   ConditionGrpFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ConditionGrpFindNoOpRequest(String id, CondGrpObjDataList noOpIn) {
    super(id, "ConditionGrpFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CondGrpObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ConditionGrp", noOpIn);
      }
      addInput("ConditionGrp", mapList);
    }
  }
/**
 *
 * Retrieves the CondGrpObjDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CondGrpObjDataList getOutput() {
    return CondGrpObjHelper.fromMapList(outputMap, "ConditionGrpList");
  }
}
