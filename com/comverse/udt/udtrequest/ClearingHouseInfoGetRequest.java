/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseInfoGetRequest.java
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
 * Class used to create a ClearingHouseInfoGetRequest Udt Request
 *
 */

public class ClearingHouseInfoGetRequest extends ClearingHouseInfoSubRequestParent {
/**
 *
 * Constructor to create a  ClearingHouseInfoGetRequest
 * @param id Unique request name
 * @param CHIGetIn ClearingHouseInfoObjectKeyData for ClearingHouseInfoGetRequest
 *
 */
@JsonCreator
  public ClearingHouseInfoGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ClearingHouseInfo")ClearingHouseInfoObjectKeyData CHIGetIn) {
    super(id, "ClearingHouseInfoGet");
    if (CHIGetIn != null) {
      addInput("ClearingHouseInfo", ClearingHouseInfoObjectKeyHelper.toMap(CHIGetIn, new HashMap(), "ClearingHouseInfoObjectKeyData").get("ClearingHouseInfoObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ClearingHouseInfoObjectData that results from the ClearingHouseInfoGetRequest call
 * @return ClearingHouseInfoObjectData resulting from udt call
 *
 */

  public ClearingHouseInfoObjectData getOutput() {
    return ClearingHouseInfoObjectHelper.fromMap(outputMap, "ClearingHouseInfo");
  }
}
