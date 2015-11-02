/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountDefinitionGetRequest.java
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
 * Class used to create a DiscountDefinitionGetRequest Udt Request
 *
 */

public class DiscountDefinitionGetRequest extends DiscountDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  DiscountDefinitionGetRequest
 * @param id Unique request name
 * @param DDGetIn DiscountDefinitionObjectKeyData for DiscountDefinitionGetRequest
 *
 */
@JsonCreator
  public DiscountDefinitionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountDefinition")DiscountDefinitionObjectKeyData DDGetIn) {
    super(id, "DiscountDefinitionGet");
    if (DDGetIn != null) {
      addInput("DiscountDefinition", DiscountDefinitionObjectKeyHelper.toMap(DDGetIn, new HashMap(), "DiscountDefinitionObjectKeyData").get("DiscountDefinitionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DiscountDefinitionObjectData that results from the DiscountDefinitionGetRequest call
 * @return DiscountDefinitionObjectData resulting from udt call
 *
 */

  public DiscountDefinitionObjectData getOutput() {
    return DiscountDefinitionObjectHelper.fromMap(outputMap, "DiscountDefinition");
  }
}
