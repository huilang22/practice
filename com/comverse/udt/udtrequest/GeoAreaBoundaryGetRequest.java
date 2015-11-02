/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryGetRequest.java
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
 * Class used to create a GeoAreaBoundaryGetRequest Udt Request
 *
 */

public class GeoAreaBoundaryGetRequest extends GeoAreaBoundarySubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaBoundaryGetRequest
 * @param id Unique request name
 * @param GABGetIn GeoAreaBoundaryObjectKeyData for GeoAreaBoundaryGetRequest
 *
 */
@JsonCreator
  public GeoAreaBoundaryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaBoundary")GeoAreaBoundaryObjectKeyData GABGetIn) {
    super(id, "GeoAreaBoundaryGet");
    if (GABGetIn != null) {
      addInput("GeoAreaBoundary", GeoAreaBoundaryObjectKeyHelper.toMap(GABGetIn, new HashMap(), "GeoAreaBoundaryObjectKeyData").get("GeoAreaBoundaryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GeoAreaBoundaryObjectData that results from the GeoAreaBoundaryGetRequest call
 * @return GeoAreaBoundaryObjectData resulting from udt call
 *
 */

  public GeoAreaBoundaryObjectData getOutput() {
    return GeoAreaBoundaryObjectHelper.fromMap(outputMap, "GeoAreaBoundary");
  }
}
