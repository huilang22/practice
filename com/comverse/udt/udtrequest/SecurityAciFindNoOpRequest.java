/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityAciFindNoOpRequest.java
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
 * NoOp class used to simulate a SecurityAciFindNoOpRequest Udt Request/Response
 *
 */
public class SecurityAciFindNoOpRequest extends SecurityAciRequest {
/**
 *
 * Constructor to create a   SecurityAciFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SecurityAciFindNoOpRequest(String id, SecurityAciObjectDataList noOpIn) {
    super(id, "SecurityAciFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = SecurityAciObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SecurityAci", noOpIn);
      }
      addInput("SecurityAci", mapList);
    }
  }
/**
 *
 * Retrieves the SecurityAciObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public SecurityAciObjectDataList getOutput() {
    return SecurityAciObjectHelper.fromMapList(outputMap, "SecurityAciList");
  }
}
