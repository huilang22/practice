/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmEnumerationUpdateRequest.java
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
 * Class used to create a CtmEnumerationUpdateRequest Udt Request
 *
 */

public class CtmEnumerationUpdateRequest extends CtmEnumerationSubRequestParent {
/**
 *
 * Constructor to create a  CtmEnumerationUpdateRequest
 * @param id Unique request name
 * @param CtmEnumerationUpdateIn CtmEnumerationObjectData for CtmEnumerationUpdateRequest
 *
 */
@JsonCreator
  public CtmEnumerationUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmEnumeration")CtmEnumerationObjectData CtmEnumerationUpdateIn) {
    super(id, "CtmEnumerationUpdate");
    if (CtmEnumerationUpdateIn != null) {
      addInput("CtmEnumeration", CtmEnumerationObjectHelper.toMap(CtmEnumerationUpdateIn, new HashMap(), "CtmEnumeration").get("CtmEnumeration"));
    }
  }

/**
 *
 * Retrieves the CtmEnumerationObjectData that results from the CtmEnumerationUpdateRequest call
 * @return CtmEnumerationObjectData resulting from udt call
 *
 */

  public CtmEnumerationObjectData getOutput() {
    return CtmEnumerationObjectHelper.fromMap(outputMap, "CtmEnumeration");
  }
}
