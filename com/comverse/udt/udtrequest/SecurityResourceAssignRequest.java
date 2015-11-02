/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityResourceAssignRequest.java
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
 * Class used to create a SecurityResourceAssignRequest Udt Request
 *
 */

public class SecurityResourceAssignRequest extends SecurityResourceRequest {
/**
 *
 * Constructor to create a  SecurityResourceAssignRequest
 * @param id Unique request name
 * @param SecurityResourceAssignIn SecurityResourceObjectData[] for SecurityResourceAssignRequest
 * @param a_role_id BigInteger for SecurityResourceAssignRequest
 * @param a_user_name String for SecurityResourceAssignRequest
 *
 */
@JsonCreator
  public SecurityResourceAssignRequest(@JsonProperty("RequestId") String id, @JsonProperty("SecurityResource")SecurityResourceObjectData[] SecurityResourceAssignIn, @JsonProperty("ARoleId")BigInteger a_role_id, @JsonProperty("AUserName")String a_user_name) {
    super(id, "SecurityResourceAssign");
    if (SecurityResourceAssignIn != null) {
      Object[] list = new Object[SecurityResourceAssignIn.length];
      for (int i = 0; i < SecurityResourceAssignIn.length; i++) {
        list[i] = SecurityResourceObjectHelper.getMap(SecurityResourceAssignIn[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "SecurityResource");
      }
      addInput("SecurityResourceList", list);
    }
    if (a_role_id != null) {
      addInput("ARoleId", a_role_id);
    }
    if (a_user_name != null) {
      addInput("AUserName", a_user_name);
    }
  }

/**
 *
 * Retrieves the SecurityResourceObjectDataList that results from the SecurityResourceAssignRequest call
 * @return SecurityResourceObjectDataList resulting from udt call
 *
 */

  public SecurityResourceObjectDataList getOutput() {
    return SecurityResourceObjectHelper.fromMapList(outputMap, "SecurityResourceList");
  }
}
