/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemExtendedDataGetRequest.java
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
 * Class used to create a CtcItemExtendedDataGetRequest Udt Request
 *
 */

public class CtcItemExtendedDataGetRequest extends CtcItemExtendedDataSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemExtendedDataGetRequest
 * @param id Unique request name
 * @param GetIn CtcItemExtendedDataObjectKeyData for CtcItemExtendedDataGetRequest
 *
 */
@JsonCreator
  public CtcItemExtendedDataGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemExtendedData")CtcItemExtendedDataObjectKeyData GetIn) {
    super(id, "CtcItemExtendedDataGet");
    if (GetIn != null) {
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcItemExtendedDataObjectKeyData").get("CtcItemExtendedDataObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcItemExtendedDataObjectData that results from the CtcItemExtendedDataGetRequest call
 * @return CtcItemExtendedDataObjectData resulting from udt call
 *
 */

  public CtcItemExtendedDataObjectData getOutput() {
    return CtcItemExtendedDataObjectHelper.fromMap(outputMap, "CtcItemExtendedData");
  }
}
