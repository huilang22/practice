/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxAssignmentGetRequest.java
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
 * Class used to create a TaxAssignmentGetRequest Udt Request
 *
 */

public class TaxAssignmentGetRequest extends TaxAssignmentSubRequestParent {
/**
 *
 * Constructor to create a  TaxAssignmentGetRequest
 * @param id Unique request name
 * @param TAgetIn TaxAssignmentObjectKeyData for TaxAssignmentGetRequest
 *
 */
@JsonCreator
  public TaxAssignmentGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("TaxAssignment")TaxAssignmentObjectKeyData TAgetIn) {
    super(id, "TaxAssignmentGet");
    if (TAgetIn != null) {
      addInput("TaxAssignment", TaxAssignmentObjectKeyHelper.toMap(TAgetIn, new HashMap(), "TaxAssignmentObjectKeyData").get("TaxAssignmentObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the TaxAssignmentObjectData that results from the TaxAssignmentGetRequest call
 * @return TaxAssignmentObjectData resulting from udt call
 *
 */

  public TaxAssignmentObjectData getOutput() {
    return TaxAssignmentObjectHelper.fromMap(outputMap, "TaxAssignment");
  }
}
