/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchInvSourceCreateRequest.java
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

import com.csgsystems.bat.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BatchInvSourceCreateRequest Udt Request
 *
 */

public class BatchInvSourceCreateRequest extends BatchInvSourceSubRequestParent {
/**
 *
 * Constructor to create a  BatchInvSourceCreateRequest
 * @param id Unique request name
 * @param BISCreateIn BISObjectData for BatchInvSourceCreateRequest
 *
 */
@JsonCreator
  public BatchInvSourceCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchInvSource")BISObjectData BISCreateIn) {
    super(id, "BatchInvSourceCreate");
    if (BISCreateIn != null) {
      addInput("BatchInvSource", BISObjectHelper.toMap(BISCreateIn, new HashMap(), "BatchInvSource").get("BatchInvSource"));
    }
  }

/**
 *
 * Retrieves the BISObjectData that results from the BatchInvSourceCreateRequest call
 * @return BISObjectData resulting from udt call
 *
 */

  public BISObjectData getOutput() {
    return BISObjectHelper.fromMap(outputMap, "BatchInvSource");
  }
}
