/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseUpdateRequest.java
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
 * Class used to create a ClearingHouseUpdateRequest Udt Request
 *
 */

public class ClearingHouseUpdateRequest extends ClearingHouseSubRequestParent {
/**
 *
 * Constructor to create a  ClearingHouseUpdateRequest
 * @param id Unique request name
 * @param CHIUpdateIn ClearingHouseObjectData for ClearingHouseUpdateRequest
 *
 */
@JsonCreator
  public ClearingHouseUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ClearingHouse")ClearingHouseObjectData CHIUpdateIn) {
    super(id, "ClearingHouseUpdate");
    if (CHIUpdateIn != null) {
      addInput("ClearingHouse", ClearingHouseObjectHelper.toMap(CHIUpdateIn, new HashMap(), "ClearingHouse").get("ClearingHouse"));
    }
  }

/**
 *
 * Retrieves the ClearingHouseObjectData that results from the ClearingHouseUpdateRequest call
 * @return ClearingHouseObjectData resulting from udt call
 *
 */

  public ClearingHouseObjectData getOutput() {
    return ClearingHouseObjectHelper.fromMap(outputMap, "ClearingHouse");
  }
}
