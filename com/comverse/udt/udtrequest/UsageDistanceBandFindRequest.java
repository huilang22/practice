/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageDistanceBandFindRequest.java
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
 * Class used to create a UsageDistanceBandFindRequest Udt Request
 *
 */

public class UsageDistanceBandFindRequest extends UsageDistanceBandRequest {
/**
 *
 * Constructor to create a  UsageDistanceBandFindRequest
 * @param id Unique request name
 * @param UDBFindIn UsageDistBandObjectFilter for UsageDistanceBandFindRequest
 *
 */
@JsonCreator
  public UsageDistanceBandFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageDistanceBand")UsageDistBandObjectFilter UDBFindIn) {
    super(id, "UsageDistanceBandFind");
    if (UDBFindIn != null) {
      Integer index =  UDBFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageDistanceBand", UsageDistBandObjectHelper.toMap(UDBFindIn, new HashMap(), "UsageDistanceBand").get("UsageDistanceBand"));
    }
  }

/**
 *
 * Retrieves the UsageDistBandObjectDataList that results from the UsageDistanceBandFindRequest call
 * @return UsageDistBandObjectDataList resulting from udt call
 *
 */

  public UsageDistBandObjectDataList getOutput() {
    return UsageDistBandObjectHelper.fromMapList(outputMap, "UsageDistanceBandList");
  }
}
