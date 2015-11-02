/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentElementDeleteRequest.java
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
 * Class used to create a ComponentElementDeleteRequest Udt Request
 *
 */

public class ComponentElementDeleteRequest extends ComponentElementSubRequestParent {
/**
 *
 * Constructor to create a  ComponentElementDeleteRequest
 * @param id Unique request name
 * @param ComponentElementDeleteIn ComponentElementObjectKeyData for ComponentElementDeleteRequest
 * @param CEDCeaseDate Date for ComponentElementDeleteRequest
 *
 */
@JsonCreator
  public ComponentElementDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ComponentElement")ComponentElementObjectKeyData ComponentElementDeleteIn, @JsonProperty("InactiveDate")Date CEDCeaseDate) {
    super(id, "ComponentElementDelete");
    if (ComponentElementDeleteIn != null) {
      addInput("ComponentElement", ComponentElementObjectKeyHelper.toMap(ComponentElementDeleteIn, new HashMap(), "ComponentElementObjectKeyData").get("ComponentElementObjectKeyData"));
    }
    if (CEDCeaseDate != null) {
      addInput("InactiveDate", CEDCeaseDate);
    }
  }

/**
 *
 * Retrieves the ComponentElementObjectData that results from the ComponentElementDeleteRequest call
 * @return ComponentElementObjectData resulting from udt call
 *
 */

  public ComponentElementObjectData getOutput() {
    return ComponentElementObjectHelper.fromMap(outputMap, "ComponentElement");
  }
}
