/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityRoleFindNoOpRequest.java
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
 * NoOp class used to simulate a SecurityRoleFindNoOpRequest Udt Request/Response
 *
 */
public class SecurityRoleFindNoOpRequest extends SecurityRoleRequest {
/**
 *
 * Constructor to create a   SecurityRoleFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SecurityRoleFindNoOpRequest(String id, SecurityRoleObjectDataList noOpIn) {
    super(id, "SecurityRoleFindNoOpRequest");
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
