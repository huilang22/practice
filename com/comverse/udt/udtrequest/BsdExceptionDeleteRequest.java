/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdExceptionDeleteRequest.java
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
 * Class used to create a BsdExceptionDeleteRequest Udt Request
 *
 */

public class BsdExceptionDeleteRequest extends BsdExceptionSubRequestParent {
/**
 *
 * Constructor to create a  BsdExceptionDeleteRequest
 * @param id Unique request name
 * @param BsdExceptionDeleteIn BsdExceptionObjectData for BsdExceptionDeleteRequest
 *
 */
@JsonCreator
  public BsdExceptionDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdException")BsdExceptionObjectData BsdExceptionDeleteIn) {
    super(id, "BsdExceptionDelete");
    if (BsdExceptionDeleteIn != null) {
      addInput("BsdException", BsdExceptionObjectHelper.toMap(BsdExceptionDeleteIn, new HashMap(), "BsdException").get("BsdException"));
    }
  }

/**
 *
 * Retrieves the BsdExceptionObjectData that results from the BsdExceptionDeleteRequest call
 * @return BsdExceptionObjectData resulting from udt call
 *
 */

  public BsdExceptionObjectData getOutput() {
    return BsdExceptionObjectHelper.fromMap(outputMap, "BsdException");
  }
}
