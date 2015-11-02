/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryConditionCreateRequest.java
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
 * Class used to create a GeoAreaBoundaryConditionCreateRequest Udt Request
 *
 */

public class GeoAreaBoundaryConditionCreateRequest extends GeoAreaBoundaryConditionSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaBoundaryConditionCreateRequest
 * @param id Unique request name
 * @param GABCCreateIn GeoAreaBoundaryConditionObjectData for GeoAreaBoundaryConditionCreateRequest
 *
 */
@JsonCreator
  public GeoAreaBoundaryConditionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaBoundaryCondition")GeoAreaBoundaryConditionObjectData GABCCreateIn) {
    super(id, "GeoAreaBoundaryConditionCreate");
    if (GABCCreateIn != null) {
      addInput("GeoAreaBoundaryCondition", GeoAreaBoundaryConditionObjectHelper.toMap(GABCCreateIn, new HashMap(), "GeoAreaBoundaryCondition").get("GeoAreaBoundaryCondition"));
    }
  }

/**
 *
 * Retrieves the GeoAreaBoundaryConditionObjectData that results from the GeoAreaBoundaryConditionCreateRequest call
 * @return GeoAreaBoundaryConditionObjectData resulting from udt call
 *
 */

  public GeoAreaBoundaryConditionObjectData getOutput() {
    return GeoAreaBoundaryConditionObjectHelper.fromMap(outputMap, "GeoAreaBoundaryCondition");
  }
}
