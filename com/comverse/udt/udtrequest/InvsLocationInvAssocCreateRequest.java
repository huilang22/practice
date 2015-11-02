/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationInvAssocCreateRequest.java
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
 * Class used to create a InvsLocationInvAssocCreateRequest Udt Request
 *
 */

public class InvsLocationInvAssocCreateRequest extends InvsLocationInvAssocSubRequestParent {
/**
 *
 * Constructor to create a  InvsLocationInvAssocCreateRequest
 * @param id Unique request name
 * @param InvsLocationInvAssocCreateIn InvsLocationInvAssocObjectData for InvsLocationInvAssocCreateRequest
 *
 */
@JsonCreator
  public InvsLocationInvAssocCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationInvAssoc")InvsLocationInvAssocObjectData InvsLocationInvAssocCreateIn) {
    super(id, "InvsLocationInvAssocCreate");
    if (InvsLocationInvAssocCreateIn != null) {
      addInput("InvsLocationInvAssoc", InvsLocationInvAssocObjectHelper.toMap(InvsLocationInvAssocCreateIn, new HashMap(), "InvsLocationInvAssoc").get("InvsLocationInvAssoc"));
    }
  }

/**
 *
 * Retrieves the InvsLocationInvAssocObjectData that results from the InvsLocationInvAssocCreateRequest call
 * @return InvsLocationInvAssocObjectData resulting from udt call
 *
 */

  public InvsLocationInvAssocObjectData getOutput() {
    return InvsLocationInvAssocObjectHelper.fromMap(outputMap, "InvsLocationInvAssoc");
  }
}
