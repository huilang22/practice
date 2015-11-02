/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataParamUpdateRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ExtendedDataParamUpdateRequest Udt Request
 *
 */

public class ExtendedDataParamUpdateRequest extends ExtendedDataParamSubRequestParent {
/**
 *
 * Constructor to create a  ExtendedDataParamUpdateRequest
 * @param id Unique request name
 * @param PDUpdateIn XPDObjectData for ExtendedDataParamUpdateRequest
 *
 */
@JsonCreator
  public ExtendedDataParamUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExtendedDataParam")XPDObjectData PDUpdateIn) {
    super(id, "ExtendedDataParamUpdate");
    if (PDUpdateIn != null) {
      addInput("ExtendedDataParam", XPDObjectHelper.toMap(PDUpdateIn, new HashMap(), "ExtendedDataParam").get("ExtendedDataParam"));
    }
  }

/**
 *
 * Retrieves the XPDObjectData that results from the ExtendedDataParamUpdateRequest call
 * @return XPDObjectData resulting from udt call
 *
 */

  public XPDObjectData getOutput() {
    return XPDObjectHelper.fromMap(outputMap, "ExtendedDataParam");
  }
}
