/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataParamGetRequest.java
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
 * Class used to create a ExtendedDataParamGetRequest Udt Request
 *
 */

public class ExtendedDataParamGetRequest extends ExtendedDataParamSubRequestParent {
/**
 *
 * Constructor to create a  ExtendedDataParamGetRequest
 * @param id Unique request name
 * @param PDGetIn XPDObjectKeyData for ExtendedDataParamGetRequest
 *
 */
@JsonCreator
  public ExtendedDataParamGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExtendedDataParam")XPDObjectKeyData PDGetIn) {
    super(id, "ExtendedDataParamGet");
    if (PDGetIn != null) {
      addInput("ExtendedDataParam", XPDObjectKeyHelper.toMap(PDGetIn, new HashMap(), "XPDObjectKeyData").get("XPDObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the XPDObjectData that results from the ExtendedDataParamGetRequest call
 * @return XPDObjectData resulting from udt call
 *
 */

  public XPDObjectData getOutput() {
    return XPDObjectHelper.fromMap(outputMap, "ExtendedDataParam");
  }
}
