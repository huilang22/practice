/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountDefinitionUpdateRequest.java
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
 * Class used to create a DiscountDefinitionUpdateRequest Udt Request
 *
 */

public class DiscountDefinitionUpdateRequest extends DiscountDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  DiscountDefinitionUpdateRequest
 * @param id Unique request name
 * @param DDUpdIn DiscountDefinitionObjectData for DiscountDefinitionUpdateRequest
 *
 */
@JsonCreator
  public DiscountDefinitionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountDefinition")DiscountDefinitionObjectData DDUpdIn) {
    super(id, "DiscountDefinitionUpdate");
    if (DDUpdIn != null) {
      addInput("DiscountDefinition", DiscountDefinitionObjectHelper.toMap(DDUpdIn, new HashMap(), "DiscountDefinition").get("DiscountDefinition"));
    }
  }

/**
 *
 * Retrieves the DiscountDefinitionObjectData that results from the DiscountDefinitionUpdateRequest call
 * @return DiscountDefinitionObjectData resulting from udt call
 *
 */

  public DiscountDefinitionObjectData getOutput() {
    return DiscountDefinitionObjectHelper.fromMap(outputMap, "DiscountDefinition");
  }
}
