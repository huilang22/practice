/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementCreateRequest.java
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
 * Class used to create a InvElementCreateRequest Udt Request
 *
 */

public class InvElementCreateRequest extends InvElementSubRequestParent {
/**
 *
 * Constructor to create a  InvElementCreateRequest
 * @param id Unique request name
 * @param InvCreateInData InvElementObjData for InvElementCreateRequest
 *
 */
@JsonCreator
  public InvElementCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjData InvCreateInData) {
    super(id, "InvElementCreate");
    if (InvCreateInData != null) {
      addInput("InvElement", InvElementObjHelper.toMap(InvCreateInData, new HashMap(), "InvElement").get("InvElement"));
    }
  }

/**
 *
 * Retrieves the InvElementObjData that results from the InvElementCreateRequest call
 * @return InvElementObjData resulting from udt call
 *
 */

  public InvElementObjData getOutput() {
    return InvElementObjHelper.fromMap(outputMap, "InvElement");
  }
}
