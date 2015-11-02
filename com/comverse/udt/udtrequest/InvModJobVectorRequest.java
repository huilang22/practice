/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvModJobVectorRequest.java
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
 * Class used to create a InvModJobVectorRequest Udt Request
 *
 */

public class InvModJobVectorRequest extends InvModJobSubRequestParent {
/**
 *
 * Constructor to create a  InvModJobVectorRequest
 * @param id Unique request name
 * @param InvModJobVectorIn InvModJobObjectData for InvModJobVectorRequest
 *
 */
@JsonCreator
  public InvModJobVectorRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvModJob")InvModJobObjectData InvModJobVectorIn) {
    super(id, "InvModJobVector");
    if (InvModJobVectorIn != null) {
      addInput("InvModJob", InvModJobObjectHelper.toMap(InvModJobVectorIn, new HashMap(), "InvModJobVectorOutputData").get("InvModJobVectorOutputData"));
    }
  }

/**
 *
 * Retrieves the InvModJobVectorOutputData that results from the InvModJobVectorRequest call
 * @return InvModJobVectorOutputData resulting from udt call
 *
 */

  public InvModJobVectorOutputData getOutput() {
    return InvModJobVectorOutputHelper.fromMap(outputMap);
  }
}
