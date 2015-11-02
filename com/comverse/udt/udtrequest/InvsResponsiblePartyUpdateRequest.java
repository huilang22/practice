/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsResponsiblePartyUpdateRequest.java
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
 * Class used to create a InvsResponsiblePartyUpdateRequest Udt Request
 *
 */

public class InvsResponsiblePartyUpdateRequest extends InvsResponsiblePartySubRequestParent {
/**
 *
 * Constructor to create a  InvsResponsiblePartyUpdateRequest
 * @param id Unique request name
 * @param IRPUpdateIn InvsResponsiblePartyObjectData for InvsResponsiblePartyUpdateRequest
 *
 */
@JsonCreator
  public InvsResponsiblePartyUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsResponsibleParty")InvsResponsiblePartyObjectData IRPUpdateIn) {
    super(id, "InvsResponsiblePartyUpdate");
    if (IRPUpdateIn != null) {
      addInput("InvsResponsibleParty", InvsResponsiblePartyObjectHelper.toMap(IRPUpdateIn, new HashMap(), "InvsResponsibleParty").get("InvsResponsibleParty"));
    }
  }

/**
 *
 * Retrieves the InvsResponsiblePartyObjectData that results from the InvsResponsiblePartyUpdateRequest call
 * @return InvsResponsiblePartyObjectData resulting from udt call
 *
 */

  public InvsResponsiblePartyObjectData getOutput() {
    return InvsResponsiblePartyObjectHelper.fromMap(outputMap, "InvsResponsibleParty");
  }
}
