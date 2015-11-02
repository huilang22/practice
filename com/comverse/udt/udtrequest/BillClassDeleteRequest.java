/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillClassDeleteRequest.java
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
 * Class used to create a BillClassDeleteRequest Udt Request
 *
 */

public class BillClassDeleteRequest extends BillClassSubRequestParent {
/**
 *
 * Constructor to create a  BillClassDeleteRequest
 * @param id Unique request name
 * @param BCDeleteIn BCObjectKeyData for BillClassDeleteRequest
 *
 */
@JsonCreator
  public BillClassDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillClass")BCObjectKeyData BCDeleteIn) {
    super(id, "BillClassDelete");
    if (BCDeleteIn != null) {
      addInput("BillClass", BCObjectKeyHelper.toMap(BCDeleteIn, new HashMap(), "BCObjectKeyData").get("BCObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BCObjectData that results from the BillClassDeleteRequest call
 * @return BCObjectData resulting from udt call
 *
 */

  public BCObjectData getOutput() {
    return BCObjectHelper.fromMap(outputMap, "BillClass");
  }
}
