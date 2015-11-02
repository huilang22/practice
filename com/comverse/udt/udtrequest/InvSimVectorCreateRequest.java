/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimVectorCreateRequest.java
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
 * Class used to create a InvSimVectorCreateRequest Udt Request
 *
 */

public class InvSimVectorCreateRequest extends InvSimVectorSubRequestParent {
/**
 *
 * Constructor to create a  InvSimVectorCreateRequest
 * @param id Unique request name
 * @param InvCreateInData InvSimVectorObjData for InvSimVectorCreateRequest
 * @param RequestSize Integer for InvSimVectorCreateRequest
 *
 */
@JsonCreator
  public InvSimVectorCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvSimVector")InvSimVectorObjData InvCreateInData, @JsonProperty("RequestSize")Integer RequestSize) {
    super(id, "InvSimVectorCreate");
    if (InvCreateInData != null) {
      addInput("InvSimVector", InvSimVectorObjHelper.toMap(InvCreateInData, new HashMap(), "InvSimVectorCreateOutputData").get("InvSimVectorCreateOutputData"));
    }
    if (RequestSize != null) {
      addInput("RequestSize", RequestSize);
    }
  }

/**
 *
 * Retrieves the InvSimVectorCreateOutputData that results from the InvSimVectorCreateRequest call
 * @return InvSimVectorCreateOutputData resulting from udt call
 *
 */

  public InvSimVectorCreateOutputData getOutput() {
    return InvSimVectorCreateOutputHelper.fromMap(outputMap);
  }
}
