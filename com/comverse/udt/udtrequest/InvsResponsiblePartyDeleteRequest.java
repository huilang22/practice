/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsResponsiblePartyDeleteRequest.java
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
 * Class used to create a InvsResponsiblePartyDeleteRequest Udt Request
 *
 */

public class InvsResponsiblePartyDeleteRequest extends InvsResponsiblePartySubRequestParent {
/**
 *
 * Constructor to create a  InvsResponsiblePartyDeleteRequest
 * @param id Unique request name
 * @param IRPDeleteIn InvsResponsiblePartyObjectKeyData for InvsResponsiblePartyDeleteRequest
 *
 */
@JsonCreator
  public InvsResponsiblePartyDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsResponsibleParty")InvsResponsiblePartyObjectKeyData IRPDeleteIn) {
    super(id, "InvsResponsiblePartyDelete");
    if (IRPDeleteIn != null) {
      addInput("InvsResponsibleParty", InvsResponsiblePartyObjectKeyHelper.toMap(IRPDeleteIn, new HashMap(), "InvsResponsiblePartyObjectKeyData").get("InvsResponsiblePartyObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsResponsiblePartyObjectData that results from the InvsResponsiblePartyDeleteRequest call
 * @return InvsResponsiblePartyObjectData resulting from udt call
 *
 */

  public InvsResponsiblePartyObjectData getOutput() {
    return InvsResponsiblePartyObjectHelper.fromMap(outputMap, "InvsResponsibleParty");
  }
}
