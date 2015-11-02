/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementAutoAssignRequest.java
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
 * Class used to create a InvElementAutoAssignRequest Udt Request
 *
 */

public class InvElementAutoAssignRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementAutoAssignRequest
 * @param id Unique request name
 * @param InvAutoAsgnIn InvElementObjFilter for InvElementAutoAssignRequest
 * @param AssgnQuantity Integer for InvElementAutoAssignRequest
 * @param AssgnContFlag Integer for InvElementAutoAssignRequest
 *
 */
@JsonCreator
  public InvElementAutoAssignRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjFilter InvAutoAsgnIn, @JsonProperty("AssgnQuantity")Integer AssgnQuantity, @JsonProperty("AssgnContFlag")Integer AssgnContFlag) {
    super(id, "InvElementAutoAssign");
    if (InvAutoAsgnIn != null) {
      Integer index =  InvAutoAsgnIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElement", InvElementObjHelper.toMap(InvAutoAsgnIn, new HashMap(), "InvElement").get("InvElement"));
    }
    if (AssgnQuantity != null) {
      addInput("AssgnQuantity", AssgnQuantity);
    }
    if (AssgnContFlag != null) {
      addInput("AssgnContFlag", AssgnContFlag);
    }
  }

/**
 *
 * Retrieves the InvElementObjDataList that results from the InvElementAutoAssignRequest call
 * @return InvElementObjDataList resulting from udt call
 *
 */

  public InvElementObjDataList getOutput() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
}
