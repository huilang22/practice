/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryConditionUpdateRequest.java
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
 * Class used to create a GeoAreaBoundaryConditionUpdateRequest Udt Request
 *
 */

public class GeoAreaBoundaryConditionUpdateRequest extends GeoAreaBoundaryConditionSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaBoundaryConditionUpdateRequest
 * @param id Unique request name
 * @param GABCUpdateIn GeoAreaBoundaryConditionObjectData for GeoAreaBoundaryConditionUpdateRequest
 *
 */
@JsonCreator
  public GeoAreaBoundaryConditionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaBoundaryCondition")GeoAreaBoundaryConditionObjectData GABCUpdateIn) {
    super(id, "GeoAreaBoundaryConditionUpdate");
    if (GABCUpdateIn != null) {
      addInput("GeoAreaBoundaryCondition", GeoAreaBoundaryConditionObjectHelper.toMap(GABCUpdateIn, new HashMap(), "GeoAreaBoundaryCondition").get("GeoAreaBoundaryCondition"));
    }
  }

/**
 *
 * Retrieves the GeoAreaBoundaryConditionObjectData that results from the GeoAreaBoundaryConditionUpdateRequest call
 * @return GeoAreaBoundaryConditionObjectData resulting from udt call
 *
 */

  public GeoAreaBoundaryConditionObjectData getOutput() {
    return GeoAreaBoundaryConditionObjectHelper.fromMap(outputMap, "GeoAreaBoundaryCondition");
  }
}
