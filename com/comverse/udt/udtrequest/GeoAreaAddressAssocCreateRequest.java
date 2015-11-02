/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaAddressAssocCreateRequest.java
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
 * Class used to create a GeoAreaAddressAssocCreateRequest Udt Request
 *
 */

public class GeoAreaAddressAssocCreateRequest extends GeoAreaAddressAssocSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaAddressAssocCreateRequest
 * @param id Unique request name
 * @param GAAACreateIn GeoAreaAddressAssocObjectData for GeoAreaAddressAssocCreateRequest
 *
 */
@JsonCreator
  public GeoAreaAddressAssocCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaAddressAssoc")GeoAreaAddressAssocObjectData GAAACreateIn) {
    super(id, "GeoAreaAddressAssocCreate");
    if (GAAACreateIn != null) {
      addInput("GeoAreaAddressAssoc", GeoAreaAddressAssocObjectHelper.toMap(GAAACreateIn, new HashMap(), "GeoAreaAddressAssoc").get("GeoAreaAddressAssoc"));
    }
  }

/**
 *
 * Retrieves the GeoAreaAddressAssocObjectData that results from the GeoAreaAddressAssocCreateRequest call
 * @return GeoAreaAddressAssocObjectData resulting from udt call
 *
 */

  public GeoAreaAddressAssocObjectData getOutput() {
    return GeoAreaAddressAssocObjectHelper.fromMap(outputMap, "GeoAreaAddressAssoc");
  }
}
