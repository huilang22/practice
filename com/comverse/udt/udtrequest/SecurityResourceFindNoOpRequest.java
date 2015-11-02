/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityResourceFindNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a SecurityResourceFindNoOpRequest Udt Request/Response
 *
 */
public class SecurityResourceFindNoOpRequest extends SecurityResourceRequest {
/**
 *
 * Constructor to create a   SecurityResourceFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SecurityResourceFindNoOpRequest(String id, SecurityResourceObjectDataList noOpIn) {
    super(id, "SecurityResourceFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = SecurityResourceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SecurityResource", noOpIn);
      }
      addInput("SecurityResource", mapList);
    }
  }
/**
 *
 * Retrieves the SecurityResourceObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public SecurityResourceObjectDataList getOutput() {
    return SecurityResourceObjectHelper.fromMapList(outputMap, "SecurityResourceList");
  }
}
