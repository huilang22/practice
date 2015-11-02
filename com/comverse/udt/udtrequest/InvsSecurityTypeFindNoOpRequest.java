/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSecurityTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsSecurityTypeFindNoOpRequest Udt Request/Response
 *
 */
public class InvsSecurityTypeFindNoOpRequest extends InvsSecurityTypeRequest {
/**
 *
 * Constructor to create a   InvsSecurityTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSecurityTypeFindNoOpRequest(String id, InvsSecurityTypeObjectDataList noOpIn) {
    super(id, "InvsSecurityTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsSecurityTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsSecurityType", noOpIn);
      }
      addInput("InvsSecurityType", mapList);
    }
  }
/**
 *
 * Retrieves the InvsSecurityTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSecurityTypeObjectDataList getOutput() {
    return InvsSecurityTypeObjectHelper.fromMapList(outputMap, "InvsSecurityTypeList");
  }
}
