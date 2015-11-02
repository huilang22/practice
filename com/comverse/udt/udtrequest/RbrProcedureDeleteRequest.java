/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrProcedureDeleteRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a RbrProcedureDeleteRequest Udt Request
 *
 */

public class RbrProcedureDeleteRequest extends RbrProcedureSubRequestParent {
/**
 *
 * Constructor to create a  RbrProcedureDeleteRequest
 * @param id Unique request name
 * @param RbrProcDeleteIn RbrProcObjectKeyData for RbrProcedureDeleteRequest
 *
 */
@JsonCreator
  public RbrProcedureDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrProcedure")RbrProcObjectKeyData RbrProcDeleteIn) {
    super(id, "RbrProcedureDelete");
    if (RbrProcDeleteIn != null) {
      addInput("RbrProcedure", RbrProcObjectKeyHelper.toMap(RbrProcDeleteIn, new HashMap(), "RbrProcObjectKeyData").get("RbrProcObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrProcObjectData that results from the RbrProcedureDeleteRequest call
 * @return RbrProcObjectData resulting from udt call
 *
 */

  public RbrProcObjectData getOutput() {
    return RbrProcObjectHelper.fromMap(outputMap, "RbrProcedure");
  }
}
