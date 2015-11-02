/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsMncCreateRequest.java
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
 * Class used to create a InvsMncCreateRequest Udt Request
 *
 */

public class InvsMncCreateRequest extends InvsMncSubRequestParent {
/**
 *
 * Constructor to create a  InvsMncCreateRequest
 * @param id Unique request name
 * @param InvsMncCreateIn InvsMncObjectData for InvsMncCreateRequest
 *
 */
@JsonCreator
  public InvsMncCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsMnc")InvsMncObjectData InvsMncCreateIn) {
    super(id, "InvsMncCreate");
    if (InvsMncCreateIn != null) {
      addInput("InvsMnc", InvsMncObjectHelper.toMap(InvsMncCreateIn, new HashMap(), "InvsMnc").get("InvsMnc"));
    }
  }

/**
 *
 * Retrieves the InvsMncObjectData that results from the InvsMncCreateRequest call
 * @return InvsMncObjectData resulting from udt call
 *
 */

  public InvsMncObjectData getOutput() {
    return InvsMncObjectHelper.fromMap(outputMap, "InvsMnc");
  }
}
