/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConvertGeocodeRequest.java
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
 * Class used to create a ConvertGeocodeRequest Udt Request
 *
 */

public class ConvertGeocodeRequest extends GeocodeRequest {
/**
 *
 * Constructor to create a  ConvertGeocodeRequest
 * @param id Unique request name
 * @param CountryCode Integer for ConvertGeocodeRequest
 * @param FranchiseCode Integer for ConvertGeocodeRequest
 * @param VertexGeocode String for ConvertGeocodeRequest
 *
 */
@JsonCreator
  public ConvertGeocodeRequest(@JsonProperty("RequestId") String id, @JsonProperty("CountryCode")Integer CountryCode, @JsonProperty("FranchiseCode")Integer FranchiseCode, @JsonProperty("VertexGeocode")String VertexGeocode) {
    super(id, "ConvertGeocode");
    if (CountryCode != null) {
      addInput("CountryCode", CountryCode);
    }
    if (FranchiseCode != null) {
      addInput("FranchiseCode", FranchiseCode);
    }
    if (VertexGeocode != null) {
      addInput("VertexGeocode", VertexGeocode);
    }
  }

/**
 *
 * Retrieves the String that results from the ConvertGeocodeRequest call
 * @return String resulting from udt call
 *
 */

  public String getOutput() {
    return  (String)outputMap.get("FXgeocode");
  }
}
