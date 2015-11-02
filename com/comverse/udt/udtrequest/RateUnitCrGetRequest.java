/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUnitCrGetRequest.java
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
 * Class used to create a RateUnitCrGetRequest Udt Request
 *
 */

public class RateUnitCrGetRequest extends RateUnitCrSubRequestParent {
/**
 *
 * Constructor to create a  RateUnitCrGetRequest
 * @param id Unique request name
 * @param rucGetIn RateUnitCrObjectKeyData for RateUnitCrGetRequest
 *
 */
@JsonCreator
  public RateUnitCrGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateUnitCr")RateUnitCrObjectKeyData rucGetIn) {
    super(id, "RateUnitCrGet");
    if (rucGetIn != null) {
      addInput("RateUnitCr", RateUnitCrObjectKeyHelper.toMap(rucGetIn, new HashMap(), "RateUnitCrObjectKeyData").get("RateUnitCrObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RateUnitCrObjectData that results from the RateUnitCrGetRequest call
 * @return RateUnitCrObjectData resulting from udt call
 *
 */

  public RateUnitCrObjectData getOutput() {
    return RateUnitCrObjectHelper.fromMap(outputMap, "RateUnitCr");
  }
}
