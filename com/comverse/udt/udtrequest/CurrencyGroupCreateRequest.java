/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CurrencyGroupCreateRequest.java
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
 * Class used to create a CurrencyGroupCreateRequest Udt Request
 *
 */

public class CurrencyGroupCreateRequest extends CurrencyGroupSubRequestParent {
/**
 *
 * Constructor to create a  CurrencyGroupCreateRequest
 * @param id Unique request name
 * @param RCGCreateIn CurrencyGroupObjectData for CurrencyGroupCreateRequest
 *
 */
@JsonCreator
  public CurrencyGroupCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CurrencyGroup")CurrencyGroupObjectData RCGCreateIn) {
    super(id, "CurrencyGroupCreate");
    if (RCGCreateIn != null) {
      addInput("CurrencyGroup", CurrencyGroupObjectHelper.toMap(RCGCreateIn, new HashMap(), "CurrencyGroup").get("CurrencyGroup"));
    }
  }

/**
 *
 * Retrieves the CurrencyGroupObjectData that results from the CurrencyGroupCreateRequest call
 * @return CurrencyGroupObjectData resulting from udt call
 *
 */

  public CurrencyGroupObjectData getOutput() {
    return CurrencyGroupObjectHelper.fromMap(outputMap, "CurrencyGroup");
  }
}
