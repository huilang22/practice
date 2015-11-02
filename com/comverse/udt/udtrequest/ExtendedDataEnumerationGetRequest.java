/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataEnumerationGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ExtendedDataEnumerationGetRequest Udt Request
 *
 */

public class ExtendedDataEnumerationGetRequest extends ExtendedDataEnumerationSubRequestParent {
/**
 *
 * Constructor to create a  ExtendedDataEnumerationGetRequest
 * @param id Unique request name
 * @param EDGetIn EDObjectKeyData for ExtendedDataEnumerationGetRequest
 *
 */
@JsonCreator
  public ExtendedDataEnumerationGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExtendedDataEnumeration")EDObjectKeyData EDGetIn) {
    super(id, "ExtendedDataEnumerationGet");
    if (EDGetIn != null) {
      addInput("ExtendedDataEnumeration", EDObjectKeyHelper.toMap(EDGetIn, new HashMap(), "EDObjectKeyData").get("EDObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EDObjectData that results from the ExtendedDataEnumerationGetRequest call
 * @return EDObjectData resulting from udt call
 *
 */

  public EDObjectData getOutput() {
    return EDObjectHelper.fromMap(outputMap, "ExtendedDataEnumeration");
  }
}
