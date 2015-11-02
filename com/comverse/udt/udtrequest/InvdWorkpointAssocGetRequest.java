/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdWorkpointAssocGetRequest.java
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
 * Class used to create a InvdWorkpointAssocGetRequest Udt Request
 *
 */

public class InvdWorkpointAssocGetRequest extends InvdWorkpointAssocSubRequestParent {
/**
 *
 * Constructor to create a  InvdWorkpointAssocGetRequest
 * @param id Unique request name
 * @param InvdWorkpointAssocGetIn InvdWorkpointAssocObjectKeyData for InvdWorkpointAssocGetRequest
 *
 */
@JsonCreator
  public InvdWorkpointAssocGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdWorkpointAssoc")InvdWorkpointAssocObjectKeyData InvdWorkpointAssocGetIn) {
    super(id, "InvdWorkpointAssocGet");
    if (InvdWorkpointAssocGetIn != null) {
      addInput("InvdWorkpointAssoc", InvdWorkpointAssocObjectKeyHelper.toMap(InvdWorkpointAssocGetIn, new HashMap(), "InvdWorkpointAssocObjectKeyData").get("InvdWorkpointAssocObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvdWorkpointAssocObjectData that results from the InvdWorkpointAssocGetRequest call
 * @return InvdWorkpointAssocObjectData resulting from udt call
 *
 */

  public InvdWorkpointAssocObjectData getOutput() {
    return InvdWorkpointAssocObjectHelper.fromMap(outputMap, "InvdWorkpointAssoc");
  }
}
