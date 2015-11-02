/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaFindByAddressRequest.java
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
 * Class used to create a GeoAreaFindByAddressRequest Udt Request
 *
 */

public class GeoAreaFindByAddressRequest extends GeoAreaRequest {
/**
 *
 * Constructor to create a  GeoAreaFindByAddressRequest
 * @param id Unique request name
 * @param addressId BigInteger for GeoAreaFindByAddressRequest
 * @param geoAreaTypeId Integer for GeoAreaFindByAddressRequest
 * @param languageCode Integer for GeoAreaFindByAddressRequest
 *
 */
@JsonCreator
  public GeoAreaFindByAddressRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressId")BigInteger addressId, @JsonProperty("GeoAreaTypeId")Integer geoAreaTypeId, @JsonProperty("LanguageCode")Integer languageCode) {
    super(id, "GeoAreaFindByAddress");
    if (addressId != null) {
      addInput("AddressId", addressId);
    }
    if (geoAreaTypeId != null) {
      addInput("GeoAreaTypeId", geoAreaTypeId);
    }
    if (languageCode != null) {
      addInput("LanguageCode", languageCode);
    }
  }

/**
 *
 * Retrieves the GAObjectDataList that results from the GeoAreaFindByAddressRequest call
 * @return GAObjectDataList resulting from udt call
 *
 */

  public GAObjectDataList getOutput() {
    return GAObjectHelper.fromMapList(outputMap, "GeoAreaList");
  }
}
