/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyCreateRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a DependencyCreateRequest Udt Request
 *
 */

public class DependencyCreateRequest extends DependencySubRequestParent {
/**
 *
 * Constructor to create a  DependencyCreateRequest
 * @param id Unique request name
 * @param depCrIn DependencyObjectData for DependencyCreateRequest
 *
 */
@JsonCreator
  public DependencyCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Dependency")DependencyObjectData depCrIn) {
    super(id, "DependencyCreate");
    if (depCrIn != null) {
      addInput("Dependency", DependencyObjectHelper.toMap(depCrIn, new HashMap(), "Dependency").get("Dependency"));
    }
  }

/**
 *
 * Retrieves the DependencyObjectData that results from the DependencyCreateRequest call
 * @return DependencyObjectData resulting from udt call
 *
 */

  public DependencyObjectData getOutput() {
    return DependencyObjectHelper.fromMap(outputMap, "Dependency");
  }
}
