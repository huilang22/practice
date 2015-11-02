/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimeGroupFindNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a RbrTimeGroupFindNoOpRequest Udt Request/Response
 *
 */
public class RbrTimeGroupFindNoOpRequest extends RbrTimeGroupRequest {
/**
 *
 * Constructor to create a   RbrTimeGroupFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrTimeGroupFindNoOpRequest(String id, RbrTmGrpObjectDataList noOpIn) {
    super(id, "RbrTimeGroupFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RbrTmGrpObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrTimeGroup", noOpIn);
      }
      addInput("RbrTimeGroup", mapList);
    }
  }
/**
 *
 * Retrieves the RbrTmGrpObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RbrTmGrpObjectDataList getOutput() {
    return RbrTmGrpObjectHelper.fromMapList(outputMap, "RbrTimeGroupList");
  }
}
