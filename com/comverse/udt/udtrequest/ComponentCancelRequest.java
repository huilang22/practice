/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentCancelRequest.java
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
 * Class used to create a ComponentCancelRequest Udt Request
 *
 */

public class ComponentCancelRequest extends ComponentRequest {
/**
 *
 * Constructor to create a  ComponentCancelRequest
 * @param id Unique request name
 * @param cancelIn ComponentObjectBaseKeyData for ComponentCancelRequest
 * @param CCCeaseDate Date for ComponentCancelRequest
 *
 */
@JsonCreator
  public ComponentCancelRequest(@JsonProperty("RequestId") String id, @JsonProperty("Component")ComponentObjectBaseKeyData cancelIn, @JsonProperty("CancelDate")Date CCCeaseDate) {
    super(id, "ComponentCancel");
    if (cancelIn != null) {
      addInput("Component", ComponentObjectBaseKeyHelper.toMap(cancelIn, new HashMap(), "ComponentObjectBaseKeyData").get("ComponentObjectBaseKeyData"));
    }
    if (CCCeaseDate != null) {
      addInput("CancelDate", CCCeaseDate);
    }
  }

}
