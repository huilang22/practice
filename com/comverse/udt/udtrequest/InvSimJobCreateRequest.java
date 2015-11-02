/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimJobCreateRequest.java
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
 * Class used to create a InvSimJobCreateRequest Udt Request
 *
 */

public class InvSimJobCreateRequest extends InvSimJobSubRequestParent {
/**
 *
 * Constructor to create a  InvSimJobCreateRequest
 * @param id Unique request name
 * @param InvSimJobCreateIn InvSimJobObjectData for InvSimJobCreateRequest
 *
 */
@JsonCreator
  public InvSimJobCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvSimJob")InvSimJobObjectData InvSimJobCreateIn) {
    super(id, "InvSimJobCreate");
    if (InvSimJobCreateIn != null) {
      addInput("InvSimJob", InvSimJobObjectHelper.toMap(InvSimJobCreateIn, new HashMap(), "InvSimJob").get("InvSimJob"));
    }
  }

/**
 *
 * Retrieves the InvSimJobObjectData that results from the InvSimJobCreateRequest call
 * @return InvSimJobObjectData resulting from udt call
 *
 */

  public InvSimJobObjectData getOutput() {
    return InvSimJobObjectHelper.fromMap(outputMap, "InvSimJob");
  }
}
