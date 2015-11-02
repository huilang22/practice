/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdWorkpointAssocCreateRequest.java
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
 * Class used to create a InvdWorkpointAssocCreateRequest Udt Request
 *
 */

public class InvdWorkpointAssocCreateRequest extends InvdWorkpointAssocSubRequestParent {
/**
 *
 * Constructor to create a  InvdWorkpointAssocCreateRequest
 * @param id Unique request name
 * @param InvdWorkpointAssocCreateIn InvdWorkpointAssocObjectData for InvdWorkpointAssocCreateRequest
 *
 */
@JsonCreator
  public InvdWorkpointAssocCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdWorkpointAssoc")InvdWorkpointAssocObjectData InvdWorkpointAssocCreateIn) {
    super(id, "InvdWorkpointAssocCreate");
    if (InvdWorkpointAssocCreateIn != null) {
      addInput("InvdWorkpointAssoc", InvdWorkpointAssocObjectHelper.toMap(InvdWorkpointAssocCreateIn, new HashMap(), "InvdWorkpointAssoc").get("InvdWorkpointAssoc"));
    }
  }

/**
 *
 * Retrieves the InvdWorkpointAssocObjectData that results from the InvdWorkpointAssocCreateRequest call
 * @return InvdWorkpointAssocObjectData resulting from udt call
 *
 */

  public InvdWorkpointAssocObjectData getOutput() {
    return InvdWorkpointAssocObjectHelper.fromMap(outputMap, "InvdWorkpointAssoc");
  }
}
