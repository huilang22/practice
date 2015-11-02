/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BamErrorCodeGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BamErrorCodeGetRequest Udt Request
 *
 */

public class BamErrorCodeGetRequest extends BamErrorCodeSubRequestParent {
/**
 *
 * Constructor to create a  BamErrorCodeGetRequest
 * @param id Unique request name
 * @param BECGetIn BECObjectKeyData for BamErrorCodeGetRequest
 *
 */
@JsonCreator
  public BamErrorCodeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BamErrorCode")BECObjectKeyData BECGetIn) {
    super(id, "BamErrorCodeGet");
    if (BECGetIn != null) {
      addInput("BamErrorCode", BECObjectKeyHelper.toMap(BECGetIn, new HashMap(), "BECObjectKeyData").get("BECObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BECObjectData that results from the BamErrorCodeGetRequest call
 * @return BECObjectData resulting from udt call
 *
 */

  public BECObjectData getOutput() {
    return BECObjectHelper.fromMap(outputMap, "BamErrorCode");
  }
}
