/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUnitCrFindRequest.java
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
 * Class used to create a RateUnitCrFindRequest Udt Request
 *
 */

public class RateUnitCrFindRequest extends RateUnitCrRequest {
/**
 *
 * Constructor to create a  RateUnitCrFindRequest
 * @param id Unique request name
 * @param rucFindIn RateUnitCrObjectFilter for RateUnitCrFindRequest
 *
 */
@JsonCreator
  public RateUnitCrFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateUnitCr")RateUnitCrObjectFilter rucFindIn) {
    super(id, "RateUnitCrFind");
    if (rucFindIn != null) {
      Integer index =  rucFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateUnitCr", RateUnitCrObjectHelper.toMap(rucFindIn, new HashMap(), "RateUnitCr").get("RateUnitCr"));
    }
  }

/**
 *
 * Retrieves the RateUnitCrObjectDataList that results from the RateUnitCrFindRequest call
 * @return RateUnitCrObjectDataList resulting from udt call
 *
 */

  public RateUnitCrObjectDataList getOutput() {
    return RateUnitCrObjectHelper.fromMapList(outputMap, "RateUnitCrList");
  }
}
