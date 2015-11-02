/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentDefinitionGetRequest.java
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
 * Class used to create a ComponentDefinitionGetRequest Udt Request
 *
 */

public class ComponentDefinitionGetRequest extends ComponentDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  ComponentDefinitionGetRequest
 * @param id Unique request name
 * @param CDGetIn CDObjectKeyData for ComponentDefinitionGetRequest
 *
 */
@JsonCreator
  public ComponentDefinitionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ComponentDefinition")CDObjectKeyData CDGetIn) {
    super(id, "ComponentDefinitionGet");
    if (CDGetIn != null) {
      addInput("ComponentDefinition", CDObjectKeyHelper.toMap(CDGetIn, new HashMap(), "CDObjectKeyData").get("CDObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CDObjectData that results from the ComponentDefinitionGetRequest call
 * @return CDObjectData resulting from udt call
 *
 */

  public CDObjectData getOutput() {
    return CDObjectHelper.fromMap(outputMap, "ComponentDefinition");
  }
}
