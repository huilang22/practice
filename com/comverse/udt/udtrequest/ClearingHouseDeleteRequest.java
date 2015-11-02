/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseDeleteRequest.java
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
 * Class used to create a ClearingHouseDeleteRequest Udt Request
 *
 */

public class ClearingHouseDeleteRequest extends ClearingHouseSubRequestParent {
/**
 *
 * Constructor to create a  ClearingHouseDeleteRequest
 * @param id Unique request name
 * @param CHIDeleteIn ClearingHouseObjectKeyData for ClearingHouseDeleteRequest
 *
 */
@JsonCreator
  public ClearingHouseDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ClearingHouse")ClearingHouseObjectKeyData CHIDeleteIn) {
    super(id, "ClearingHouseDelete");
    if (CHIDeleteIn != null) {
      addInput("ClearingHouse", ClearingHouseObjectKeyHelper.toMap(CHIDeleteIn, new HashMap(), "ClearingHouseObjectKeyData").get("ClearingHouseObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ClearingHouseObjectData that results from the ClearingHouseDeleteRequest call
 * @return ClearingHouseObjectData resulting from udt call
 *
 */

  public ClearingHouseObjectData getOutput() {
    return ClearingHouseObjectHelper.fromMap(outputMap, "ClearingHouse");
  }
}
