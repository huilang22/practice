/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrProcedureFindNoOpRequest.java
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
 * NoOp class used to simulate a RbrProcedureFindNoOpRequest Udt Request/Response
 *
 */
public class RbrProcedureFindNoOpRequest extends RbrProcedureRequest {
/**
 *
 * Constructor to create a   RbrProcedureFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrProcedureFindNoOpRequest(String id, RbrProcObjectDataList noOpIn) {
    super(id, "RbrProcedureFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RbrProcObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrProcedure", noOpIn);
      }
      addInput("RbrProcedure", mapList);
    }
  }
/**
 *
 * Retrieves the RbrProcObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RbrProcObjectDataList getOutput() {
    return RbrProcObjectHelper.fromMapList(outputMap, "RbrProcedureList");
  }
}
