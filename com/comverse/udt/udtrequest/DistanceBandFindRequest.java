/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DistanceBandFindRequest.java
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
 * Class used to create a DistanceBandFindRequest Udt Request
 *
 */

public class DistanceBandFindRequest extends DistanceBandRequest {
/**
 *
 * Constructor to create a  DistanceBandFindRequest
 * @param id Unique request name
 * @param DBFindIn DistanceBandObjectFilter for DistanceBandFindRequest
 *
 */
@JsonCreator
  public DistanceBandFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("DistanceBand")DistanceBandObjectFilter DBFindIn) {
    super(id, "DistanceBandFind");
    if (DBFindIn != null) {
      Integer index =  DBFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DistanceBand", DistanceBandObjectHelper.toMap(DBFindIn, new HashMap(), "DistanceBand").get("DistanceBand"));
    }
  }

/**
 *
 * Retrieves the DistanceBandObjectDataList that results from the DistanceBandFindRequest call
 * @return DistanceBandObjectDataList resulting from udt call
 *
 */

  public DistanceBandObjectDataList getOutput() {
    return DistanceBandObjectHelper.fromMapList(outputMap, "DistanceBandList");
  }
}
