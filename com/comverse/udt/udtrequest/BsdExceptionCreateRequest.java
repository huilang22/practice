/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdExceptionCreateRequest.java
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
 * Class used to create a BsdExceptionCreateRequest Udt Request
 *
 */

public class BsdExceptionCreateRequest extends BsdExceptionSubRequestParent {
/**
 *
 * Constructor to create a  BsdExceptionCreateRequest
 * @param id Unique request name
 * @param BsdExceptionCreateIn BsdExceptionObjectData for BsdExceptionCreateRequest
 *
 */
@JsonCreator
  public BsdExceptionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdException")BsdExceptionObjectData BsdExceptionCreateIn) {
    super(id, "BsdExceptionCreate");
    if (BsdExceptionCreateIn != null) {
      addInput("BsdException", BsdExceptionObjectHelper.toMap(BsdExceptionCreateIn, new HashMap(), "BsdException").get("BsdException"));
    }
  }

/**
 *
 * Retrieves the BsdExceptionObjectData that results from the BsdExceptionCreateRequest call
 * @return BsdExceptionObjectData resulting from udt call
 *
 */

  public BsdExceptionObjectData getOutput() {
    return BsdExceptionObjectHelper.fromMap(outputMap, "BsdException");
  }
}
