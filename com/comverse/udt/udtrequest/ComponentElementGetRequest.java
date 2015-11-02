/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentElementGetRequest.java
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
 * Class used to create a ComponentElementGetRequest Udt Request
 *
 */

public class ComponentElementGetRequest extends ComponentElementSubRequestParent {
/**
 *
 * Constructor to create a  ComponentElementGetRequest
 * @param id Unique request name
 * @param getIn ComponentElementObjectKeyData for ComponentElementGetRequest
 *
 */
@JsonCreator
  public ComponentElementGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ComponentElement")ComponentElementObjectKeyData getIn) {
    super(id, "ComponentElementGet");
    if (getIn != null) {
      addInput("ComponentElement", ComponentElementObjectKeyHelper.toMap(getIn, new HashMap(), "ComponentElementObjectKeyData").get("ComponentElementObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ComponentElementObjectData that results from the ComponentElementGetRequest call
 * @return ComponentElementObjectData resulting from udt call
 *
 */

  public ComponentElementObjectData getOutput() {
    return ComponentElementObjectHelper.fromMap(outputMap, "ComponentElement");
  }
}
