/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryCreateRequest.java
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
 * Class used to create a GeoAreaBoundaryCreateRequest Udt Request
 *
 */

public class GeoAreaBoundaryCreateRequest extends GeoAreaBoundarySubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaBoundaryCreateRequest
 * @param id Unique request name
 * @param GABCreateIn GeoAreaBoundaryObjectData for GeoAreaBoundaryCreateRequest
 *
 */
@JsonCreator
  public GeoAreaBoundaryCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaBoundary")GeoAreaBoundaryObjectData GABCreateIn) {
    super(id, "GeoAreaBoundaryCreate");
    if (GABCreateIn != null) {
      addInput("GeoAreaBoundary", GeoAreaBoundaryObjectHelper.toMap(GABCreateIn, new HashMap(), "GeoAreaBoundary").get("GeoAreaBoundary"));
    }
  }

/**
 *
 * Retrieves the GeoAreaBoundaryObjectData that results from the GeoAreaBoundaryCreateRequest call
 * @return GeoAreaBoundaryObjectData resulting from udt call
 *
 */

  public GeoAreaBoundaryObjectData getOutput() {
    return GeoAreaBoundaryObjectHelper.fromMap(outputMap, "GeoAreaBoundary");
  }
}
