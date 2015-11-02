/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeocodeFindRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a GeocodeFindRequest Udt Request
 *
 */

public class GeocodeFindRequest extends GeocodeRequest {
/**
 *
 * Constructor to create a  GeocodeFindRequest
 * @param id Unique request name
 * @param GeocodeAddress GeocodeAddressObjectData for GeocodeFindRequest
 *
 */
@JsonCreator
  public GeocodeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeocodeAddress")GeocodeAddressObjectData GeocodeAddress) {
    super(id, "GeocodeFind");
    if (GeocodeAddress != null) {
      addInput("GeocodeAddress", GeocodeAddressObjectHelper.toMap(GeocodeAddress, new HashMap(), "Geocode").get("Geocode"));
    }
  }

/**
 *
 * Retrieves the GeocodeObjectDataList that results from the GeocodeFindRequest call
 * @return GeocodeObjectDataList resulting from udt call
 *
 */

  public GeocodeObjectDataList getOutput() {
    return GeocodeObjectHelper.fromMapList(outputMap, "GeocodeList");
  }
}
