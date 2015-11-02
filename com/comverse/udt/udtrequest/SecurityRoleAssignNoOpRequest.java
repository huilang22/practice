/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityRoleAssignNoOpRequest.java
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
 * NoOp class used to simulate a SecurityRoleAssignNoOpRequest Udt Request/Response
 *
 */
public class SecurityRoleAssignNoOpRequest extends SecurityRoleRequest {
/**
 *
 * Constructor to create a   SecurityRoleAssignNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SecurityRoleAssignNoOpRequest(String id, SecurityRoleObjectDataList noOpIn) {
    super(id, "SecurityRoleAssignNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = SecurityRoleObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SecurityRole", noOpIn);
      }
      addInput("SecurityRole", mapList);
    }
  }
/**
 *
 * Retrieves the SecurityRoleObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public SecurityRoleObjectDataList getOutput() {
    return SecurityRoleObjectHelper.fromMapList(outputMap, "SecurityRoleList");
  }
}
