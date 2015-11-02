/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountDefinitionCreateRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a DiscountDefinitionCreateRequest Udt Request
 *
 */

public class DiscountDefinitionCreateRequest extends DiscountDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  DiscountDefinitionCreateRequest
 * @param id Unique request name
 * @param DDCrIn DiscountDefinitionObjectData for DiscountDefinitionCreateRequest
 *
 */
@JsonCreator
  public DiscountDefinitionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountDefinition")DiscountDefinitionObjectData DDCrIn) {
    super(id, "DiscountDefinitionCreate");
    if (DDCrIn != null) {
      addInput("DiscountDefinition", DiscountDefinitionObjectHelper.toMap(DDCrIn, new HashMap(), "DiscountDefinition").get("DiscountDefinition"));
    }
  }

/**
 *
 * Retrieves the DiscountDefinitionObjectData that results from the DiscountDefinitionCreateRequest call
 * @return DiscountDefinitionObjectData resulting from udt call
 *
 */

  public DiscountDefinitionObjectData getOutput() {
    return DiscountDefinitionObjectHelper.fromMap(outputMap, "DiscountDefinition");
  }
}
