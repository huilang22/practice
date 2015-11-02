/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorGetRequest.java
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
 * Class used to create a InvsVendorGetRequest Udt Request
 *
 */

public class InvsVendorGetRequest extends InvsVendorSubRequestParent {
/**
 *
 * Constructor to create a  InvsVendorGetRequest
 * @param id Unique request name
 * @param InvsVendorGetIn InvsVendorObjectKeyData for InvsVendorGetRequest
 *
 */
@JsonCreator
  public InvsVendorGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsVendor")InvsVendorObjectKeyData InvsVendorGetIn) {
    super(id, "InvsVendorGet");
    if (InvsVendorGetIn != null) {
      addInput("InvsVendor", InvsVendorObjectKeyHelper.toMap(InvsVendorGetIn, new HashMap(), "InvsVendorObjectKeyData").get("InvsVendorObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsVendorObjectData that results from the InvsVendorGetRequest call
 * @return InvsVendorObjectData resulting from udt call
 *
 */

  public InvsVendorObjectData getOutput() {
    return InvsVendorObjectHelper.fromMap(outputMap, "InvsVendor");
  }
}
