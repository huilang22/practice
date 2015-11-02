/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsResponsiblePartyGetRequest.java
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
 * Class used to create a InvsResponsiblePartyGetRequest Udt Request
 *
 */

public class InvsResponsiblePartyGetRequest extends InvsResponsiblePartySubRequestParent {
/**
 *
 * Constructor to create a  InvsResponsiblePartyGetRequest
 * @param id Unique request name
 * @param IRPGetIn InvsResponsiblePartyObjectKeyData for InvsResponsiblePartyGetRequest
 *
 */
@JsonCreator
  public InvsResponsiblePartyGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsResponsibleParty")InvsResponsiblePartyObjectKeyData IRPGetIn) {
    super(id, "InvsResponsiblePartyGet");
    if (IRPGetIn != null) {
      addInput("InvsResponsibleParty", InvsResponsiblePartyObjectKeyHelper.toMap(IRPGetIn, new HashMap(), "InvsResponsiblePartyObjectKeyData").get("InvsResponsiblePartyObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsResponsiblePartyObjectData that results from the InvsResponsiblePartyGetRequest call
 * @return InvsResponsiblePartyObjectData resulting from udt call
 *
 */

  public InvsResponsiblePartyObjectData getOutput() {
    return InvsResponsiblePartyObjectHelper.fromMap(outputMap, "InvsResponsibleParty");
  }
}
