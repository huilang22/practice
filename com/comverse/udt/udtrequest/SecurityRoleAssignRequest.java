/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityRoleAssignRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a SecurityRoleAssignRequest Udt Request
 *
 */

public class SecurityRoleAssignRequest extends SecurityRoleRequest {
/**
 *
 * Constructor to create a  SecurityRoleAssignRequest
 * @param id Unique request name
 * @param SecurityRoleAssignIn SecurityRoleObjectData[] for SecurityRoleAssignRequest
 * @param a_res_id BigInteger for SecurityRoleAssignRequest
 * @param a_user_name String for SecurityRoleAssignRequest
 *
 */
@JsonCreator
  public SecurityRoleAssignRequest(@JsonProperty("RequestId") String id, @JsonProperty("SecurityRole")SecurityRoleObjectData[] SecurityRoleAssignIn, @JsonProperty("AResId")BigInteger a_res_id, @JsonProperty("AUserName")String a_user_name) {
    super(id, "SecurityRoleAssign");
    if (SecurityRoleAssignIn != null) {
      Object[] list = new Object[SecurityRoleAssignIn.length];
      for (int i = 0; i < SecurityRoleAssignIn.length; i++) {
        list[i] = SecurityRoleObjectHelper.getMap(SecurityRoleAssignIn[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "SecurityRole");
      }
      addInput("SecurityRoleList", list);
    }
    if (a_res_id != null) {
      addInput("AResId", a_res_id);
    }
    if (a_user_name != null) {
      addInput("AUserName", a_user_name);
    }
  }

/**
 *
 * Retrieves the SecurityRoleObjectDataList that results from the SecurityRoleAssignRequest call
 * @return SecurityRoleObjectDataList resulting from udt call
 *
 */

  public SecurityRoleObjectDataList getOutput() {
    return SecurityRoleObjectHelper.fromMapList(outputMap, "SecurityRoleList");
  }
}
