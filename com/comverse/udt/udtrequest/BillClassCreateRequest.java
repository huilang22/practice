/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillClassCreateRequest.java
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
 * Class used to create a BillClassCreateRequest Udt Request
 *
 */

public class BillClassCreateRequest extends BillClassSubRequestParent {
/**
 *
 * Constructor to create a  BillClassCreateRequest
 * @param id Unique request name
 * @param BCCreateIn BCObjectData for BillClassCreateRequest
 *
 */
@JsonCreator
  public BillClassCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillClass")BCObjectData BCCreateIn) {
    super(id, "BillClassCreate");
    if (BCCreateIn != null) {
      addInput("BillClass", BCObjectHelper.toMap(BCCreateIn, new HashMap(), "BillClass").get("BillClass"));
    }
  }

/**
 *
 * Retrieves the BCObjectData that results from the BillClassCreateRequest call
 * @return BCObjectData resulting from udt call
 *
 */

  public BCObjectData getOutput() {
    return BCObjectHelper.fromMap(outputMap, "BillClass");
  }
}
