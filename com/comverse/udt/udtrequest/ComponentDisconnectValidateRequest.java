/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentDisconnectValidateRequest.java
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
 * Class used to create a ComponentDisconnectValidateRequest Udt Request
 *
 */

public class ComponentDisconnectValidateRequest extends ComponentRequest {
/**
 *
 * Constructor to create a  ComponentDisconnectValidateRequest
 * @param id Unique request name
 * @param ComponentDisconnectValidateIn ComponentObjectData for ComponentDisconnectValidateRequest
 * @param EffectiveDt Date for ComponentDisconnectValidateRequest
 *
 */
@JsonCreator
  public ComponentDisconnectValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Component")ComponentObjectData ComponentDisconnectValidateIn, @JsonProperty("EffectiveDt")Date EffectiveDt) {
    super(id, "ComponentDisconnectValidate");
    if (ComponentDisconnectValidateIn != null) {
      addInput("Component", ComponentObjectHelper.toMap(ComponentDisconnectValidateIn, new HashMap(), "Void").get("Void"));
    }
    if (EffectiveDt != null) {
      addInput("EffectiveDt", EffectiveDt);
    }
  }

}
