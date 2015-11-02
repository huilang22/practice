/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SystemParameterFindNoOpRequest.java
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
 * NoOp class used to simulate a SystemParameterFindNoOpRequest Udt Request/Response
 *
 */
public class SystemParameterFindNoOpRequest extends SystemParameterRequest {
/**
 *
 * Constructor to create a   SystemParameterFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SystemParameterFindNoOpRequest(String id, SPObjectDataList noOpIn) {
    super(id, "SystemParameterFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = SPObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SystemParameter", noOpIn);
      }
      addInput("SystemParameter", mapList);
    }
  }
/**
 *
 * Retrieves the SPObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public SPObjectDataList getOutput() {
    return SPObjectHelper.fromMapList(outputMap, "SystemParameterList");
  }
}
