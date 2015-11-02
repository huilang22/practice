/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorCreateRequest.java
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
 * Class used to create a InvsVendorCreateRequest Udt Request
 *
 */

public class InvsVendorCreateRequest extends InvsVendorSubRequestParent {
/**
 *
 * Constructor to create a  InvsVendorCreateRequest
 * @param id Unique request name
 * @param InvsVendorCreateIn InvsVendorObjectData for InvsVendorCreateRequest
 *
 */
@JsonCreator
  public InvsVendorCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsVendor")InvsVendorObjectData InvsVendorCreateIn) {
    super(id, "InvsVendorCreate");
    if (InvsVendorCreateIn != null) {
      addInput("InvsVendor", InvsVendorObjectHelper.toMap(InvsVendorCreateIn, new HashMap(), "InvsVendor").get("InvsVendor"));
    }
  }

/**
 *
 * Retrieves the InvsVendorObjectData that results from the InvsVendorCreateRequest call
 * @return InvsVendorObjectData resulting from udt call
 *
 */

  public InvsVendorObjectData getOutput() {
    return InvsVendorObjectHelper.fromMap(outputMap, "InvsVendor");
  }
}
