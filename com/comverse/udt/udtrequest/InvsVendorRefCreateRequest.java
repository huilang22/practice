/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorRefCreateRequest.java
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
 * Class used to create a InvsVendorRefCreateRequest Udt Request
 *
 */

public class InvsVendorRefCreateRequest extends InvsVendorRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsVendorRefCreateRequest
 * @param id Unique request name
 * @param InvsVendorRefCreateIn InvsVendorRefObjectData for InvsVendorRefCreateRequest
 *
 */
@JsonCreator
  public InvsVendorRefCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsVendorRef")InvsVendorRefObjectData InvsVendorRefCreateIn) {
    super(id, "InvsVendorRefCreate");
    if (InvsVendorRefCreateIn != null) {
      addInput("InvsVendorRef", InvsVendorRefObjectHelper.toMap(InvsVendorRefCreateIn, new HashMap(), "InvsVendorRef").get("InvsVendorRef"));
    }
  }

/**
 *
 * Retrieves the InvsVendorRefObjectData that results from the InvsVendorRefCreateRequest call
 * @return InvsVendorRefObjectData resulting from udt call
 *
 */

  public InvsVendorRefObjectData getOutput() {
    return InvsVendorRefObjectHelper.fromMap(outputMap, "InvsVendorRef");
  }
}
