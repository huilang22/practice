/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SupervisorGetRequest.java
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

import com.csgsystems.we.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a SupervisorGetRequest Udt Request
 *
 */

public class SupervisorGetRequest extends SupervisorSubRequestParent {
/**
 *
 * Constructor to create a  SupervisorGetRequest
 * @param id Unique request name
 * @param SupervisorGetIn SupervisorObjectKeyData for SupervisorGetRequest
 *
 */
@JsonCreator
  public SupervisorGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Supervisor")SupervisorObjectKeyData SupervisorGetIn) {
    super(id, "SupervisorGet");
    if (SupervisorGetIn != null) {
      addInput("Supervisor", SupervisorObjectKeyHelper.toMap(SupervisorGetIn, new HashMap(), "SupervisorObjectKeyData").get("SupervisorObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the SupervisorObjectData that results from the SupervisorGetRequest call
 * @return SupervisorObjectData resulting from udt call
 *
 */

  public SupervisorObjectData getOutput() {
    return SupervisorObjectHelper.fromMap(outputMap, "Supervisor");
  }
}
