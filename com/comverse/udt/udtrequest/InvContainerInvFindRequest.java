/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerInvFindRequest.java
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
 * Class used to create a InvContainerInvFindRequest Udt Request
 *
 */

public class InvContainerInvFindRequest extends InvContainerInvRequest {
/**
 *
 * Constructor to create a  InvContainerInvFindRequest
 * @param id Unique request name
 * @param InvContainerInvFindIn InvContainerInvObjectFilter for InvContainerInvFindRequest
 *
 */
@JsonCreator
  public InvContainerInvFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvContainerInv")InvContainerInvObjectFilter InvContainerInvFindIn) {
    super(id, "InvContainerInvFind");
    if (InvContainerInvFindIn != null) {
      Integer index =  InvContainerInvFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvContainerInv", InvContainerInvObjectHelper.toMap(InvContainerInvFindIn, new HashMap(), "InvContainerInv").get("InvContainerInv"));
    }
  }

/**
 *
 * Retrieves the InvContainerInvObjectDataList that results from the InvContainerInvFindRequest call
 * @return InvContainerInvObjectDataList resulting from udt call
 *
 */

  public InvContainerInvObjectDataList getOutput() {
    return InvContainerInvObjectHelper.fromMapList(outputMap, "InvContainerInvList");
  }
}
