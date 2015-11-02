/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityAciFindRequest.java
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
 * Class used to create a SecurityAciFindRequest Udt Request
 *
 */

public class SecurityAciFindRequest extends SecurityAciRequest {
/**
 *
 * Constructor to create a  SecurityAciFindRequest
 * @param id Unique request name
 * @param SecurityAciFindIn SecurityAciObjectFilter for SecurityAciFindRequest
 *
 */
@JsonCreator
  public SecurityAciFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("SecurityAci")SecurityAciObjectFilter SecurityAciFindIn) {
    super(id, "SecurityAciFind");
    if (SecurityAciFindIn != null) {
      Integer index =  SecurityAciFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SecurityAci", SecurityAciObjectHelper.toMap(SecurityAciFindIn, new HashMap(), "SecurityAci").get("SecurityAci"));
    }
  }

/**
 *
 * Retrieves the SecurityAciObjectDataList that results from the SecurityAciFindRequest call
 * @return SecurityAciObjectDataList resulting from udt call
 *
 */

  public SecurityAciObjectDataList getOutput() {
    return SecurityAciObjectHelper.fromMapList(outputMap, "SecurityAciList");
  }
}
