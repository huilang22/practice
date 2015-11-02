/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageDistanceBandUpdateRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a UsageDistanceBandUpdateRequest Udt Request
 *
 */

public class UsageDistanceBandUpdateRequest extends UsageDistanceBandSubRequestParent {
/**
 *
 * Constructor to create a  UsageDistanceBandUpdateRequest
 * @param id Unique request name
 * @param UDBUpdateIn UsageDistBandObjectData for UsageDistanceBandUpdateRequest
 * @param UDBUpdateFilter UsageDistBandObjectFilter for UsageDistanceBandUpdateRequest
 * @param UDBUpdateGet UsageDistBandObjectData for UsageDistanceBandUpdateRequest
 *
 */
@JsonCreator
  public UsageDistanceBandUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageDistanceBand")UsageDistBandObjectData UDBUpdateIn, @JsonProperty("UDBUpdateFilter")UsageDistBandObjectFilter UDBUpdateFilter, @JsonProperty("UDBUpdateGet")UsageDistBandObjectData UDBUpdateGet) {
    super(id, "UsageDistanceBandUpdate");
    if (UDBUpdateIn != null) {
      addInput("UsageDistanceBand", UsageDistBandObjectHelper.toMap(UDBUpdateIn, new HashMap(), "UsageDistanceBand").get("UsageDistanceBand"));
    }
    if (UDBUpdateFilter != null) {
      Integer index =  UDBUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UDBUpdateFilter", UsageDistBandObjectHelper.toMap(UDBUpdateFilter, new HashMap(), "UsageDistanceBand").get("UsageDistanceBand"));
    }
    if (UDBUpdateGet != null) {
      addInput("UDBUpdateGet", UsageDistBandObjectHelper.toMap(UDBUpdateGet, new HashMap(), "UsageDistanceBand").get("UsageDistanceBand"));
    }
  }

/**
 *
 * Retrieves the UsageDistBandObjectData that results from the UsageDistanceBandUpdateRequest call
 * @return UsageDistBandObjectData resulting from udt call
 *
 */

  public UsageDistBandObjectData getOutput() {
    return UsageDistBandObjectHelper.fromMap(outputMap, "UsageDistanceBand");
  }
}
