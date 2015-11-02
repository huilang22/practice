/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationInvAssocGetRequest.java
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
 * Class used to create a InvsLocationInvAssocGetRequest Udt Request
 *
 */

public class InvsLocationInvAssocGetRequest extends InvsLocationInvAssocSubRequestParent {
/**
 *
 * Constructor to create a  InvsLocationInvAssocGetRequest
 * @param id Unique request name
 * @param InvsLocationInvAssocGetIn InvsLocationInvAssocObjectKeyData for InvsLocationInvAssocGetRequest
 *
 */
@JsonCreator
  public InvsLocationInvAssocGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationInvAssoc")InvsLocationInvAssocObjectKeyData InvsLocationInvAssocGetIn) {
    super(id, "InvsLocationInvAssocGet");
    if (InvsLocationInvAssocGetIn != null) {
      addInput("InvsLocationInvAssoc", InvsLocationInvAssocObjectKeyHelper.toMap(InvsLocationInvAssocGetIn, new HashMap(), "InvsLocationInvAssocObjectKeyData").get("InvsLocationInvAssocObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsLocationInvAssocObjectData that results from the InvsLocationInvAssocGetRequest call
 * @return InvsLocationInvAssocObjectData resulting from udt call
 *
 */

  public InvsLocationInvAssocObjectData getOutput() {
    return InvsLocationInvAssocObjectHelper.fromMap(outputMap, "InvsLocationInvAssoc");
  }
}
