/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsMncUpdateRequest.java
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
 * Class used to create a InvsMncUpdateRequest Udt Request
 *
 */

public class InvsMncUpdateRequest extends InvsMncSubRequestParent {
/**
 *
 * Constructor to create a  InvsMncUpdateRequest
 * @param id Unique request name
 * @param InvsMncUpdateIn InvsMncObjectData for InvsMncUpdateRequest
 *
 */
@JsonCreator
  public InvsMncUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsMnc")InvsMncObjectData InvsMncUpdateIn) {
    super(id, "InvsMncUpdate");
    if (InvsMncUpdateIn != null) {
      addInput("InvsMnc", InvsMncObjectHelper.toMap(InvsMncUpdateIn, new HashMap(), "InvsMnc").get("InvsMnc"));
    }
  }

/**
 *
 * Retrieves the InvsMncObjectData that results from the InvsMncUpdateRequest call
 * @return InvsMncObjectData resulting from udt call
 *
 */

  public InvsMncObjectData getOutput() {
    return InvsMncObjectHelper.fromMap(outputMap, "InvsMnc");
  }
}
