/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DistanceBandCreateRequest.java
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
 * Class used to create a DistanceBandCreateRequest Udt Request
 *
 */

public class DistanceBandCreateRequest extends DistanceBandSubRequestParent {
/**
 *
 * Constructor to create a  DistanceBandCreateRequest
 * @param id Unique request name
 * @param DBCreateIn DistanceBandObjectData for DistanceBandCreateRequest
 *
 */
@JsonCreator
  public DistanceBandCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("DistanceBand")DistanceBandObjectData DBCreateIn) {
    super(id, "DistanceBandCreate");
    if (DBCreateIn != null) {
      addInput("DistanceBand", DistanceBandObjectHelper.toMap(DBCreateIn, new HashMap(), "DistanceBand").get("DistanceBand"));
    }
  }

/**
 *
 * Retrieves the DistanceBandObjectData that results from the DistanceBandCreateRequest call
 * @return DistanceBandObjectData resulting from udt call
 *
 */

  public DistanceBandObjectData getOutput() {
    return DistanceBandObjectHelper.fromMap(outputMap, "DistanceBand");
  }
}
