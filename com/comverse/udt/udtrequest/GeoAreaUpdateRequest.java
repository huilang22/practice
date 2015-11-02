/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaUpdateRequest.java
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
 * Class used to create a GeoAreaUpdateRequest Udt Request
 *
 */

public class GeoAreaUpdateRequest extends GeoAreaSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaUpdateRequest
 * @param id Unique request name
 * @param GAUpdateIn GAObjectData for GeoAreaUpdateRequest
 *
 */
@JsonCreator
  public GeoAreaUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoArea")GAObjectData GAUpdateIn) {
    super(id, "GeoAreaUpdate");
    if (GAUpdateIn != null) {
      addInput("GeoArea", GAObjectHelper.toMap(GAUpdateIn, new HashMap(), "GeoArea").get("GeoArea"));
    }
  }

/**
 *
 * Retrieves the GAObjectData that results from the GeoAreaUpdateRequest call
 * @return GAObjectData resulting from udt call
 *
 */

  public GAObjectData getOutput() {
    return GAObjectHelper.fromMap(outputMap, "GeoArea");
  }
}
