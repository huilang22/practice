/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryDeleteRequest.java
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
 * Class used to create a GeoAreaBoundaryDeleteRequest Udt Request
 *
 */

public class GeoAreaBoundaryDeleteRequest extends GeoAreaBoundarySubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaBoundaryDeleteRequest
 * @param id Unique request name
 * @param GABDeleteIn GeoAreaBoundaryObjectKeyData for GeoAreaBoundaryDeleteRequest
 *
 */
@JsonCreator
  public GeoAreaBoundaryDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaBoundary")GeoAreaBoundaryObjectKeyData GABDeleteIn) {
    super(id, "GeoAreaBoundaryDelete");
    if (GABDeleteIn != null) {
      addInput("GeoAreaBoundary", GeoAreaBoundaryObjectKeyHelper.toMap(GABDeleteIn, new HashMap(), "GeoAreaBoundaryObjectKeyData").get("GeoAreaBoundaryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GeoAreaBoundaryObjectData that results from the GeoAreaBoundaryDeleteRequest call
 * @return GeoAreaBoundaryObjectData resulting from udt call
 *
 */

  public GeoAreaBoundaryObjectData getOutput() {
    return GeoAreaBoundaryObjectHelper.fromMap(outputMap, "GeoAreaBoundary");
  }
}
