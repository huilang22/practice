/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobErrorMaxErrorCountRequest.java
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
 * Class used to create a InvJobErrorMaxErrorCountRequest Udt Request
 *
 */

public class InvJobErrorMaxErrorCountRequest extends InvJobErrorSubRequestParent {
/**
 *
 * Constructor to create a  InvJobErrorMaxErrorCountRequest
 * @param id Unique request name
 * @param InvJobErrorMaxIn InvJobErrorObjectKeyData for InvJobErrorMaxErrorCountRequest
 *
 */
@JsonCreator
  public InvJobErrorMaxErrorCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvJobError")InvJobErrorObjectKeyData InvJobErrorMaxIn) {
    super(id, "InvJobErrorMaxErrorCount");
    if (InvJobErrorMaxIn != null) {
      addInput("InvJobError", InvJobErrorObjectKeyHelper.toMap(InvJobErrorMaxIn, new HashMap(), "InvJobErrorObjectKeyData").get("InvJobErrorObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvJobErrorObjectData that results from the InvJobErrorMaxErrorCountRequest call
 * @return InvJobErrorObjectData resulting from udt call
 *
 */

  public InvJobErrorObjectData getOutput() {
    return InvJobErrorObjectHelper.fromMap(outputMap, "InvJobError");
  }
}
