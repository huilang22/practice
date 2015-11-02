/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementUnAssignRequest.java
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
 * Class used to create a InvElementUnAssignRequest Udt Request
 *
 */

public class InvElementUnAssignRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementUnAssignRequest
 * @param id Unique request name
 * @param InvUnAsgnIn InvElementObjData for InvElementUnAssignRequest
 * @param DisconnectReason Integer for InvElementUnAssignRequest
 *
 */
@JsonCreator
  public InvElementUnAssignRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjData InvUnAsgnIn, @JsonProperty("DisconnectReason")Integer DisconnectReason) {
    super(id, "InvElementUnAssign");
    if (InvUnAsgnIn != null) {
      addInput("InvElement", InvElementObjHelper.toMap(InvUnAsgnIn, new HashMap(), "InvElement").get("InvElement"));
    }
    if (DisconnectReason != null) {
      addInput("DisconnectReason", DisconnectReason);
    }
  }

/**
 *
 * Retrieves the InvElementObjDataList that results from the InvElementUnAssignRequest call
 * @return InvElementObjDataList resulting from udt call
 *
 */

  public InvElementObjDataList getOutput() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
}
