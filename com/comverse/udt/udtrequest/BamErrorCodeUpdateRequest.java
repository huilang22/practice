/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BamErrorCodeUpdateRequest.java
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
 * Class used to create a BamErrorCodeUpdateRequest Udt Request
 *
 */

public class BamErrorCodeUpdateRequest extends BamErrorCodeSubRequestParent {
/**
 *
 * Constructor to create a  BamErrorCodeUpdateRequest
 * @param id Unique request name
 * @param BECUpdateIn BECObjectData for BamErrorCodeUpdateRequest
 *
 */
@JsonCreator
  public BamErrorCodeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BamErrorCode")BECObjectData BECUpdateIn) {
    super(id, "BamErrorCodeUpdate");
    if (BECUpdateIn != null) {
      addInput("BamErrorCode", BECObjectHelper.toMap(BECUpdateIn, new HashMap(), "BamErrorCode").get("BamErrorCode"));
    }
  }

/**
 *
 * Retrieves the BECObjectData that results from the BamErrorCodeUpdateRequest call
 * @return BECObjectData resulting from udt call
 *
 */

  public BECObjectData getOutput() {
    return BECObjectHelper.fromMap(outputMap, "BamErrorCode");
  }
}
