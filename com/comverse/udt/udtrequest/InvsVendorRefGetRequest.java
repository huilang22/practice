/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorRefGetRequest.java
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
 * Class used to create a InvsVendorRefGetRequest Udt Request
 *
 */

public class InvsVendorRefGetRequest extends InvsVendorRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsVendorRefGetRequest
 * @param id Unique request name
 * @param InvsVendorRefGetIn InvsVendorRefObjectKeyData for InvsVendorRefGetRequest
 *
 */
@JsonCreator
  public InvsVendorRefGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsVendorRef")InvsVendorRefObjectKeyData InvsVendorRefGetIn) {
    super(id, "InvsVendorRefGet");
    if (InvsVendorRefGetIn != null) {
      addInput("InvsVendorRef", InvsVendorRefObjectKeyHelper.toMap(InvsVendorRefGetIn, new HashMap(), "InvsVendorRefObjectKeyData").get("InvsVendorRefObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsVendorRefObjectData that results from the InvsVendorRefGetRequest call
 * @return InvsVendorRefObjectData resulting from udt call
 *
 */

  public InvsVendorRefObjectData getOutput() {
    return InvsVendorRefObjectHelper.fromMap(outputMap, "InvsVendorRef");
  }
}
