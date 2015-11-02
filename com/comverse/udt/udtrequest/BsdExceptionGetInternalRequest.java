/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdExceptionGetInternalRequest.java
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
 * Class used to create a BsdExceptionGetInternalRequest Udt Request
 *
 */

public class BsdExceptionGetInternalRequest extends BsdExceptionSubRequestParent {
/**
 *
 * Constructor to create a  BsdExceptionGetInternalRequest
 * @param id Unique request name
 * @param BsdExceptionGetIn BsdExceptionObjectKeyData for BsdExceptionGetInternalRequest
 *
 */
@JsonCreator
  public BsdExceptionGetInternalRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdException")BsdExceptionObjectKeyData BsdExceptionGetIn) {
    super(id, "BsdExceptionGetInternal");
    if (BsdExceptionGetIn != null) {
      addInput("BsdException", BsdExceptionObjectKeyHelper.toMap(BsdExceptionGetIn, new HashMap(), "BsdExceptionObjectKeyData").get("BsdExceptionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdExceptionObjectData that results from the BsdExceptionGetInternalRequest call
 * @return BsdExceptionObjectData resulting from udt call
 *
 */

  public BsdExceptionObjectData getOutput() {
    return BsdExceptionObjectHelper.fromMap(outputMap, "BsdException");
  }
}
