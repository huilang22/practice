/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityRoleUnassignRequest.java
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
 * Class used to create a SecurityRoleUnassignRequest Udt Request
 *
 */

public class SecurityRoleUnassignRequest extends SecurityRoleRequest {
/**
 *
 * Constructor to create a  SecurityRoleUnassignRequest
 * @param id Unique request name
 * @param SecurityRoleUnassignIn SecurityRoleObjectData[] for SecurityRoleUnassignRequest
 * @param b_res_id BigInteger for SecurityRoleUnassignRequest
 *
 */
@JsonCreator
  public SecurityRoleUnassignRequest(@JsonProperty("RequestId") String id, @JsonProperty("SecurityRole")SecurityRoleObjectData[] SecurityRoleUnassignIn, @JsonProperty("BResId")BigInteger b_res_id) {
    super(id, "SecurityRoleUnassign");
    if (SecurityRoleUnassignIn != null) {
      Object[] list = new Object[SecurityRoleUnassignIn.length];
      for (int i = 0; i < SecurityRoleUnassignIn.length; i++) {
        list[i] = SecurityRoleObjectHelper.getMap(SecurityRoleUnassignIn[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "SecurityRole");
      }
      addInput("SecurityRoleList", list);
    }
    if (b_res_id != null) {
      addInput("BResId", b_res_id);
    }
  }

/**
 *
 * Retrieves the SecurityRoleObjectDataList that results from the SecurityRoleUnassignRequest call
 * @return SecurityRoleObjectDataList resulting from udt call
 *
 */

  public SecurityRoleObjectDataList getOutput() {
    return SecurityRoleObjectHelper.fromMapList(outputMap, "SecurityRoleList");
  }
}
