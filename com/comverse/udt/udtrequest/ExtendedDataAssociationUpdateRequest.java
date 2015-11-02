/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataAssociationUpdateRequest.java
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
 * Class used to create a ExtendedDataAssociationUpdateRequest Udt Request
 *
 */

public class ExtendedDataAssociationUpdateRequest extends ExtendedDataAssociationSubRequestParent {
/**
 *
 * Constructor to create a  ExtendedDataAssociationUpdateRequest
 * @param id Unique request name
 * @param EDUpdateIn ExtendedDataObjectData for ExtendedDataAssociationUpdateRequest
 *
 */
@JsonCreator
  public ExtendedDataAssociationUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExtendedDataAssociation")ExtendedDataObjectData EDUpdateIn) {
    super(id, "ExtendedDataAssociationUpdate");
    if (EDUpdateIn != null) {
      addInput("ExtendedDataAssociation", ExtendedDataObjectHelper.toMap(EDUpdateIn, new HashMap(), "ExtendedDataAssociation").get("ExtendedDataAssociation"));
    }
  }

/**
 *
 * Retrieves the ExtendedDataObjectData that results from the ExtendedDataAssociationUpdateRequest call
 * @return ExtendedDataObjectData resulting from udt call
 *
 */

  public ExtendedDataObjectData getOutput() {
    return ExtendedDataObjectHelper.fromMap(outputMap, "ExtendedDataAssociation");
  }
}
