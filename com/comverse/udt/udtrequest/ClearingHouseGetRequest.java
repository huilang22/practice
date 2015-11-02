/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseGetRequest.java
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
 * Class used to create a ClearingHouseGetRequest Udt Request
 *
 */

public class ClearingHouseGetRequest extends ClearingHouseSubRequestParent {
/**
 *
 * Constructor to create a  ClearingHouseGetRequest
 * @param id Unique request name
 * @param CHIGetIn ClearingHouseObjectKeyData for ClearingHouseGetRequest
 *
 */
@JsonCreator
  public ClearingHouseGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ClearingHouse")ClearingHouseObjectKeyData CHIGetIn) {
    super(id, "ClearingHouseGet");
    if (CHIGetIn != null) {
      addInput("ClearingHouse", ClearingHouseObjectKeyHelper.toMap(CHIGetIn, new HashMap(), "ClearingHouseObjectKeyData").get("ClearingHouseObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ClearingHouseObjectData that results from the ClearingHouseGetRequest call
 * @return ClearingHouseObjectData resulting from udt call
 *
 */

  public ClearingHouseObjectData getOutput() {
    return ClearingHouseObjectHelper.fromMap(outputMap, "ClearingHouse");
  }
}
