/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryConditionDeleteRequest.java
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
 * Class used to create a GeoAreaBoundaryConditionDeleteRequest Udt Request
 *
 */

public class GeoAreaBoundaryConditionDeleteRequest extends GeoAreaBoundaryConditionSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaBoundaryConditionDeleteRequest
 * @param id Unique request name
 * @param GABCDeleteIn GeoAreaBoundaryConditionObjectKeyData for GeoAreaBoundaryConditionDeleteRequest
 *
 */
@JsonCreator
  public GeoAreaBoundaryConditionDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaBoundaryCondition")GeoAreaBoundaryConditionObjectKeyData GABCDeleteIn) {
    super(id, "GeoAreaBoundaryConditionDelete");
    if (GABCDeleteIn != null) {
      addInput("GeoAreaBoundaryCondition", GeoAreaBoundaryConditionObjectKeyHelper.toMap(GABCDeleteIn, new HashMap(), "GeoAreaBoundaryConditionObjectKeyData").get("GeoAreaBoundaryConditionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GeoAreaBoundaryConditionObjectData that results from the GeoAreaBoundaryConditionDeleteRequest call
 * @return GeoAreaBoundaryConditionObjectData resulting from udt call
 *
 */

  public GeoAreaBoundaryConditionObjectData getOutput() {
    return GeoAreaBoundaryConditionObjectHelper.fromMap(outputMap, "GeoAreaBoundaryCondition");
  }
}
