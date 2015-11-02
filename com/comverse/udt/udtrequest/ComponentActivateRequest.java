/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentActivateRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ComponentActivateRequest Udt Request
 *
 */

public class ComponentActivateRequest extends ComponentSubRequestParent {
/**
 *
 * Constructor to create a  ComponentActivateRequest
 * @param id Unique request name
 * @param ComponentActivateIn ComponentObjectBaseKeyData for ComponentActivateRequest
 *
 */
@JsonCreator
  public ComponentActivateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Component")ComponentObjectBaseKeyData ComponentActivateIn) {
    super(id, "ComponentActivate");
    if (ComponentActivateIn != null) {
      addInput("Component", ComponentObjectBaseKeyHelper.toMap(ComponentActivateIn, new HashMap(), "ComponentObjectBaseKeyData").get("ComponentObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the ComponentObjectBaseData that results from the ComponentActivateRequest call
 * @return ComponentObjectBaseData resulting from udt call
 *
 */

  public ComponentObjectBaseData getOutput() {
    return ComponentObjectBaseHelper.fromMap(outputMap, "Component");
  }
}
