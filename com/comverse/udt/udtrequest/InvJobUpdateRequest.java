/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobUpdateRequest.java
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
 * Class used to create a InvJobUpdateRequest Udt Request
 *
 */

public class InvJobUpdateRequest extends InvJobSubRequestParent {
/**
 *
 * Constructor to create a  InvJobUpdateRequest
 * @param id Unique request name
 * @param InvJobUpdateIn InvJobObjectData for InvJobUpdateRequest
 *
 */
@JsonCreator
  public InvJobUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvJob")InvJobObjectData InvJobUpdateIn) {
    super(id, "InvJobUpdate");
    if (InvJobUpdateIn != null) {
      addInput("InvJob", InvJobObjectHelper.toMap(InvJobUpdateIn, new HashMap(), "InvJob").get("InvJob"));
    }
  }

/**
 *
 * Retrieves the InvJobObjectData that results from the InvJobUpdateRequest call
 * @return InvJobObjectData resulting from udt call
 *
 */

  public InvJobObjectData getOutput() {
    return InvJobObjectHelper.fromMap(outputMap, "InvJob");
  }
}
