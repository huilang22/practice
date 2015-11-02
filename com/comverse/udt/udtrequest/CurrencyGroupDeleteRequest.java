/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CurrencyGroupDeleteRequest.java
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
 * Class used to create a CurrencyGroupDeleteRequest Udt Request
 *
 */

public class CurrencyGroupDeleteRequest extends CurrencyGroupSubRequestParent {
/**
 *
 * Constructor to create a  CurrencyGroupDeleteRequest
 * @param id Unique request name
 * @param RCGDeleteIn CurrencyGroupObjectKeyData for CurrencyGroupDeleteRequest
 *
 */
@JsonCreator
  public CurrencyGroupDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CurrencyGroup")CurrencyGroupObjectKeyData RCGDeleteIn) {
    super(id, "CurrencyGroupDelete");
    if (RCGDeleteIn != null) {
      addInput("CurrencyGroup", CurrencyGroupObjectKeyHelper.toMap(RCGDeleteIn, new HashMap(), "CurrencyGroupObjectKeyData").get("CurrencyGroupObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CurrencyGroupObjectData that results from the CurrencyGroupDeleteRequest call
 * @return CurrencyGroupObjectData resulting from udt call
 *
 */

  public CurrencyGroupObjectData getOutput() {
    return CurrencyGroupObjectHelper.fromMap(outputMap, "CurrencyGroup");
  }
}
