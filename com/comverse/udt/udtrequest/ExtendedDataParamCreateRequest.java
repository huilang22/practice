/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataParamCreateRequest.java
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
 * Class used to create a ExtendedDataParamCreateRequest Udt Request
 *
 */

public class ExtendedDataParamCreateRequest extends ExtendedDataParamSubRequestParent {
/**
 *
 * Constructor to create a  ExtendedDataParamCreateRequest
 * @param id Unique request name
 * @param PDCreateIn XPDObjectData for ExtendedDataParamCreateRequest
 *
 */
@JsonCreator
  public ExtendedDataParamCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExtendedDataParam")XPDObjectData PDCreateIn) {
    super(id, "ExtendedDataParamCreate");
    if (PDCreateIn != null) {
      addInput("ExtendedDataParam", XPDObjectHelper.toMap(PDCreateIn, new HashMap(), "ExtendedDataParam").get("ExtendedDataParam"));
    }
  }

/**
 *
 * Retrieves the XPDObjectData that results from the ExtendedDataParamCreateRequest call
 * @return XPDObjectData resulting from udt call
 *
 */

  public XPDObjectData getOutput() {
    return XPDObjectHelper.fromMap(outputMap, "ExtendedDataParam");
  }
}
