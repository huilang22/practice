/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CurrencyGroupUpdateRequest.java
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
 * Class used to create a CurrencyGroupUpdateRequest Udt Request
 *
 */

public class CurrencyGroupUpdateRequest extends CurrencyGroupSubRequestParent {
/**
 *
 * Constructor to create a  CurrencyGroupUpdateRequest
 * @param id Unique request name
 * @param RCGUpdateIn CurrencyGroupObjectData for CurrencyGroupUpdateRequest
 *
 */
@JsonCreator
  public CurrencyGroupUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CurrencyGroup")CurrencyGroupObjectData RCGUpdateIn) {
    super(id, "CurrencyGroupUpdate");
    if (RCGUpdateIn != null) {
      addInput("CurrencyGroup", CurrencyGroupObjectHelper.toMap(RCGUpdateIn, new HashMap(), "CurrencyGroup").get("CurrencyGroup"));
    }
  }

/**
 *
 * Retrieves the CurrencyGroupObjectData that results from the CurrencyGroupUpdateRequest call
 * @return CurrencyGroupObjectData resulting from udt call
 *
 */

  public CurrencyGroupObjectData getOutput() {
    return CurrencyGroupObjectHelper.fromMap(outputMap, "CurrencyGroup");
  }
}
