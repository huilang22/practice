/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataAssociationCreateRequest.java
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
 * Class used to create a ExtendedDataAssociationCreateRequest Udt Request
 *
 */

public class ExtendedDataAssociationCreateRequest extends ExtendedDataAssociationSubRequestParent {
/**
 *
 * Constructor to create a  ExtendedDataAssociationCreateRequest
 * @param id Unique request name
 * @param EDCreateIn ExtendedDataObjectData for ExtendedDataAssociationCreateRequest
 *
 */
@JsonCreator
  public ExtendedDataAssociationCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExtendedDataAssociation")ExtendedDataObjectData EDCreateIn) {
    super(id, "ExtendedDataAssociationCreate");
    if (EDCreateIn != null) {
      addInput("ExtendedDataAssociation", ExtendedDataObjectHelper.toMap(EDCreateIn, new HashMap(), "ExtendedDataAssociation").get("ExtendedDataAssociation"));
    }
  }

/**
 *
 * Retrieves the ExtendedDataObjectData that results from the ExtendedDataAssociationCreateRequest call
 * @return ExtendedDataObjectData resulting from udt call
 *
 */

  public ExtendedDataObjectData getOutput() {
    return ExtendedDataObjectHelper.fromMap(outputMap, "ExtendedDataAssociation");
  }
}
