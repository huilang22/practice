/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainCreateRequest.java
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
 * Class used to create a InvdMainCreateRequest Udt Request
 *
 */

public class InvdMainCreateRequest extends InvdMainSubRequestParent {
/**
 *
 * Constructor to create a  InvdMainCreateRequest
 * @param id Unique request name
 * @param InvdMainCreateIn InvdMainObjectData for InvdMainCreateRequest
 *
 */
@JsonCreator
  public InvdMainCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdMain")InvdMainObjectData InvdMainCreateIn) {
    super(id, "InvdMainCreate");
    if (InvdMainCreateIn != null) {
      addInput("InvdMain", InvdMainObjectHelper.toMap(InvdMainCreateIn, new HashMap(), "InvdMain").get("InvdMain"));
    }
  }

/**
 *
 * Retrieves the InvdMainObjectData that results from the InvdMainCreateRequest call
 * @return InvdMainObjectData resulting from udt call
 *
 */

  public InvdMainObjectData getOutput() {
    return InvdMainObjectHelper.fromMap(outputMap, "InvdMain");
  }
}
