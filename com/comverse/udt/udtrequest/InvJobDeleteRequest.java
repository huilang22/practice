/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobDeleteRequest.java
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
 * Class used to create a InvJobDeleteRequest Udt Request
 *
 */

public class InvJobDeleteRequest extends InvJobSubRequestParent {
/**
 *
 * Constructor to create a  InvJobDeleteRequest
 * @param id Unique request name
 * @param InvJobDeleteIn InvJobObjectData for InvJobDeleteRequest
 *
 */
@JsonCreator
  public InvJobDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvJob")InvJobObjectData InvJobDeleteIn) {
    super(id, "InvJobDelete");
    if (InvJobDeleteIn != null) {
      addInput("InvJob", InvJobObjectHelper.toMap(InvJobDeleteIn, new HashMap(), "InvJob").get("InvJob"));
    }
  }

/**
 *
 * Retrieves the InvJobObjectData that results from the InvJobDeleteRequest call
 * @return InvJobObjectData resulting from udt call
 *
 */

  public InvJobObjectData getOutput() {
    return InvJobObjectHelper.fromMap(outputMap, "InvJob");
  }
}
