/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointRegionDeleteRequest.java
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
 * Class used to create a PointRegionDeleteRequest Udt Request
 *
 */

public class PointRegionDeleteRequest extends PointRegionSubRequestParent {
/**
 *
 * Constructor to create a  PointRegionDeleteRequest
 * @param id Unique request name
 * @param PRDeleteIn PointRegionObjectKeyData for PointRegionDeleteRequest
 *
 */
@JsonCreator
  public PointRegionDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("PointRegion")PointRegionObjectKeyData PRDeleteIn) {
    super(id, "PointRegionDelete");
    if (PRDeleteIn != null) {
      addInput("PointRegion", PointRegionObjectKeyHelper.toMap(PRDeleteIn, new HashMap(), "PointRegionObjectKeyData").get("PointRegionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PointRegionObjectData that results from the PointRegionDeleteRequest call
 * @return PointRegionObjectData resulting from udt call
 *
 */

  public PointRegionObjectData getOutput() {
    return PointRegionObjectHelper.fromMap(outputMap, "PointRegion");
  }
}
