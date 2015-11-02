/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataAssociationGetRequest.java
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
 * Class used to create a ExtendedDataAssociationGetRequest Udt Request
 *
 */

public class ExtendedDataAssociationGetRequest extends ExtendedDataAssociationSubRequestParent {
/**
 *
 * Constructor to create a  ExtendedDataAssociationGetRequest
 * @param id Unique request name
 * @param EDGetIn ExtendedDataObjectKeyData for ExtendedDataAssociationGetRequest
 *
 */
@JsonCreator
  public ExtendedDataAssociationGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExtendedDataAssociation")ExtendedDataObjectKeyData EDGetIn) {
    super(id, "ExtendedDataAssociationGet");
    if (EDGetIn != null) {
      addInput("ExtendedDataAssociation", ExtendedDataObjectKeyHelper.toMap(EDGetIn, new HashMap(), "ExtendedDataObjectKeyData").get("ExtendedDataObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ExtendedDataObjectData that results from the ExtendedDataAssociationGetRequest call
 * @return ExtendedDataObjectData resulting from udt call
 *
 */

  public ExtendedDataObjectData getOutput() {
    return ExtendedDataObjectHelper.fromMap(outputMap, "ExtendedDataAssociation");
  }
}
