/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityUserFindNoOpRequest.java
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
 * NoOp class used to simulate a SecurityUserFindNoOpRequest Udt Request/Response
 *
 */
public class SecurityUserFindNoOpRequest extends SecurityUserRequest {
/**
 *
 * Constructor to create a   SecurityUserFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SecurityUserFindNoOpRequest(String id, SecurityUserObjectDataList noOpIn) {
    super(id, "SecurityUserFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = SecurityUserObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SecurityUser", noOpIn);
      }
      addInput("SecurityUser", mapList);
    }
  }
/**
 *
 * Retrieves the SecurityUserObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public SecurityUserObjectDataList getOutput() {
    return SecurityUserObjectHelper.fromMapList(outputMap, "SecurityUserList");
  }
}
