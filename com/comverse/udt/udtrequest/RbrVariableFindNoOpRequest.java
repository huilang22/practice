/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrVariableFindNoOpRequest.java
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
 * NoOp class used to simulate a RbrVariableFindNoOpRequest Udt Request/Response
 *
 */
public class RbrVariableFindNoOpRequest extends RbrVariableRequest {
/**
 *
 * Constructor to create a   RbrVariableFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrVariableFindNoOpRequest(String id, RbrVarObjectDataList noOpIn) {
    super(id, "RbrVariableFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RbrVarObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrVariable", noOpIn);
      }
      addInput("RbrVariable", mapList);
    }
  }
/**
 *
 * Retrieves the RbrVarObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RbrVarObjectDataList getOutput() {
    return RbrVarObjectHelper.fromMapList(outputMap, "RbrVariableList");
  }
}
