/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaTypeFindRequest.java
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
 * Class used to create a GeoAreaTypeFindRequest Udt Request
 *
 */

public class GeoAreaTypeFindRequest extends GeoAreaTypeRequest {
/**
 *
 * Constructor to create a  GeoAreaTypeFindRequest
 * @param id Unique request name
 * @param gatFindIn GeoAreaTypeObjectFilter for GeoAreaTypeFindRequest
 *
 */
@JsonCreator
  public GeoAreaTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaType")GeoAreaTypeObjectFilter gatFindIn) {
    super(id, "GeoAreaTypeFind");
    if (gatFindIn != null) {
      Integer index =  gatFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GeoAreaType", GeoAreaTypeObjectHelper.toMap(gatFindIn, new HashMap(), "GeoAreaType").get("GeoAreaType"));
    }
  }

/**
 *
 * Retrieves the GeoAreaTypeObjectDataList that results from the GeoAreaTypeFindRequest call
 * @return GeoAreaTypeObjectDataList resulting from udt call
 *
 */

  public GeoAreaTypeObjectDataList getOutput() {
    return GeoAreaTypeObjectHelper.fromMapList(outputMap, "GeoAreaTypeList");
  }
}
