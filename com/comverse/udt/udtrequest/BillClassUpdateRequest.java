/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillClassUpdateRequest.java
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
 * Class used to create a BillClassUpdateRequest Udt Request
 *
 */

public class BillClassUpdateRequest extends BillClassSubRequestParent {
/**
 *
 * Constructor to create a  BillClassUpdateRequest
 * @param id Unique request name
 * @param BCUpdateIn BCObjectData for BillClassUpdateRequest
 *
 */
@JsonCreator
  public BillClassUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillClass")BCObjectData BCUpdateIn) {
    super(id, "BillClassUpdate");
    if (BCUpdateIn != null) {
      addInput("BillClass", BCObjectHelper.toMap(BCUpdateIn, new HashMap(), "BillClass").get("BillClass"));
    }
  }

/**
 *
 * Retrieves the BCObjectData that results from the BillClassUpdateRequest call
 * @return BCObjectData resulting from udt call
 *
 */

  public BCObjectData getOutput() {
    return BCObjectHelper.fromMap(outputMap, "BillClass");
  }
}
