/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvAutoActionSelectNumsRequest.java
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
 * Class used to create a InvAutoActionSelectNumsRequest Udt Request
 *
 */

public class InvAutoActionSelectNumsRequest extends InvAutoActionSubRequestParent {
/**
 *
 * Constructor to create a  InvAutoActionSelectNumsRequest
 * @param id Unique request name
 * @param InvAutoActionSelectNumsIn InvAutoActionSelectNumsObjData for InvAutoActionSelectNumsRequest
 *
 */
@JsonCreator
  public InvAutoActionSelectNumsRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvAutoAction")InvAutoActionSelectNumsObjData InvAutoActionSelectNumsIn) {
    super(id, "InvAutoActionSelectNums");
    if (InvAutoActionSelectNumsIn != null) {
      addInput("InvAutoAction", InvAutoActionSelectNumsObjHelper.toMap(InvAutoActionSelectNumsIn, new HashMap(), "InvAutoActionSelectNumsOutputData").get("InvAutoActionSelectNumsOutputData"));
    }
  }

/**
 *
 * Retrieves the InvAutoActionSelectNumsOutputData that results from the InvAutoActionSelectNumsRequest call
 * @return InvAutoActionSelectNumsOutputData resulting from udt call
 *
 */

  public InvAutoActionSelectNumsOutputData getOutput() {
    return InvAutoActionSelectNumsOutputHelper.fromMap(outputMap);
  }
}
