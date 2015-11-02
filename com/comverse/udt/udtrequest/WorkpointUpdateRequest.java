/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkpointUpdateRequest.java
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

import com.csgsystems.wp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a WorkpointUpdateRequest Udt Request
 *
 */

public class WorkpointUpdateRequest extends WorkpointRequest {
/**
 *
 * Constructor to create a  WorkpointUpdateRequest
 * @param id Unique request name
 * @param _WorkpointUpdate WorkpointObjectData for WorkpointUpdateRequest
 *
 */
@JsonCreator
  public WorkpointUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("WorkpointUpdate")WorkpointObjectData _WorkpointUpdate) {
    super(id, "WorkpointUpdate");
    if (_WorkpointUpdate != null) {
      addInput("WorkpointUpdate", WorkpointObjectHelper.toMap(_WorkpointUpdate, new HashMap(), "Void").get("Void"));
    }
  }

}
