/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryUpdateRequest.java
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
 * Class used to create a GeoAreaBoundaryUpdateRequest Udt Request
 *
 */

public class GeoAreaBoundaryUpdateRequest extends GeoAreaBoundarySubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaBoundaryUpdateRequest
 * @param id Unique request name
 * @param GABUpdateIn GeoAreaBoundaryObjectData for GeoAreaBoundaryUpdateRequest
 *
 */
@JsonCreator
  public GeoAreaBoundaryUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaBoundary")GeoAreaBoundaryObjectData GABUpdateIn) {
    super(id, "GeoAreaBoundaryUpdate");
    if (GABUpdateIn != null) {
      addInput("GeoAreaBoundary", GeoAreaBoundaryObjectHelper.toMap(GABUpdateIn, new HashMap(), "GeoAreaBoundary").get("GeoAreaBoundary"));
    }
  }

/**
 *
 * Retrieves the GeoAreaBoundaryObjectData that results from the GeoAreaBoundaryUpdateRequest call
 * @return GeoAreaBoundaryObjectData resulting from udt call
 *
 */

  public GeoAreaBoundaryObjectData getOutput() {
    return GeoAreaBoundaryObjectHelper.fromMap(outputMap, "GeoAreaBoundary");
  }
}
