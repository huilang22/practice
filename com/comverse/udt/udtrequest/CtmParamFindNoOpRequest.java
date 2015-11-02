/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamFindNoOpRequest.java
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
 * NoOp class used to simulate a CtmParamFindNoOpRequest Udt Request/Response
 *
 */
public class CtmParamFindNoOpRequest extends CtmParamRequest {
/**
 *
 * Constructor to create a   CtmParamFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtmParamFindNoOpRequest(String id, CtmParamObjectDataList noOpIn) {
    super(id, "CtmParamFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtmParamObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtmParam", noOpIn);
      }
      addInput("CtmParam", mapList);
    }
  }
/**
 *
 * Retrieves the CtmParamObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtmParamObjectDataList getOutput() {
    return CtmParamObjectHelper.fromMapList(outputMap, "CtmParamList");
  }
}
