/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementAssignRequest.java
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
 * Class used to create a InvElementAssignRequest Udt Request
 *
 */

public class InvElementAssignRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementAssignRequest
 * @param id Unique request name
 * @param InvAsgnIn InvElementObjData for InvElementAssignRequest
 *
 */
@JsonCreator
  public InvElementAssignRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjData InvAsgnIn) {
    super(id, "InvElementAssign");
    if (InvAsgnIn != null) {
      addInput("InvElement", InvElementObjHelper.toMap(InvAsgnIn, new HashMap(), "InvElement").get("InvElement"));
    }
  }

/**
 *
 * Retrieves the InvElementObjDataList that results from the InvElementAssignRequest call
 * @return InvElementObjDataList resulting from udt call
 *
 */

  public InvElementObjDataList getOutput() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
}
