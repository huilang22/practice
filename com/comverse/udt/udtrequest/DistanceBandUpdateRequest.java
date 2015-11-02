/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DistanceBandUpdateRequest.java
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
 * Class used to create a DistanceBandUpdateRequest Udt Request
 *
 */

public class DistanceBandUpdateRequest extends DistanceBandSubRequestParent {
/**
 *
 * Constructor to create a  DistanceBandUpdateRequest
 * @param id Unique request name
 * @param DBUpdateIn DistanceBandObjectData for DistanceBandUpdateRequest
 *
 */
@JsonCreator
  public DistanceBandUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("DistanceBand")DistanceBandObjectData DBUpdateIn) {
    super(id, "DistanceBandUpdate");
    if (DBUpdateIn != null) {
      addInput("DistanceBand", DistanceBandObjectHelper.toMap(DBUpdateIn, new HashMap(), "DistanceBand").get("DistanceBand"));
    }
  }

/**
 *
 * Retrieves the DistanceBandObjectData that results from the DistanceBandUpdateRequest call
 * @return DistanceBandObjectData resulting from udt call
 *
 */

  public DistanceBandObjectData getOutput() {
    return DistanceBandObjectHelper.fromMap(outputMap, "DistanceBand");
  }
}
