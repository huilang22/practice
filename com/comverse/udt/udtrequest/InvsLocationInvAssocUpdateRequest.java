/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationInvAssocUpdateRequest.java
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
 * Class used to create a InvsLocationInvAssocUpdateRequest Udt Request
 *
 */

public class InvsLocationInvAssocUpdateRequest extends InvsLocationInvAssocSubRequestParent {
/**
 *
 * Constructor to create a  InvsLocationInvAssocUpdateRequest
 * @param id Unique request name
 * @param InvsLocationInvAssocUpdateIn InvsLocationInvAssocObjectData for InvsLocationInvAssocUpdateRequest
 *
 */
@JsonCreator
  public InvsLocationInvAssocUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationInvAssoc")InvsLocationInvAssocObjectData InvsLocationInvAssocUpdateIn) {
    super(id, "InvsLocationInvAssocUpdate");
    if (InvsLocationInvAssocUpdateIn != null) {
      addInput("InvsLocationInvAssoc", InvsLocationInvAssocObjectHelper.toMap(InvsLocationInvAssocUpdateIn, new HashMap(), "InvsLocationInvAssoc").get("InvsLocationInvAssoc"));
    }
  }

/**
 *
 * Retrieves the InvsLocationInvAssocObjectData that results from the InvsLocationInvAssocUpdateRequest call
 * @return InvsLocationInvAssocObjectData resulting from udt call
 *
 */

  public InvsLocationInvAssocObjectData getOutput() {
    return InvsLocationInvAssocObjectHelper.fromMap(outputMap, "InvsLocationInvAssoc");
  }
}
