/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmEnumerationGetRequest.java
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
 * Class used to create a CtmEnumerationGetRequest Udt Request
 *
 */

public class CtmEnumerationGetRequest extends CtmEnumerationSubRequestParent {
/**
 *
 * Constructor to create a  CtmEnumerationGetRequest
 * @param id Unique request name
 * @param CtmEnumerationGetIn CtmEnumerationObjectKeyData for CtmEnumerationGetRequest
 *
 */
@JsonCreator
  public CtmEnumerationGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmEnumeration")CtmEnumerationObjectKeyData CtmEnumerationGetIn) {
    super(id, "CtmEnumerationGet");
    if (CtmEnumerationGetIn != null) {
      addInput("CtmEnumeration", CtmEnumerationObjectKeyHelper.toMap(CtmEnumerationGetIn, new HashMap(), "CtmEnumerationObjectKeyData").get("CtmEnumerationObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtmEnumerationObjectData that results from the CtmEnumerationGetRequest call
 * @return CtmEnumerationObjectData resulting from udt call
 *
 */

  public CtmEnumerationObjectData getOutput() {
    return CtmEnumerationObjectHelper.fromMap(outputMap, "CtmEnumeration");
  }
}
