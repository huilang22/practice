/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentGetRequest.java
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
 * Class used to create a ComponentGetRequest Udt Request
 *
 */

public class ComponentGetRequest extends ComponentSubRequestParent {
/**
 *
 * Constructor to create a  ComponentGetRequest
 * @param id Unique request name
 * @param CompGetIn ComponentObjectBaseKeyData for ComponentGetRequest
 *
 */
@JsonCreator
  public ComponentGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Component")ComponentObjectBaseKeyData CompGetIn) {
    super(id, "ComponentGet");
    if (CompGetIn != null) {
      addInput("Component", ComponentObjectBaseKeyHelper.toMap(CompGetIn, new HashMap(), "ComponentObjectBaseKeyData").get("ComponentObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the ComponentObjectBaseData that results from the ComponentGetRequest call
 * @return ComponentObjectBaseData resulting from udt call
 *
 */

  public ComponentObjectBaseData getOutput() {
    return ComponentObjectBaseHelper.fromMap(outputMap, "Component");
  }
}
