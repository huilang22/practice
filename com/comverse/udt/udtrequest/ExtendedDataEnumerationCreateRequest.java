/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataEnumerationCreateRequest.java
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
 * Class used to create a ExtendedDataEnumerationCreateRequest Udt Request
 *
 */

public class ExtendedDataEnumerationCreateRequest extends ExtendedDataEnumerationSubRequestParent {
/**
 *
 * Constructor to create a  ExtendedDataEnumerationCreateRequest
 * @param id Unique request name
 * @param EDCreateIn EDObjectData for ExtendedDataEnumerationCreateRequest
 *
 */
@JsonCreator
  public ExtendedDataEnumerationCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExtendedDataEnumeration")EDObjectData EDCreateIn) {
    super(id, "ExtendedDataEnumerationCreate");
    if (EDCreateIn != null) {
      addInput("ExtendedDataEnumeration", EDObjectHelper.toMap(EDCreateIn, new HashMap(), "ExtendedDataEnumeration").get("ExtendedDataEnumeration"));
    }
  }

/**
 *
 * Retrieves the EDObjectData that results from the ExtendedDataEnumerationCreateRequest call
 * @return EDObjectData resulting from udt call
 *
 */

  public EDObjectData getOutput() {
    return EDObjectHelper.fromMap(outputMap, "ExtendedDataEnumeration");
  }
}
