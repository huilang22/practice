/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaServiceabilityCreateRequest.java
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
 * Class used to create a GeoAreaServiceabilityCreateRequest Udt Request
 *
 */

public class GeoAreaServiceabilityCreateRequest extends GeoAreaServiceabilitySubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaServiceabilityCreateRequest
 * @param id Unique request name
 * @param GeoAreaSvcCreateIn GASObjData for GeoAreaServiceabilityCreateRequest
 *
 */
@JsonCreator
  public GeoAreaServiceabilityCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaServiceability")GASObjData GeoAreaSvcCreateIn) {
    super(id, "GeoAreaServiceabilityCreate");
    if (GeoAreaSvcCreateIn != null) {
      addInput("GeoAreaServiceability", GASObjHelper.toMap(GeoAreaSvcCreateIn, new HashMap(), "GeoAreaServiceability").get("GeoAreaServiceability"));
    }
  }

/**
 *
 * Retrieves the GASObjData that results from the GeoAreaServiceabilityCreateRequest call
 * @return GASObjData resulting from udt call
 *
 */

  public GASObjData getOutput() {
    return GASObjHelper.fromMap(outputMap, "GeoAreaServiceability");
  }
}
