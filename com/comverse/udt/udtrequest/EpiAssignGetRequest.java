/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiAssignGetRequest.java
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
 * Class used to create a EpiAssignGetRequest Udt Request
 *
 */

public class EpiAssignGetRequest extends EpiAssignSubRequestParent {
/**
 *
 * Constructor to create a  EpiAssignGetRequest
 * @param id Unique request name
 * @param EASSGetIn EpiAssignObjectKeyData for EpiAssignGetRequest
 *
 */
@JsonCreator
  public EpiAssignGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("EpiAssign")EpiAssignObjectKeyData EASSGetIn) {
    super(id, "EpiAssignGet");
    if (EASSGetIn != null) {
      addInput("EpiAssign", EpiAssignObjectKeyHelper.toMap(EASSGetIn, new HashMap(), "EpiAssignObjectKeyData").get("EpiAssignObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EpiAssignObjectData that results from the EpiAssignGetRequest call
 * @return EpiAssignObjectData resulting from udt call
 *
 */

  public EpiAssignObjectData getOutput() {
    return EpiAssignObjectHelper.fromMap(outputMap, "EpiAssign");
  }
}
