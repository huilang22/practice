/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseCreateRequest.java
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
 * Class used to create a ClearingHouseCreateRequest Udt Request
 *
 */

public class ClearingHouseCreateRequest extends ClearingHouseSubRequestParent {
/**
 *
 * Constructor to create a  ClearingHouseCreateRequest
 * @param id Unique request name
 * @param CHICreateIn ClearingHouseObjectData for ClearingHouseCreateRequest
 *
 */
@JsonCreator
  public ClearingHouseCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ClearingHouse")ClearingHouseObjectData CHICreateIn) {
    super(id, "ClearingHouseCreate");
    if (CHICreateIn != null) {
      addInput("ClearingHouse", ClearingHouseObjectHelper.toMap(CHICreateIn, new HashMap(), "ClearingHouse").get("ClearingHouse"));
    }
  }

/**
 *
 * Retrieves the ClearingHouseObjectData that results from the ClearingHouseCreateRequest call
 * @return ClearingHouseObjectData resulting from udt call
 *
 */

  public ClearingHouseObjectData getOutput() {
    return ClearingHouseObjectHelper.fromMap(outputMap, "ClearingHouse");
  }
}
