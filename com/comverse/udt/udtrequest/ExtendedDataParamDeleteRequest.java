/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataParamDeleteRequest.java
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
 * Class used to create a ExtendedDataParamDeleteRequest Udt Request
 *
 */

public class ExtendedDataParamDeleteRequest extends ExtendedDataParamSubRequestParent {
/**
 *
 * Constructor to create a  ExtendedDataParamDeleteRequest
 * @param id Unique request name
 * @param PDDeleteIn XPDObjectData for ExtendedDataParamDeleteRequest
 *
 */
@JsonCreator
  public ExtendedDataParamDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExtendedDataParam")XPDObjectData PDDeleteIn) {
    super(id, "ExtendedDataParamDelete");
    if (PDDeleteIn != null) {
      addInput("ExtendedDataParam", XPDObjectHelper.toMap(PDDeleteIn, new HashMap(), "ExtendedDataParam").get("ExtendedDataParam"));
    }
  }

/**
 *
 * Retrieves the XPDObjectData that results from the ExtendedDataParamDeleteRequest call
 * @return XPDObjectData resulting from udt call
 *
 */

  public XPDObjectData getOutput() {
    return XPDObjectHelper.fromMap(outputMap, "ExtendedDataParam");
  }
}
