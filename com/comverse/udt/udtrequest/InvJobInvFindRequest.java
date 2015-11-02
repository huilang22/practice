/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobInvFindRequest.java
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
 * Class used to create a InvJobInvFindRequest Udt Request
 *
 */

public class InvJobInvFindRequest extends InvJobInvRequest {
/**
 *
 * Constructor to create a  InvJobInvFindRequest
 * @param id Unique request name
 * @param InvJobInvFindIn InvJobInvObjectFilter for InvJobInvFindRequest
 *
 */
@JsonCreator
  public InvJobInvFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvJobInv")InvJobInvObjectFilter InvJobInvFindIn) {
    super(id, "InvJobInvFind");
    if (InvJobInvFindIn != null) {
      Integer index =  InvJobInvFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvJobInv", InvJobInvObjectHelper.toMap(InvJobInvFindIn, new HashMap(), "InvJobInv").get("InvJobInv"));
    }
  }

/**
 *
 * Retrieves the InvJobInvObjectDataList that results from the InvJobInvFindRequest call
 * @return InvJobInvObjectDataList resulting from udt call
 *
 */

  public InvJobInvObjectDataList getOutput() {
    return InvJobInvObjectHelper.fromMapList(outputMap, "InvJobInvList");
  }
}
