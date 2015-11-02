/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiAssignCreateRequest.java
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
 * Class used to create a EpiAssignCreateRequest Udt Request
 *
 */

public class EpiAssignCreateRequest extends EpiAssignSubRequestParent {
/**
 *
 * Constructor to create a  EpiAssignCreateRequest
 * @param id Unique request name
 * @param EASSCreateIn EpiAssignObjectData for EpiAssignCreateRequest
 *
 */
@JsonCreator
  public EpiAssignCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("EpiAssign")EpiAssignObjectData EASSCreateIn) {
    super(id, "EpiAssignCreate");
    if (EASSCreateIn != null) {
      addInput("EpiAssign", EpiAssignObjectHelper.toMap(EASSCreateIn, new HashMap(), "EpiAssign").get("EpiAssign"));
    }
  }

/**
 *
 * Retrieves the EpiAssignObjectData that results from the EpiAssignCreateRequest call
 * @return EpiAssignObjectData resulting from udt call
 *
 */

  public EpiAssignObjectData getOutput() {
    return EpiAssignObjectHelper.fromMap(outputMap, "EpiAssign");
  }
}
