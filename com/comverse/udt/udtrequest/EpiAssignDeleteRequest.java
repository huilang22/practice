/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiAssignDeleteRequest.java
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
 * Class used to create a EpiAssignDeleteRequest Udt Request
 *
 */

public class EpiAssignDeleteRequest extends EpiAssignSubRequestParent {
/**
 *
 * Constructor to create a  EpiAssignDeleteRequest
 * @param id Unique request name
 * @param EASSDeleteIn EpiAssignObjectKeyData for EpiAssignDeleteRequest
 *
 */
@JsonCreator
  public EpiAssignDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("EpiAssign")EpiAssignObjectKeyData EASSDeleteIn) {
    super(id, "EpiAssignDelete");
    if (EASSDeleteIn != null) {
      addInput("EpiAssign", EpiAssignObjectKeyHelper.toMap(EASSDeleteIn, new HashMap(), "EpiAssignObjectKeyData").get("EpiAssignObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EpiAssignObjectData that results from the EpiAssignDeleteRequest call
 * @return EpiAssignObjectData resulting from udt call
 *
 */

  public EpiAssignObjectData getOutput() {
    return EpiAssignObjectHelper.fromMap(outputMap, "EpiAssign");
  }
}
