/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvModJobCountRequest.java
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
 * Class used to create a InvModJobCountRequest Udt Request
 *
 */

public class InvModJobCountRequest extends InvModJobSubRequestParent {
/**
 *
 * Constructor to create a  InvModJobCountRequest
 * @param id Unique request name
 * @param InvModJobCountIn InvModJobObjectData for InvModJobCountRequest
 *
 */
@JsonCreator
  public InvModJobCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvModJob")InvModJobObjectData InvModJobCountIn) {
    super(id, "InvModJobCount");
    if (InvModJobCountIn != null) {
      addInput("InvModJob", InvModJobObjectHelper.toMap(InvModJobCountIn, new HashMap(), "InvModJobCountOutputData").get("InvModJobCountOutputData"));
    }
  }

/**
 *
 * Retrieves the InvModJobCountOutputData that results from the InvModJobCountRequest call
 * @return InvModJobCountOutputData resulting from udt call
 *
 */

  public InvModJobCountOutputData getOutput() {
    return InvModJobCountOutputHelper.fromMap(outputMap);
  }
}
