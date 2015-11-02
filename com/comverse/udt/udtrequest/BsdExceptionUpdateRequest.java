/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdExceptionUpdateRequest.java
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
 * Class used to create a BsdExceptionUpdateRequest Udt Request
 *
 */

public class BsdExceptionUpdateRequest extends BsdExceptionSubRequestParent {
/**
 *
 * Constructor to create a  BsdExceptionUpdateRequest
 * @param id Unique request name
 * @param BsdExceptionUpdateIn BsdExceptionObjectData for BsdExceptionUpdateRequest
 *
 */
@JsonCreator
  public BsdExceptionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdException")BsdExceptionObjectData BsdExceptionUpdateIn) {
    super(id, "BsdExceptionUpdate");
    if (BsdExceptionUpdateIn != null) {
      addInput("BsdException", BsdExceptionObjectHelper.toMap(BsdExceptionUpdateIn, new HashMap(), "BsdException").get("BsdException"));
    }
  }

/**
 *
 * Retrieves the BsdExceptionObjectData that results from the BsdExceptionUpdateRequest call
 * @return BsdExceptionObjectData resulting from udt call
 *
 */

  public BsdExceptionObjectData getOutput() {
    return BsdExceptionObjectHelper.fromMap(outputMap, "BsdException");
  }
}
