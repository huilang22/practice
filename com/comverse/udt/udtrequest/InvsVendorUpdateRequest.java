/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorUpdateRequest.java
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
 * Class used to create a InvsVendorUpdateRequest Udt Request
 *
 */

public class InvsVendorUpdateRequest extends InvsVendorSubRequestParent {
/**
 *
 * Constructor to create a  InvsVendorUpdateRequest
 * @param id Unique request name
 * @param InvsVendorUpdateIn InvsVendorObjectData for InvsVendorUpdateRequest
 *
 */
@JsonCreator
  public InvsVendorUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsVendor")InvsVendorObjectData InvsVendorUpdateIn) {
    super(id, "InvsVendorUpdate");
    if (InvsVendorUpdateIn != null) {
      addInput("InvsVendor", InvsVendorObjectHelper.toMap(InvsVendorUpdateIn, new HashMap(), "InvsVendor").get("InvsVendor"));
    }
  }

/**
 *
 * Retrieves the InvsVendorObjectData that results from the InvsVendorUpdateRequest call
 * @return InvsVendorObjectData resulting from udt call
 *
 */

  public InvsVendorObjectData getOutput() {
    return InvsVendorObjectHelper.fromMap(outputMap, "InvsVendor");
  }
}
