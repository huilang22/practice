/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DistanceBandDeleteRequest.java
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
 * Class used to create a DistanceBandDeleteRequest Udt Request
 *
 */

public class DistanceBandDeleteRequest extends DistanceBandSubRequestParent {
/**
 *
 * Constructor to create a  DistanceBandDeleteRequest
 * @param id Unique request name
 * @param DBDeleteIn DistanceBandObjectKeyData for DistanceBandDeleteRequest
 *
 */
@JsonCreator
  public DistanceBandDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("DistanceBand")DistanceBandObjectKeyData DBDeleteIn) {
    super(id, "DistanceBandDelete");
    if (DBDeleteIn != null) {
      addInput("DistanceBand", DistanceBandObjectKeyHelper.toMap(DBDeleteIn, new HashMap(), "DistanceBandObjectKeyData").get("DistanceBandObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DistanceBandObjectData that results from the DistanceBandDeleteRequest call
 * @return DistanceBandObjectData resulting from udt call
 *
 */

  public DistanceBandObjectData getOutput() {
    return DistanceBandObjectHelper.fromMap(outputMap, "DistanceBand");
  }
}
