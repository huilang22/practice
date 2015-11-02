/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftResponseCodeUpdateRequest.java
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
 * Class used to create a EftResponseCodeUpdateRequest Udt Request
 *
 */

public class EftResponseCodeUpdateRequest extends EftResponseCodeSubRequestParent {
/**
 *
 * Constructor to create a  EftResponseCodeUpdateRequest
 * @param id Unique request name
 * @param ERCUpdateIn EftResponseCodeObjectData for EftResponseCodeUpdateRequest
 *
 */
@JsonCreator
  public EftResponseCodeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("EftResponseCode")EftResponseCodeObjectData ERCUpdateIn) {
    super(id, "EftResponseCodeUpdate");
    if (ERCUpdateIn != null) {
      addInput("EftResponseCode", EftResponseCodeObjectHelper.toMap(ERCUpdateIn, new HashMap(), "EftResponseCode").get("EftResponseCode"));
    }
  }

/**
 *
 * Retrieves the EftResponseCodeObjectData that results from the EftResponseCodeUpdateRequest call
 * @return EftResponseCodeObjectData resulting from udt call
 *
 */

  public EftResponseCodeObjectData getOutput() {
    return EftResponseCodeObjectHelper.fromMap(outputMap, "EftResponseCode");
  }
}
