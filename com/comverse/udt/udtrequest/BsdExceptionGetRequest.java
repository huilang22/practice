/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdExceptionGetRequest.java
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

import com.csgsystems.sfq.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BsdExceptionGetRequest Udt Request
 *
 */

public class BsdExceptionGetRequest extends BsdExceptionSubRequestParent {
/**
 *
 * Constructor to create a  BsdExceptionGetRequest
 * @param id Unique request name
 * @param BsdExceptionGetExtIn BsdExceptionObjectKeyData for BsdExceptionGetRequest
 *
 */
@JsonCreator
  public BsdExceptionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdException")BsdExceptionObjectKeyData BsdExceptionGetExtIn) {
    super(id, "BsdExceptionGet");
    if (BsdExceptionGetExtIn != null) {
      addInput("BsdException", BsdExceptionObjectKeyHelper.toMap(BsdExceptionGetExtIn, new HashMap(), "BsdExceptionObjectKeyData").get("BsdExceptionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdExceptionObjectData that results from the BsdExceptionGetRequest call
 * @return BsdExceptionObjectData resulting from udt call
 *
 */

  public BsdExceptionObjectData getOutput() {
    return BsdExceptionObjectHelper.fromMap(outputMap, "BsdException");
  }
}
