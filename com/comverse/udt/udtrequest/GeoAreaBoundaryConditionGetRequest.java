/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryConditionGetRequest.java
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
 * Class used to create a GeoAreaBoundaryConditionGetRequest Udt Request
 *
 */

public class GeoAreaBoundaryConditionGetRequest extends GeoAreaBoundaryConditionSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaBoundaryConditionGetRequest
 * @param id Unique request name
 * @param GABCGetIn GeoAreaBoundaryConditionObjectKeyData for GeoAreaBoundaryConditionGetRequest
 *
 */
@JsonCreator
  public GeoAreaBoundaryConditionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaBoundaryCondition")GeoAreaBoundaryConditionObjectKeyData GABCGetIn) {
    super(id, "GeoAreaBoundaryConditionGet");
    if (GABCGetIn != null) {
      addInput("GeoAreaBoundaryCondition", GeoAreaBoundaryConditionObjectKeyHelper.toMap(GABCGetIn, new HashMap(), "GeoAreaBoundaryConditionObjectKeyData").get("GeoAreaBoundaryConditionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GeoAreaBoundaryConditionObjectData that results from the GeoAreaBoundaryConditionGetRequest call
 * @return GeoAreaBoundaryConditionObjectData resulting from udt call
 *
 */

  public GeoAreaBoundaryConditionObjectData getOutput() {
    return GeoAreaBoundaryConditionObjectHelper.fromMap(outputMap, "GeoAreaBoundaryCondition");
  }
}
