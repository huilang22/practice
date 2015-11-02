/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentDefinitionDeleteRequest.java
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
 * Class used to create a ComponentDefinitionDeleteRequest Udt Request
 *
 */

public class ComponentDefinitionDeleteRequest extends ComponentDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  ComponentDefinitionDeleteRequest
 * @param id Unique request name
 * @param CDDeleteIn CDObjectKeyData for ComponentDefinitionDeleteRequest
 *
 */
@JsonCreator
  public ComponentDefinitionDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ComponentDefinition")CDObjectKeyData CDDeleteIn) {
    super(id, "ComponentDefinitionDelete");
    if (CDDeleteIn != null) {
      addInput("ComponentDefinition", CDObjectKeyHelper.toMap(CDDeleteIn, new HashMap(), "CDObjectKeyData").get("CDObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CDObjectData that results from the ComponentDefinitionDeleteRequest call
 * @return CDObjectData resulting from udt call
 *
 */

  public CDObjectData getOutput() {
    return CDObjectHelper.fromMap(outputMap, "ComponentDefinition");
  }
}
