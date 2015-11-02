/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftResponseCodeDeleteRequest.java
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
 * Class used to create a EftResponseCodeDeleteRequest Udt Request
 *
 */

public class EftResponseCodeDeleteRequest extends EftResponseCodeSubRequestParent {
/**
 *
 * Constructor to create a  EftResponseCodeDeleteRequest
 * @param id Unique request name
 * @param ERCDeleteIn EftResponseCodeObjectKeyData for EftResponseCodeDeleteRequest
 *
 */
@JsonCreator
  public EftResponseCodeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("EftResponseCode")EftResponseCodeObjectKeyData ERCDeleteIn) {
    super(id, "EftResponseCodeDelete");
    if (ERCDeleteIn != null) {
      addInput("EftResponseCode", EftResponseCodeObjectKeyHelper.toMap(ERCDeleteIn, new HashMap(), "EftResponseCodeObjectKeyData").get("EftResponseCodeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EftResponseCodeObjectData that results from the EftResponseCodeDeleteRequest call
 * @return EftResponseCodeObjectData resulting from udt call
 *
 */

  public EftResponseCodeObjectData getOutput() {
    return EftResponseCodeObjectHelper.fromMap(outputMap, "EftResponseCode");
  }
}
