/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvAutoActionContigSelectNumsRequest.java
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
 * Class used to create a InvAutoActionContigSelectNumsRequest Udt Request
 *
 */

public class InvAutoActionContigSelectNumsRequest extends InvAutoActionSubRequestParent {
/**
 *
 * Constructor to create a  InvAutoActionContigSelectNumsRequest
 * @param id Unique request name
 * @param InvAutoActionContigSelectNumsIn InvAutoActionSelectNumsObjData for InvAutoActionContigSelectNumsRequest
 *
 */
@JsonCreator
  public InvAutoActionContigSelectNumsRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvAutoAction")InvAutoActionSelectNumsObjData InvAutoActionContigSelectNumsIn) {
    super(id, "InvAutoActionContigSelectNums");
    if (InvAutoActionContigSelectNumsIn != null) {
      addInput("InvAutoAction", InvAutoActionSelectNumsObjHelper.toMap(InvAutoActionContigSelectNumsIn, new HashMap(), "InvAutoActionContigSelectNumsOutputData").get("InvAutoActionContigSelectNumsOutputData"));
    }
  }

/**
 *
 * Retrieves the InvAutoActionContigSelectNumsOutputData that results from the InvAutoActionContigSelectNumsRequest call
 * @return InvAutoActionContigSelectNumsOutputData resulting from udt call
 *
 */

  public InvAutoActionContigSelectNumsOutputData getOutput() {
    return InvAutoActionContigSelectNumsOutputHelper.fromMap(outputMap);
  }
}
