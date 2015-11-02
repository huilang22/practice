/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvModJobCreateRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvModJobCreateRequest Udt Request
 *
 */

public class InvModJobCreateRequest extends InvModJobSubRequestParent {
/**
 *
 * Constructor to create a  InvModJobCreateRequest
 * @param id Unique request name
 * @param InvModJobCreateIn InvModJobObjectData for InvModJobCreateRequest
 *
 */
@JsonCreator
  public InvModJobCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvModJob")InvModJobObjectData InvModJobCreateIn) {
    super(id, "InvModJobCreate");
    if (InvModJobCreateIn != null) {
      addInput("InvModJob", InvModJobObjectHelper.toMap(InvModJobCreateIn, new HashMap(), "InvModJob").get("InvModJob"));
    }
  }

/**
 *
 * Retrieves the InvModJobObjectData that results from the InvModJobCreateRequest call
 * @return InvModJobObjectData resulting from udt call
 *
 */

  public InvModJobObjectData getOutput() {
    return InvModJobObjectHelper.fromMap(outputMap, "InvModJob");
  }
}
