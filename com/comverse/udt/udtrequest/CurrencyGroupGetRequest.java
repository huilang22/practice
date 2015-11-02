/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CurrencyGroupGetRequest.java
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
 * Class used to create a CurrencyGroupGetRequest Udt Request
 *
 */

public class CurrencyGroupGetRequest extends CurrencyGroupSubRequestParent {
/**
 *
 * Constructor to create a  CurrencyGroupGetRequest
 * @param id Unique request name
 * @param RCGGetIn CurrencyGroupObjectKeyData for CurrencyGroupGetRequest
 *
 */
@JsonCreator
  public CurrencyGroupGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CurrencyGroup")CurrencyGroupObjectKeyData RCGGetIn) {
    super(id, "CurrencyGroupGet");
    if (RCGGetIn != null) {
      addInput("CurrencyGroup", CurrencyGroupObjectKeyHelper.toMap(RCGGetIn, new HashMap(), "CurrencyGroupObjectKeyData").get("CurrencyGroupObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CurrencyGroupObjectData that results from the CurrencyGroupGetRequest call
 * @return CurrencyGroupObjectData resulting from udt call
 *
 */

  public CurrencyGroupObjectData getOutput() {
    return CurrencyGroupObjectHelper.fromMap(outputMap, "CurrencyGroup");
  }
}
