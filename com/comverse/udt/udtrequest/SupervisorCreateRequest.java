/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SupervisorCreateRequest.java
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
 * Class used to create a SupervisorCreateRequest Udt Request
 *
 */

public class SupervisorCreateRequest extends SupervisorSubRequestParent {
/**
 *
 * Constructor to create a  SupervisorCreateRequest
 * @param id Unique request name
 * @param SupervisorCreateIn SupervisorObjectData for SupervisorCreateRequest
 *
 */
@JsonCreator
  public SupervisorCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Supervisor")SupervisorObjectData SupervisorCreateIn) {
    super(id, "SupervisorCreate");
    if (SupervisorCreateIn != null) {
      addInput("Supervisor", SupervisorObjectHelper.toMap(SupervisorCreateIn, new HashMap(), "Supervisor").get("Supervisor"));
    }
  }

/**
 *
 * Retrieves the SupervisorObjectData that results from the SupervisorCreateRequest call
 * @return SupervisorObjectData resulting from udt call
 *
 */

  public SupervisorObjectData getOutput() {
    return SupervisorObjectHelper.fromMap(outputMap, "Supervisor");
  }
}
