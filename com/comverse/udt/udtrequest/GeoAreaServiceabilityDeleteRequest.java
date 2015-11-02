/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaServiceabilityDeleteRequest.java
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
 * Class used to create a GeoAreaServiceabilityDeleteRequest Udt Request
 *
 */

public class GeoAreaServiceabilityDeleteRequest extends GeoAreaServiceabilitySubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaServiceabilityDeleteRequest
 * @param id Unique request name
 * @param GeoAreaSvcDeleteIn GASObjKeyData for GeoAreaServiceabilityDeleteRequest
 *
 */
@JsonCreator
  public GeoAreaServiceabilityDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaServiceability")GASObjKeyData GeoAreaSvcDeleteIn) {
    super(id, "GeoAreaServiceabilityDelete");
    if (GeoAreaSvcDeleteIn != null) {
      addInput("GeoAreaServiceability", GASObjKeyHelper.toMap(GeoAreaSvcDeleteIn, new HashMap(), "GASObjKeyData").get("GASObjKeyData"));
    }
  }

/**
 *
 * Retrieves the GASObjData that results from the GeoAreaServiceabilityDeleteRequest call
 * @return GASObjData resulting from udt call
 *
 */

  public GASObjData getOutput() {
    return GASObjHelper.fromMap(outputMap, "GeoAreaServiceability");
  }
}
