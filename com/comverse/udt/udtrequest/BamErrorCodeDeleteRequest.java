/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BamErrorCodeDeleteRequest.java
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
 * Class used to create a BamErrorCodeDeleteRequest Udt Request
 *
 */

public class BamErrorCodeDeleteRequest extends BamErrorCodeSubRequestParent {
/**
 *
 * Constructor to create a  BamErrorCodeDeleteRequest
 * @param id Unique request name
 * @param BECDeleteIn BECObjectKeyData for BamErrorCodeDeleteRequest
 *
 */
@JsonCreator
  public BamErrorCodeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BamErrorCode")BECObjectKeyData BECDeleteIn) {
    super(id, "BamErrorCodeDelete");
    if (BECDeleteIn != null) {
      addInput("BamErrorCode", BECObjectKeyHelper.toMap(BECDeleteIn, new HashMap(), "BECObjectKeyData").get("BECObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BECObjectData that results from the BamErrorCodeDeleteRequest call
 * @return BECObjectData resulting from udt call
 *
 */

  public BECObjectData getOutput() {
    return BECObjectHelper.fromMap(outputMap, "BamErrorCode");
  }
}
