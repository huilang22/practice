/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillClassGetRequest.java
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
 * Class used to create a BillClassGetRequest Udt Request
 *
 */

public class BillClassGetRequest extends BillClassSubRequestParent {
/**
 *
 * Constructor to create a  BillClassGetRequest
 * @param id Unique request name
 * @param BCGetIn BCObjectKeyData for BillClassGetRequest
 *
 */
@JsonCreator
  public BillClassGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillClass")BCObjectKeyData BCGetIn) {
    super(id, "BillClassGet");
    if (BCGetIn != null) {
      addInput("BillClass", BCObjectKeyHelper.toMap(BCGetIn, new HashMap(), "BCObjectKeyData").get("BCObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BCObjectData that results from the BillClassGetRequest call
 * @return BCObjectData resulting from udt call
 *
 */

  public BCObjectData getOutput() {
    return BCObjectHelper.fromMap(outputMap, "BillClass");
  }
}
