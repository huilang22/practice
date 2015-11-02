/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataEnumerationDeleteRequest.java
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
 * Class used to create a ExtendedDataEnumerationDeleteRequest Udt Request
 *
 */

public class ExtendedDataEnumerationDeleteRequest extends ExtendedDataEnumerationRequest {
/**
 *
 * Constructor to create a  ExtendedDataEnumerationDeleteRequest
 * @param id Unique request name
 * @param EDDeleteIn EDObjectKeyData for ExtendedDataEnumerationDeleteRequest
 *
 */
@JsonCreator
  public ExtendedDataEnumerationDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExtendedDataEnumeration")EDObjectKeyData EDDeleteIn) {
    super(id, "ExtendedDataEnumerationDelete");
    if (EDDeleteIn != null) {
      addInput("ExtendedDataEnumeration", EDObjectKeyHelper.toMap(EDDeleteIn, new HashMap(), "EDObjectKeyData").get("EDObjectKeyData"));
    }
  }

}
