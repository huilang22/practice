/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptFormatsCreateRequest.java
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
 * Class used to create a BillFmtOptFormatsCreateRequest Udt Request
 *
 */

public class BillFmtOptFormatsCreateRequest extends BillFmtOptFormatsSubRequestParent {
/**
 *
 * Constructor to create a  BillFmtOptFormatsCreateRequest
 * @param id Unique request name
 * @param BillFmtOptFormatsCreateIn BillFmtOptFormatsObjectData for BillFmtOptFormatsCreateRequest
 *
 */
@JsonCreator
  public BillFmtOptFormatsCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillFmtOptFormats")BillFmtOptFormatsObjectData BillFmtOptFormatsCreateIn) {
    super(id, "BillFmtOptFormatsCreate");
    if (BillFmtOptFormatsCreateIn != null) {
      addInput("BillFmtOptFormats", BillFmtOptFormatsObjectHelper.toMap(BillFmtOptFormatsCreateIn, new HashMap(), "BillFmtOptFormats").get("BillFmtOptFormats"));
    }
  }

/**
 *
 * Retrieves the BillFmtOptFormatsObjectData that results from the BillFmtOptFormatsCreateRequest call
 * @return BillFmtOptFormatsObjectData resulting from udt call
 *
 */

  public BillFmtOptFormatsObjectData getOutput() {
    return BillFmtOptFormatsObjectHelper.fromMap(outputMap, "BillFmtOptFormats");
  }
}
