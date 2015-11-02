/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataAssociationDeleteRequest.java
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
 * Class used to create a ExtendedDataAssociationDeleteRequest Udt Request
 *
 */

public class ExtendedDataAssociationDeleteRequest extends ExtendedDataAssociationSubRequestParent {
/**
 *
 * Constructor to create a  ExtendedDataAssociationDeleteRequest
 * @param id Unique request name
 * @param EDDeleteIn ExtendedDataObjectKeyData for ExtendedDataAssociationDeleteRequest
 *
 */
@JsonCreator
  public ExtendedDataAssociationDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExtendedDataAssociation")ExtendedDataObjectKeyData EDDeleteIn) {
    super(id, "ExtendedDataAssociationDelete");
    if (EDDeleteIn != null) {
      addInput("ExtendedDataAssociation", ExtendedDataObjectKeyHelper.toMap(EDDeleteIn, new HashMap(), "ExtendedDataObjectKeyData").get("ExtendedDataObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ExtendedDataObjectData that results from the ExtendedDataAssociationDeleteRequest call
 * @return ExtendedDataObjectData resulting from udt call
 *
 */

  public ExtendedDataObjectData getOutput() {
    return ExtendedDataObjectHelper.fromMap(outputMap, "ExtendedDataAssociation");
  }
}
