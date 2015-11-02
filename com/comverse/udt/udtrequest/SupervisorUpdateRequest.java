/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SupervisorUpdateRequest.java
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
 * Class used to create a SupervisorUpdateRequest Udt Request
 *
 */

public class SupervisorUpdateRequest extends SupervisorSubRequestParent {
/**
 *
 * Constructor to create a  SupervisorUpdateRequest
 * @param id Unique request name
 * @param SupervisorUpdateIn SupervisorObjectData for SupervisorUpdateRequest
 *
 */
@JsonCreator
  public SupervisorUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Supervisor")SupervisorObjectData SupervisorUpdateIn) {
    super(id, "SupervisorUpdate");
    if (SupervisorUpdateIn != null) {
      addInput("Supervisor", SupervisorObjectHelper.toMap(SupervisorUpdateIn, new HashMap(), "Supervisor").get("Supervisor"));
    }
  }

/**
 *
 * Retrieves the SupervisorObjectData that results from the SupervisorUpdateRequest call
 * @return SupervisorObjectData resulting from udt call
 *
 */

  public SupervisorObjectData getOutput() {
    return SupervisorObjectHelper.fromMap(outputMap, "Supervisor");
  }
}
