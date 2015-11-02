/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BoundaryGetRequest.java
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

import com.csgsystems.svbl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BoundaryGetRequest Udt Request
 *
 */

public class BoundaryGetRequest extends BoundarySubRequestParent {
/**
 *
 * Constructor to create a  BoundaryGetRequest
 * @param id Unique request name
 * @param BoundaryGetIn BoundaryObjectKeyData for BoundaryGetRequest
 *
 */
@JsonCreator
  public BoundaryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Boundary")BoundaryObjectKeyData BoundaryGetIn) {
    super(id, "BoundaryGet");
    if (BoundaryGetIn != null) {
      addInput("Boundary", BoundaryObjectKeyHelper.toMap(BoundaryGetIn, new HashMap(), "BoundaryObjectKeyData").get("BoundaryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BoundaryObjectData that results from the BoundaryGetRequest call
 * @return BoundaryObjectData resulting from udt call
 *
 */

  public BoundaryObjectData getOutput() {
    return BoundaryObjectHelper.fromMap(outputMap, "Boundary");
  }
}
