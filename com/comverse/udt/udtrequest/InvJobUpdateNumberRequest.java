/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobUpdateNumberRequest.java
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
 * Class used to create a InvJobUpdateNumberRequest Udt Request
 *
 */

public class InvJobUpdateNumberRequest extends InvJobSubRequestParent {
/**
 *
 * Constructor to create a  InvJobUpdateNumberRequest
 * @param id Unique request name
 * @param InvJobUpdateNumberIn InvJobObjectData for InvJobUpdateNumberRequest
 *
 */
@JsonCreator
  public InvJobUpdateNumberRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvJob")InvJobObjectData InvJobUpdateNumberIn) {
    super(id, "InvJobUpdateNumber");
    if (InvJobUpdateNumberIn != null) {
      addInput("InvJob", InvJobObjectHelper.toMap(InvJobUpdateNumberIn, new HashMap(), "InvJob").get("InvJob"));
    }
  }

/**
 *
 * Retrieves the InvJobObjectData that results from the InvJobUpdateNumberRequest call
 * @return InvJobObjectData resulting from udt call
 *
 */

  public InvJobObjectData getOutput() {
    return InvJobObjectHelper.fromMap(outputMap, "InvJob");
  }
}
