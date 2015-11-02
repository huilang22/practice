/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaServiceabilityUpdateRequest.java
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
 * Class used to create a GeoAreaServiceabilityUpdateRequest Udt Request
 *
 */

public class GeoAreaServiceabilityUpdateRequest extends GeoAreaServiceabilitySubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaServiceabilityUpdateRequest
 * @param id Unique request name
 * @param GeoAreaSvcUpdateIn GASObjData for GeoAreaServiceabilityUpdateRequest
 *
 */
@JsonCreator
  public GeoAreaServiceabilityUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaServiceability")GASObjData GeoAreaSvcUpdateIn) {
    super(id, "GeoAreaServiceabilityUpdate");
    if (GeoAreaSvcUpdateIn != null) {
      addInput("GeoAreaServiceability", GASObjHelper.toMap(GeoAreaSvcUpdateIn, new HashMap(), "GeoAreaServiceability").get("GeoAreaServiceability"));
    }
  }

/**
 *
 * Retrieves the GASObjData that results from the GeoAreaServiceabilityUpdateRequest call
 * @return GASObjData resulting from udt call
 *
 */

  public GASObjData getOutput() {
    return GASObjHelper.fromMap(outputMap, "GeoAreaServiceability");
  }
}
