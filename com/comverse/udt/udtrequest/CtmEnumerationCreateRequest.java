/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmEnumerationCreateRequest.java
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
 * Class used to create a CtmEnumerationCreateRequest Udt Request
 *
 */

public class CtmEnumerationCreateRequest extends CtmEnumerationSubRequestParent {
/**
 *
 * Constructor to create a  CtmEnumerationCreateRequest
 * @param id Unique request name
 * @param CtmEnumerationCreateIn CtmEnumerationObjectData for CtmEnumerationCreateRequest
 *
 */
@JsonCreator
  public CtmEnumerationCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmEnumeration")CtmEnumerationObjectData CtmEnumerationCreateIn) {
    super(id, "CtmEnumerationCreate");
    if (CtmEnumerationCreateIn != null) {
      addInput("CtmEnumeration", CtmEnumerationObjectHelper.toMap(CtmEnumerationCreateIn, new HashMap(), "CtmEnumeration").get("CtmEnumeration"));
    }
  }

/**
 *
 * Retrieves the CtmEnumerationObjectData that results from the CtmEnumerationCreateRequest call
 * @return CtmEnumerationObjectData resulting from udt call
 *
 */

  public CtmEnumerationObjectData getOutput() {
    return CtmEnumerationObjectHelper.fromMap(outputMap, "CtmEnumeration");
  }
}
