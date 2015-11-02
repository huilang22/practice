/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityRoleFindRequest.java
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
 * Class used to create a SecurityRoleFindRequest Udt Request
 *
 */

public class SecurityRoleFindRequest extends SecurityRoleRequest {
/**
 *
 * Constructor to create a  SecurityRoleFindRequest
 * @param id Unique request name
 * @param SecurityRoleFindIn SecurityRoleObjectFilter for SecurityRoleFindRequest
 *
 */
@JsonCreator
  public SecurityRoleFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("SecurityRole")SecurityRoleObjectFilter SecurityRoleFindIn) {
    super(id, "SecurityRoleFind");
    if (SecurityRoleFindIn != null) {
      Integer index =  SecurityRoleFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SecurityRole", SecurityRoleObjectHelper.toMap(SecurityRoleFindIn, new HashMap(), "SecurityRole").get("SecurityRole"));
    }
  }

/**
 *
 * Retrieves the SecurityRoleObjectDataList that results from the SecurityRoleFindRequest call
 * @return SecurityRoleObjectDataList resulting from udt call
 *
 */

  public SecurityRoleObjectDataList getOutput() {
    return SecurityRoleObjectHelper.fromMapList(outputMap, "SecurityRoleList");
  }
}
