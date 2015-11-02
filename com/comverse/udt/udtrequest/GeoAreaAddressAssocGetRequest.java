/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaAddressAssocGetRequest.java
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
 * Class used to create a GeoAreaAddressAssocGetRequest Udt Request
 *
 */

public class GeoAreaAddressAssocGetRequest extends GeoAreaAddressAssocSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaAddressAssocGetRequest
 * @param id Unique request name
 * @param GAAAGetIn GeoAreaAddressAssocObjectKeyData for GeoAreaAddressAssocGetRequest
 *
 */
@JsonCreator
  public GeoAreaAddressAssocGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaAddressAssoc")GeoAreaAddressAssocObjectKeyData GAAAGetIn) {
    super(id, "GeoAreaAddressAssocGet");
    if (GAAAGetIn != null) {
      addInput("GeoAreaAddressAssoc", GeoAreaAddressAssocObjectKeyHelper.toMap(GAAAGetIn, new HashMap(), "GeoAreaAddressAssocObjectKeyData").get("GeoAreaAddressAssocObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GeoAreaAddressAssocObjectData that results from the GeoAreaAddressAssocGetRequest call
 * @return GeoAreaAddressAssocObjectData resulting from udt call
 *
 */

  public GeoAreaAddressAssocObjectData getOutput() {
    return GeoAreaAddressAssocObjectHelper.fromMap(outputMap, "GeoAreaAddressAssoc");
  }
}
