/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptFormatsUpdateRequest.java
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
 * Class used to create a BillFmtOptFormatsUpdateRequest Udt Request
 *
 */

public class BillFmtOptFormatsUpdateRequest extends BillFmtOptFormatsSubRequestParent {
/**
 *
 * Constructor to create a  BillFmtOptFormatsUpdateRequest
 * @param id Unique request name
 * @param BillFmtOptFormatsUpdateIn BillFmtOptFormatsObjectData for BillFmtOptFormatsUpdateRequest
 *
 */
@JsonCreator
  public BillFmtOptFormatsUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillFmtOptFormats")BillFmtOptFormatsObjectData BillFmtOptFormatsUpdateIn) {
    super(id, "BillFmtOptFormatsUpdate");
    if (BillFmtOptFormatsUpdateIn != null) {
      addInput("BillFmtOptFormats", BillFmtOptFormatsObjectHelper.toMap(BillFmtOptFormatsUpdateIn, new HashMap(), "BillFmtOptFormats").get("BillFmtOptFormats"));
    }
  }

/**
 *
 * Retrieves the BillFmtOptFormatsObjectData that results from the BillFmtOptFormatsUpdateRequest call
 * @return BillFmtOptFormatsObjectData resulting from udt call
 *
 */

  public BillFmtOptFormatsObjectData getOutput() {
    return BillFmtOptFormatsObjectHelper.fromMap(outputMap, "BillFmtOptFormats");
  }
}
