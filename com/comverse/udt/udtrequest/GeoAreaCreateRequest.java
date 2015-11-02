/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaCreateRequest.java
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
 * Class used to create a GeoAreaCreateRequest Udt Request
 *
 */

public class GeoAreaCreateRequest extends GeoAreaSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaCreateRequest
 * @param id Unique request name
 * @param GACreateIn GAObjectData for GeoAreaCreateRequest
 *
 */
@JsonCreator
  public GeoAreaCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoArea")GAObjectData GACreateIn) {
    super(id, "GeoAreaCreate");
    if (GACreateIn != null) {
      addInput("GeoArea", GAObjectHelper.toMap(GACreateIn, new HashMap(), "GeoArea").get("GeoArea"));
    }
  }

/**
 *
 * Retrieves the GAObjectData that results from the GeoAreaCreateRequest call
 * @return GAObjectData resulting from udt call
 *
 */

  public GAObjectData getOutput() {
    return GAObjectHelper.fromMap(outputMap, "GeoArea");
  }
}
