/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsResponsiblePartyCreateRequest.java
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
 * Class used to create a InvsResponsiblePartyCreateRequest Udt Request
 *
 */

public class InvsResponsiblePartyCreateRequest extends InvsResponsiblePartySubRequestParent {
/**
 *
 * Constructor to create a  InvsResponsiblePartyCreateRequest
 * @param id Unique request name
 * @param IRPCreateIn InvsResponsiblePartyObjectData for InvsResponsiblePartyCreateRequest
 *
 */
@JsonCreator
  public InvsResponsiblePartyCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsResponsibleParty")InvsResponsiblePartyObjectData IRPCreateIn) {
    super(id, "InvsResponsiblePartyCreate");
    if (IRPCreateIn != null) {
      addInput("InvsResponsibleParty", InvsResponsiblePartyObjectHelper.toMap(IRPCreateIn, new HashMap(), "InvsResponsibleParty").get("InvsResponsibleParty"));
    }
  }

/**
 *
 * Retrieves the InvsResponsiblePartyObjectData that results from the InvsResponsiblePartyCreateRequest call
 * @return InvsResponsiblePartyObjectData resulting from udt call
 *
 */

  public InvsResponsiblePartyObjectData getOutput() {
    return InvsResponsiblePartyObjectHelper.fromMap(outputMap, "InvsResponsibleParty");
  }
}
