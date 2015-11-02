/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentRemoveRequest.java
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
 * Class used to create a ComponentRemoveRequest Udt Request
 *
 */

public class ComponentRemoveRequest extends ComponentRequest {
/**
 *
 * Constructor to create a  ComponentRemoveRequest
 * @param id Unique request name
 * @param ComponentRemoveIn ComponentObjectBaseKeyData for ComponentRemoveRequest
 *
 */
@JsonCreator
  public ComponentRemoveRequest(@JsonProperty("RequestId") String id, @JsonProperty("Component")ComponentObjectBaseKeyData ComponentRemoveIn) {
    super(id, "ComponentRemove");
    if (ComponentRemoveIn != null) {
      addInput("Component", ComponentObjectBaseKeyHelper.toMap(ComponentRemoveIn, new HashMap(), "ComponentObjectBaseKeyData").get("ComponentObjectBaseKeyData"));
    }
  }

}
