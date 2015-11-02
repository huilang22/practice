/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvAutoActionFindRequest.java
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
 * Class used to create a InvAutoActionFindRequest Udt Request
 *
 */

public class InvAutoActionFindRequest extends InvAutoActionRequest {
/**
 *
 * Constructor to create a  InvAutoActionFindRequest
 * @param id Unique request name
 * @param InvAutoActionFindIn InvAutoActionObjData for InvAutoActionFindRequest
 *
 */
@JsonCreator
  public InvAutoActionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvAutoAction")InvAutoActionObjData InvAutoActionFindIn) {
    super(id, "InvAutoActionFind");
    if (InvAutoActionFindIn != null) {
      addInput("InvAutoAction", InvAutoActionObjHelper.toMap(InvAutoActionFindIn, new HashMap(), "InvAutoAction").get("InvAutoAction"));
    }
  }

/**
 *
 * Retrieves the InvAutoActionObjDataList that results from the InvAutoActionFindRequest call
 * @return InvAutoActionObjDataList resulting from udt call
 *
 */

  public InvAutoActionObjDataList getOutput() {
    return InvAutoActionObjHelper.fromMapList(outputMap, "InvAutoActionList");
  }
}
