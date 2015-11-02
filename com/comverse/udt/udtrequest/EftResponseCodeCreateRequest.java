/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftResponseCodeCreateRequest.java
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
 * Class used to create a EftResponseCodeCreateRequest Udt Request
 *
 */

public class EftResponseCodeCreateRequest extends EftResponseCodeSubRequestParent {
/**
 *
 * Constructor to create a  EftResponseCodeCreateRequest
 * @param id Unique request name
 * @param ERCCreateIn EftResponseCodeObjectData for EftResponseCodeCreateRequest
 *
 */
@JsonCreator
  public EftResponseCodeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("EftResponseCode")EftResponseCodeObjectData ERCCreateIn) {
    super(id, "EftResponseCodeCreate");
    if (ERCCreateIn != null) {
      addInput("EftResponseCode", EftResponseCodeObjectHelper.toMap(ERCCreateIn, new HashMap(), "EftResponseCode").get("EftResponseCode"));
    }
  }

/**
 *
 * Retrieves the EftResponseCodeObjectData that results from the EftResponseCodeCreateRequest call
 * @return EftResponseCodeObjectData resulting from udt call
 *
 */

  public EftResponseCodeObjectData getOutput() {
    return EftResponseCodeObjectHelper.fromMap(outputMap, "EftResponseCode");
  }
}
