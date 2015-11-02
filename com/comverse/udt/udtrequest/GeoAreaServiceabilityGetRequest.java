/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaServiceabilityGetRequest.java
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
 * Class used to create a GeoAreaServiceabilityGetRequest Udt Request
 *
 */

public class GeoAreaServiceabilityGetRequest extends GeoAreaServiceabilitySubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaServiceabilityGetRequest
 * @param id Unique request name
 * @param GeoAreaSvcGetIn GASObjKeyData for GeoAreaServiceabilityGetRequest
 *
 */
@JsonCreator
  public GeoAreaServiceabilityGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaServiceability")GASObjKeyData GeoAreaSvcGetIn) {
    super(id, "GeoAreaServiceabilityGet");
    if (GeoAreaSvcGetIn != null) {
      addInput("GeoAreaServiceability", GASObjKeyHelper.toMap(GeoAreaSvcGetIn, new HashMap(), "GASObjKeyData").get("GASObjKeyData"));
    }
  }

/**
 *
 * Retrieves the GASObjData that results from the GeoAreaServiceabilityGetRequest call
 * @return GASObjData resulting from udt call
 *
 */

  public GASObjData getOutput() {
    return GASObjHelper.fromMap(outputMap, "GeoAreaServiceability");
  }
}
