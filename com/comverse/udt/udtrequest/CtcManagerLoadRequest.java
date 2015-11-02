/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcManagerLoadRequest.java
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

import com.csgsystems.ctc.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtcManagerLoadRequest Udt Request
 *
 */

public class CtcManagerLoadRequest extends CtcManagerRequest {
/**
 *
 * Constructor to create a  CtcManagerLoadRequest
 * @param id Unique request name
 * @param CtcManagerLoadIn CtcManagerLoadObjectData for CtcManagerLoadRequest
 *
 */
@JsonCreator
  public CtcManagerLoadRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcManagerLoadIn")CtcManagerLoadObjectData CtcManagerLoadIn) {
    super(id, "CtcManagerLoad");
    if (CtcManagerLoadIn != null) {
      addInput("CtcManagerLoadIn", CtcManagerLoadObjectHelper.toMap(CtcManagerLoadIn, new HashMap(), "BatchId").get("BatchId"));
    }
  }

/**
 *
 * Retrieves the BigInteger that results from the CtcManagerLoadRequest call
 * @return BigInteger resulting from udt call
 *
 */

  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("BatchId");
  }
}
