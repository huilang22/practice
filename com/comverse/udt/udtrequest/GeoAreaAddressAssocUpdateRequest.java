/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaAddressAssocUpdateRequest.java
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
 * Class used to create a GeoAreaAddressAssocUpdateRequest Udt Request
 *
 */

public class GeoAreaAddressAssocUpdateRequest extends GeoAreaAddressAssocSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaAddressAssocUpdateRequest
 * @param id Unique request name
 * @param GAAAUpdateIn GeoAreaAddressAssocObjectData for GeoAreaAddressAssocUpdateRequest
 *
 */
@JsonCreator
  public GeoAreaAddressAssocUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaAddressAssoc")GeoAreaAddressAssocObjectData GAAAUpdateIn) {
    super(id, "GeoAreaAddressAssocUpdate");
    if (GAAAUpdateIn != null) {
      addInput("GeoAreaAddressAssoc", GeoAreaAddressAssocObjectHelper.toMap(GAAAUpdateIn, new HashMap(), "GeoAreaAddressAssoc").get("GeoAreaAddressAssoc"));
    }
  }

/**
 *
 * Retrieves the GeoAreaAddressAssocObjectData that results from the GeoAreaAddressAssocUpdateRequest call
 * @return GeoAreaAddressAssocObjectData resulting from udt call
 *
 */

  public GeoAreaAddressAssocObjectData getOutput() {
    return GeoAreaAddressAssocObjectHelper.fromMap(outputMap, "GeoAreaAddressAssoc");
  }
}
