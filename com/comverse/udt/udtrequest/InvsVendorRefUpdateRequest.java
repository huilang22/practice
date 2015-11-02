/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorRefUpdateRequest.java
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
 * Class used to create a InvsVendorRefUpdateRequest Udt Request
 *
 */

public class InvsVendorRefUpdateRequest extends InvsVendorRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsVendorRefUpdateRequest
 * @param id Unique request name
 * @param InvsVendorRefUpdateIn InvsVendorRefObjectData for InvsVendorRefUpdateRequest
 *
 */
@JsonCreator
  public InvsVendorRefUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsVendorRef")InvsVendorRefObjectData InvsVendorRefUpdateIn) {
    super(id, "InvsVendorRefUpdate");
    if (InvsVendorRefUpdateIn != null) {
      addInput("InvsVendorRef", InvsVendorRefObjectHelper.toMap(InvsVendorRefUpdateIn, new HashMap(), "InvsVendorRef").get("InvsVendorRef"));
    }
  }

/**
 *
 * Retrieves the InvsVendorRefObjectData that results from the InvsVendorRefUpdateRequest call
 * @return InvsVendorRefObjectData resulting from udt call
 *
 */

  public InvsVendorRefObjectData getOutput() {
    return InvsVendorRefObjectHelper.fromMap(outputMap, "InvsVendorRef");
  }
}
