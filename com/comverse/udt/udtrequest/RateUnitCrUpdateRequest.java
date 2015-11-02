/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUnitCrUpdateRequest.java
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
 * Class used to create a RateUnitCrUpdateRequest Udt Request
 *
 */

public class RateUnitCrUpdateRequest extends RateUnitCrSubRequestParent {
/**
 *
 * Constructor to create a  RateUnitCrUpdateRequest
 * @param id Unique request name
 * @param RateUnitCrUpdateIn RateUnitCrObjectData for RateUnitCrUpdateRequest
 * @param RateUnitCrUpdateFilter RateUnitCrObjectFilter for RateUnitCrUpdateRequest
 * @param RateUnitCrUpdateGet RateUnitCrObjectData for RateUnitCrUpdateRequest
 *
 */
@JsonCreator
  public RateUnitCrUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateUnitCr")RateUnitCrObjectData RateUnitCrUpdateIn, @JsonProperty("RateUnitCrUpdateFilter")RateUnitCrObjectFilter RateUnitCrUpdateFilter, @JsonProperty("RateUnitCrUpdateGet")RateUnitCrObjectData RateUnitCrUpdateGet) {
    super(id, "RateUnitCrUpdate");
    if (RateUnitCrUpdateIn != null) {
      addInput("RateUnitCr", RateUnitCrObjectHelper.toMap(RateUnitCrUpdateIn, new HashMap(), "RateUnitCr").get("RateUnitCr"));
    }
    if (RateUnitCrUpdateFilter != null) {
      Integer index =  RateUnitCrUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateUnitCrUpdateFilter", RateUnitCrObjectHelper.toMap(RateUnitCrUpdateFilter, new HashMap(), "RateUnitCr").get("RateUnitCr"));
    }
    if (RateUnitCrUpdateGet != null) {
      addInput("RateUnitCrUpdateGet", RateUnitCrObjectHelper.toMap(RateUnitCrUpdateGet, new HashMap(), "RateUnitCr").get("RateUnitCr"));
    }
  }

/**
 *
 * Retrieves the RateUnitCrObjectData that results from the RateUnitCrUpdateRequest call
 * @return RateUnitCrObjectData resulting from udt call
 *
 */

  public RateUnitCrObjectData getOutput() {
    return RateUnitCrObjectHelper.fromMap(outputMap, "RateUnitCr");
  }
}
