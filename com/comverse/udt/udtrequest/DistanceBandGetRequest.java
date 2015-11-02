/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DistanceBandGetRequest.java
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
 * Class used to create a DistanceBandGetRequest Udt Request
 *
 */

public class DistanceBandGetRequest extends DistanceBandSubRequestParent {
/**
 *
 * Constructor to create a  DistanceBandGetRequest
 * @param id Unique request name
 * @param DBGetIn DistanceBandObjectKeyData for DistanceBandGetRequest
 *
 */
@JsonCreator
  public DistanceBandGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("DistanceBand")DistanceBandObjectKeyData DBGetIn) {
    super(id, "DistanceBandGet");
    if (DBGetIn != null) {
      addInput("DistanceBand", DistanceBandObjectKeyHelper.toMap(DBGetIn, new HashMap(), "DistanceBandObjectKeyData").get("DistanceBandObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DistanceBandObjectData that results from the DistanceBandGetRequest call
 * @return DistanceBandObjectData resulting from udt call
 *
 */

  public DistanceBandObjectData getOutput() {
    return DistanceBandObjectHelper.fromMap(outputMap, "DistanceBand");
  }
}
