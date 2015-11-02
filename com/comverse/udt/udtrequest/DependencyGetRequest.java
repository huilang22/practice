/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyGetRequest.java
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
 * Class used to create a DependencyGetRequest Udt Request
 *
 */

public class DependencyGetRequest extends DependencySubRequestParent {
/**
 *
 * Constructor to create a  DependencyGetRequest
 * @param id Unique request name
 * @param depGetIn DependencyObjectKeyData for DependencyGetRequest
 *
 */
@JsonCreator
  public DependencyGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Dependency")DependencyObjectKeyData depGetIn) {
    super(id, "DependencyGet");
    if (depGetIn != null) {
      addInput("Dependency", DependencyObjectKeyHelper.toMap(depGetIn, new HashMap(), "DependencyObjectKeyData").get("DependencyObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DependencyObjectData that results from the DependencyGetRequest call
 * @return DependencyObjectData resulting from udt call
 *
 */

  public DependencyObjectData getOutput() {
    return DependencyObjectHelper.fromMap(outputMap, "Dependency");
  }
}
