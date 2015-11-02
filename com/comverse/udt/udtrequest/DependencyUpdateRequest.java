/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyUpdateRequest.java
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
 * Class used to create a DependencyUpdateRequest Udt Request
 *
 */

public class DependencyUpdateRequest extends DependencySubRequestParent {
/**
 *
 * Constructor to create a  DependencyUpdateRequest
 * @param id Unique request name
 * @param depUpdIn DependencyObjectData for DependencyUpdateRequest
 *
 */
@JsonCreator
  public DependencyUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Dependency")DependencyObjectData depUpdIn) {
    super(id, "DependencyUpdate");
    if (depUpdIn != null) {
      addInput("Dependency", DependencyObjectHelper.toMap(depUpdIn, new HashMap(), "Dependency").get("Dependency"));
    }
  }

/**
 *
 * Retrieves the DependencyObjectData that results from the DependencyUpdateRequest call
 * @return DependencyObjectData resulting from udt call
 *
 */

  public DependencyObjectData getOutput() {
    return DependencyObjectHelper.fromMap(outputMap, "Dependency");
  }
}
