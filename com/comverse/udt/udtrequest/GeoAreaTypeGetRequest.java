/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaTypeGetRequest.java
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
 * Class used to create a GeoAreaTypeGetRequest Udt Request
 *
 */

public class GeoAreaTypeGetRequest extends GeoAreaTypeSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaTypeGetRequest
 * @param id Unique request name
 * @param gatGetIn GeoAreaTypeObjectKeyData for GeoAreaTypeGetRequest
 *
 */
@JsonCreator
  public GeoAreaTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaType")GeoAreaTypeObjectKeyData gatGetIn) {
    super(id, "GeoAreaTypeGet");
    if (gatGetIn != null) {
      addInput("GeoAreaType", GeoAreaTypeObjectKeyHelper.toMap(gatGetIn, new HashMap(), "GeoAreaTypeObjectKeyData").get("GeoAreaTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GeoAreaTypeObjectData that results from the GeoAreaTypeGetRequest call
 * @return GeoAreaTypeObjectData resulting from udt call
 *
 */

  public GeoAreaTypeObjectData getOutput() {
    return GeoAreaTypeObjectHelper.fromMap(outputMap, "GeoAreaType");
  }
}
