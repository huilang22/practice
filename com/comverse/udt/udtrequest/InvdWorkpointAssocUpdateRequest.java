/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdWorkpointAssocUpdateRequest.java
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
 * Class used to create a InvdWorkpointAssocUpdateRequest Udt Request
 *
 */

public class InvdWorkpointAssocUpdateRequest extends InvdWorkpointAssocSubRequestParent {
/**
 *
 * Constructor to create a  InvdWorkpointAssocUpdateRequest
 * @param id Unique request name
 * @param InvdWorkpointAssocUpdateIn InvdWorkpointAssocObjectData for InvdWorkpointAssocUpdateRequest
 *
 */
@JsonCreator
  public InvdWorkpointAssocUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdWorkpointAssoc")InvdWorkpointAssocObjectData InvdWorkpointAssocUpdateIn) {
    super(id, "InvdWorkpointAssocUpdate");
    if (InvdWorkpointAssocUpdateIn != null) {
      addInput("InvdWorkpointAssoc", InvdWorkpointAssocObjectHelper.toMap(InvdWorkpointAssocUpdateIn, new HashMap(), "InvdWorkpointAssoc").get("InvdWorkpointAssoc"));
    }
  }

/**
 *
 * Retrieves the InvdWorkpointAssocObjectData that results from the InvdWorkpointAssocUpdateRequest call
 * @return InvdWorkpointAssocObjectData resulting from udt call
 *
 */

  public InvdWorkpointAssocObjectData getOutput() {
    return InvdWorkpointAssocObjectHelper.fromMap(outputMap, "InvdWorkpointAssoc");
  }
}
