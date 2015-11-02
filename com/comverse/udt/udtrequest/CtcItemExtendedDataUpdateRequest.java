/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemExtendedDataUpdateRequest.java
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
 * Class used to create a CtcItemExtendedDataUpdateRequest Udt Request
 *
 */

public class CtcItemExtendedDataUpdateRequest extends CtcItemExtendedDataSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemExtendedDataUpdateRequest
 * @param id Unique request name
 * @param UpdateIn CtcItemExtendedDataObjectData for CtcItemExtendedDataUpdateRequest
 *
 */
@JsonCreator
  public CtcItemExtendedDataUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemExtendedData")CtcItemExtendedDataObjectData UpdateIn) {
    super(id, "CtcItemExtendedDataUpdate");
    if (UpdateIn != null) {
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectHelper.toMap(UpdateIn, new HashMap(), "CtcItemExtendedData").get("CtcItemExtendedData"));
    }
  }

/**
 *
 * Retrieves the CtcItemExtendedDataObjectData that results from the CtcItemExtendedDataUpdateRequest call
 * @return CtcItemExtendedDataObjectData resulting from udt call
 *
 */

  public CtcItemExtendedDataObjectData getOutput() {
    return CtcItemExtendedDataObjectHelper.fromMap(outputMap, "CtcItemExtendedData");
  }
}
