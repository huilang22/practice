/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftResponseCodeGetRequest.java
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
 * Class used to create a EftResponseCodeGetRequest Udt Request
 *
 */

public class EftResponseCodeGetRequest extends EftResponseCodeSubRequestParent {
/**
 *
 * Constructor to create a  EftResponseCodeGetRequest
 * @param id Unique request name
 * @param ERCGetIn EftResponseCodeObjectKeyData for EftResponseCodeGetRequest
 *
 */
@JsonCreator
  public EftResponseCodeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("EftResponseCode")EftResponseCodeObjectKeyData ERCGetIn) {
    super(id, "EftResponseCodeGet");
    if (ERCGetIn != null) {
      addInput("EftResponseCode", EftResponseCodeObjectKeyHelper.toMap(ERCGetIn, new HashMap(), "EftResponseCodeObjectKeyData").get("EftResponseCodeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EftResponseCodeObjectData that results from the EftResponseCodeGetRequest call
 * @return EftResponseCodeObjectData resulting from udt call
 *
 */

  public EftResponseCodeObjectData getOutput() {
    return EftResponseCodeObjectHelper.fromMap(outputMap, "EftResponseCode");
  }
}
