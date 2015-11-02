/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemExtendedDataDeleteRequest.java
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

import com.csgsystems.ctc.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtcItemExtendedDataDeleteRequest Udt Request
 *
 */

public class CtcItemExtendedDataDeleteRequest extends CtcItemExtendedDataSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemExtendedDataDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcItemExtendedDataObjectKeyData for CtcItemExtendedDataDeleteRequest
 *
 */
@JsonCreator
  public CtcItemExtendedDataDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemExtendedData")CtcItemExtendedDataObjectKeyData DeleteIn) {
    super(id, "CtcItemExtendedDataDelete");
    if (DeleteIn != null) {
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcItemExtendedDataObjectKeyData").get("CtcItemExtendedDataObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcItemExtendedDataObjectData that results from the CtcItemExtendedDataDeleteRequest call
 * @return CtcItemExtendedDataObjectData resulting from udt call
 *
 */

  public CtcItemExtendedDataObjectData getOutput() {
    return CtcItemExtendedDataObjectHelper.fromMap(outputMap, "CtcItemExtendedData");
  }
}
