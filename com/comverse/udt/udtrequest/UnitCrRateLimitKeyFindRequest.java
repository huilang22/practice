/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitKeyFindRequest.java
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
 * Class used to create a UnitCrRateLimitKeyFindRequest Udt Request
 *
 */

public class UnitCrRateLimitKeyFindRequest extends UnitCrRateLimitKeyRequest {
/**
 *
 * Constructor to create a  UnitCrRateLimitKeyFindRequest
 * @param id Unique request name
 * @param UnitCrRateLimitKeysFindIn UnitCrRateLimitKeysObjectFilter for UnitCrRateLimitKeyFindRequest
 *
 */
@JsonCreator
  public UnitCrRateLimitKeyFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrRateLimitKey")UnitCrRateLimitKeysObjectFilter UnitCrRateLimitKeysFindIn) {
    super(id, "UnitCrRateLimitKeyFind");
    if (UnitCrRateLimitKeysFindIn != null) {
      Integer index =  UnitCrRateLimitKeysFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectHelper.toMap(UnitCrRateLimitKeysFindIn, new HashMap(), "UnitCrRateLimitKey").get("UnitCrRateLimitKey"));
    }
  }

/**
 *
 * Retrieves the UnitCrRateLimitKeysObjectDataList that results from the UnitCrRateLimitKeyFindRequest call
 * @return UnitCrRateLimitKeysObjectDataList resulting from udt call
 *
 */

  public UnitCrRateLimitKeysObjectDataList getOutput() {
    return UnitCrRateLimitKeysObjectHelper.fromMapList(outputMap, "UnitCrRateLimitKeyList");
  }
}
