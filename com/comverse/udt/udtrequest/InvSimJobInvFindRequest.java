/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimJobInvFindRequest.java
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
 * Class used to create a InvSimJobInvFindRequest Udt Request
 *
 */

public class InvSimJobInvFindRequest extends InvSimJobInvRequest {
/**
 *
 * Constructor to create a  InvSimJobInvFindRequest
 * @param id Unique request name
 * @param InvSimJobInvFindIn InvSimJobInvObjectFilter for InvSimJobInvFindRequest
 *
 */
@JsonCreator
  public InvSimJobInvFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvSimJobInv")InvSimJobInvObjectFilter InvSimJobInvFindIn) {
    super(id, "InvSimJobInvFind");
    if (InvSimJobInvFindIn != null) {
      Integer index =  InvSimJobInvFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvSimJobInv", InvSimJobInvObjectHelper.toMap(InvSimJobInvFindIn, new HashMap(), "InvSimJobInv").get("InvSimJobInv"));
    }
  }

/**
 *
 * Retrieves the InvSimJobInvObjectDataList that results from the InvSimJobInvFindRequest call
 * @return InvSimJobInvObjectDataList resulting from udt call
 *
 */

  public InvSimJobInvObjectDataList getOutput() {
    return InvSimJobInvObjectHelper.fromMapList(outputMap, "InvSimJobInvList");
  }
}
