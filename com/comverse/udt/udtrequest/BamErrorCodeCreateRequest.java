/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BamErrorCodeCreateRequest.java
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
 * Class used to create a BamErrorCodeCreateRequest Udt Request
 *
 */

public class BamErrorCodeCreateRequest extends BamErrorCodeSubRequestParent {
/**
 *
 * Constructor to create a  BamErrorCodeCreateRequest
 * @param id Unique request name
 * @param BECCreateIn BECObjectData for BamErrorCodeCreateRequest
 *
 */
@JsonCreator
  public BamErrorCodeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BamErrorCode")BECObjectData BECCreateIn) {
    super(id, "BamErrorCodeCreate");
    if (BECCreateIn != null) {
      addInput("BamErrorCode", BECObjectHelper.toMap(BECCreateIn, new HashMap(), "BamErrorCode").get("BamErrorCode"));
    }
  }

/**
 *
 * Retrieves the BECObjectData that results from the BamErrorCodeCreateRequest call
 * @return BECObjectData resulting from udt call
 *
 */

  public BECObjectData getOutput() {
    return BECObjectHelper.fromMap(outputMap, "BamErrorCode");
  }
}
