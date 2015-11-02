/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptFormatsGetRequest.java
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
 * Class used to create a BillFmtOptFormatsGetRequest Udt Request
 *
 */

public class BillFmtOptFormatsGetRequest extends BillFmtOptFormatsSubRequestParent {
/**
 *
 * Constructor to create a  BillFmtOptFormatsGetRequest
 * @param id Unique request name
 * @param BillFmtOptFormatsGetIn BillFmtOptFormatsObjectKeyData for BillFmtOptFormatsGetRequest
 *
 */
@JsonCreator
  public BillFmtOptFormatsGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillFmtOptFormats")BillFmtOptFormatsObjectKeyData BillFmtOptFormatsGetIn) {
    super(id, "BillFmtOptFormatsGet");
    if (BillFmtOptFormatsGetIn != null) {
      addInput("BillFmtOptFormats", BillFmtOptFormatsObjectKeyHelper.toMap(BillFmtOptFormatsGetIn, new HashMap(), "BillFmtOptFormatsObjectKeyData").get("BillFmtOptFormatsObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BillFmtOptFormatsObjectData that results from the BillFmtOptFormatsGetRequest call
 * @return BillFmtOptFormatsObjectData resulting from udt call
 *
 */

  public BillFmtOptFormatsObjectData getOutput() {
    return BillFmtOptFormatsObjectHelper.fromMap(outputMap, "BillFmtOptFormats");
  }
}
