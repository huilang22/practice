/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityResourceUnassignRequest.java
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
 * Class used to create a SecurityResourceUnassignRequest Udt Request
 *
 */

public class SecurityResourceUnassignRequest extends SecurityResourceRequest {
/**
 *
 * Constructor to create a  SecurityResourceUnassignRequest
 * @param id Unique request name
 * @param SecurityResourceUnassignIn SecurityResourceObjectData[] for SecurityResourceUnassignRequest
 * @param b_role_id BigInteger for SecurityResourceUnassignRequest
 *
 */
@JsonCreator
  public SecurityResourceUnassignRequest(@JsonProperty("RequestId") String id, @JsonProperty("SecurityResource")SecurityResourceObjectData[] SecurityResourceUnassignIn, @JsonProperty("BRoleId")BigInteger b_role_id) {
    super(id, "SecurityResourceUnassign");
    if (SecurityResourceUnassignIn != null) {
      Object[] list = new Object[SecurityResourceUnassignIn.length];
      for (int i = 0; i < SecurityResourceUnassignIn.length; i++) {
        list[i] = SecurityResourceObjectHelper.getMap(SecurityResourceUnassignIn[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "SecurityResource");
      }
      addInput("SecurityResourceList", list);
    }
    if (b_role_id != null) {
      addInput("BRoleId", b_role_id);
    }
  }

/**
 *
 * Retrieves the SecurityResourceObjectDataList that results from the SecurityResourceUnassignRequest call
 * @return SecurityResourceObjectDataList resulting from udt call
 *
 */

  public SecurityResourceObjectDataList getOutput() {
    return SecurityResourceObjectHelper.fromMapList(outputMap, "SecurityResourceList");
  }
}
