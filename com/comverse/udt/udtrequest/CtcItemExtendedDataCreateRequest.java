/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemExtendedDataCreateRequest.java
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
 * Class used to create a CtcItemExtendedDataCreateRequest Udt Request
 *
 */

public class CtcItemExtendedDataCreateRequest extends CtcItemExtendedDataSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemExtendedDataCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcItemExtendedDataObjectData for CtcItemExtendedDataCreateRequest
 *
 */
@JsonCreator
  public CtcItemExtendedDataCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemExtendedData")CtcItemExtendedDataObjectData CreateIn) {
    super(id, "CtcItemExtendedDataCreate");
    if (CreateIn != null) {
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectHelper.toMap(CreateIn, new HashMap(), "CtcItemExtendedData").get("CtcItemExtendedData"));
    }
  }

/**
 *
 * Retrieves the CtcItemExtendedDataObjectData that results from the CtcItemExtendedDataCreateRequest call
 * @return CtcItemExtendedDataObjectData resulting from udt call
 *
 */

  public CtcItemExtendedDataObjectData getOutput() {
    return CtcItemExtendedDataObjectHelper.fromMap(outputMap, "CtcItemExtendedData");
  }
}
