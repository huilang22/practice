/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityUserFindRequest.java
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
 * Class used to create a SecurityUserFindRequest Udt Request
 *
 */

public class SecurityUserFindRequest extends SecurityUserRequest {
/**
 *
 * Constructor to create a  SecurityUserFindRequest
 * @param id Unique request name
 * @param SecurityUserFindIn SecurityUserObjectFilter for SecurityUserFindRequest
 *
 */
@JsonCreator
  public SecurityUserFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("SecurityUser")SecurityUserObjectFilter SecurityUserFindIn) {
    super(id, "SecurityUserFind");
    if (SecurityUserFindIn != null) {
      Integer index =  SecurityUserFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SecurityUser", SecurityUserObjectHelper.toMap(SecurityUserFindIn, new HashMap(), "SecurityUser").get("SecurityUser"));
    }
  }

/**
 *
 * Retrieves the SecurityUserObjectDataList that results from the SecurityUserFindRequest call
 * @return SecurityUserObjectDataList resulting from udt call
 *
 */

  public SecurityUserObjectDataList getOutput() {
    return SecurityUserObjectHelper.fromMapList(outputMap, "SecurityUserList");
  }
}
