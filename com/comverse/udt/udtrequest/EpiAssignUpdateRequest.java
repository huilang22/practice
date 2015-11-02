/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiAssignUpdateRequest.java
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
 * Class used to create a EpiAssignUpdateRequest Udt Request
 *
 */

public class EpiAssignUpdateRequest extends EpiAssignSubRequestParent {
/**
 *
 * Constructor to create a  EpiAssignUpdateRequest
 * @param id Unique request name
 * @param EASSUpdateIn EpiAssignObjectData for EpiAssignUpdateRequest
 *
 */
@JsonCreator
  public EpiAssignUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("EpiAssign")EpiAssignObjectData EASSUpdateIn) {
    super(id, "EpiAssignUpdate");
    if (EASSUpdateIn != null) {
      addInput("EpiAssign", EpiAssignObjectHelper.toMap(EASSUpdateIn, new HashMap(), "EpiAssign").get("EpiAssign"));
    }
  }

/**
 *
 * Retrieves the EpiAssignObjectData that results from the EpiAssignUpdateRequest call
 * @return EpiAssignObjectData resulting from udt call
 *
 */

  public EpiAssignObjectData getOutput() {
    return EpiAssignObjectHelper.fromMap(outputMap, "EpiAssign");
  }
}
