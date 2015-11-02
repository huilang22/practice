/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementReturnRequest.java
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
 * Class used to create a InvElementReturnRequest Udt Request
 *
 */

public class InvElementReturnRequest extends InvElementSubRequestParent {
/**
 *
 * Constructor to create a  InvElementReturnRequest
 * @param id Unique request name
 * @param InvRtnIn InvElementObjData for InvElementReturnRequest
 *
 */
@JsonCreator
  public InvElementReturnRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjData InvRtnIn) {
    super(id, "InvElementReturn");
    if (InvRtnIn != null) {
      addInput("InvElement", InvElementObjHelper.toMap(InvRtnIn, new HashMap(), "InvElement").get("InvElement"));
    }
  }

/**
 *
 * Retrieves the InvElementObjData that results from the InvElementReturnRequest call
 * @return InvElementObjData resulting from udt call
 *
 */

  public InvElementObjData getOutput() {
    return InvElementObjHelper.fromMap(outputMap, "InvElement");
  }
}
