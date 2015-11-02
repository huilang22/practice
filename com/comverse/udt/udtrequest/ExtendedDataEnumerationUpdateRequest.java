/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataEnumerationUpdateRequest.java
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
 * Class used to create a ExtendedDataEnumerationUpdateRequest Udt Request
 *
 */

public class ExtendedDataEnumerationUpdateRequest extends ExtendedDataEnumerationSubRequestParent {
/**
 *
 * Constructor to create a  ExtendedDataEnumerationUpdateRequest
 * @param id Unique request name
 * @param EDUpdateIn EDObjectData for ExtendedDataEnumerationUpdateRequest
 *
 */
@JsonCreator
  public ExtendedDataEnumerationUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExtendedDataEnumeration")EDObjectData EDUpdateIn) {
    super(id, "ExtendedDataEnumerationUpdate");
    if (EDUpdateIn != null) {
      addInput("ExtendedDataEnumeration", EDObjectHelper.toMap(EDUpdateIn, new HashMap(), "ExtendedDataEnumeration").get("ExtendedDataEnumeration"));
    }
  }

/**
 *
 * Retrieves the EDObjectData that results from the ExtendedDataEnumerationUpdateRequest call
 * @return EDObjectData resulting from udt call
 *
 */

  public EDObjectData getOutput() {
    return EDObjectHelper.fromMap(outputMap, "ExtendedDataEnumeration");
  }
}
