/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaGetRequest.java
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
 * Class used to create a GeoAreaGetRequest Udt Request
 *
 */

public class GeoAreaGetRequest extends GeoAreaSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaGetRequest
 * @param id Unique request name
 * @param GAGetIn GAObjectKeyData for GeoAreaGetRequest
 *
 */
@JsonCreator
  public GeoAreaGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoArea")GAObjectKeyData GAGetIn) {
    super(id, "GeoAreaGet");
    if (GAGetIn != null) {
      addInput("GeoArea", GAObjectKeyHelper.toMap(GAGetIn, new HashMap(), "GAObjectKeyData").get("GAObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GAObjectData that results from the GeoAreaGetRequest call
 * @return GAObjectData resulting from udt call
 *
 */

  public GAObjectData getOutput() {
    return GAObjectHelper.fromMap(outputMap, "GeoArea");
  }
}
