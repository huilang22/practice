/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataAssociationFindRequest.java
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
 * Class used to create a ExtendedDataAssociationFindRequest Udt Request
 *
 */

public class ExtendedDataAssociationFindRequest extends ExtendedDataAssociationRequest {
/**
 *
 * Constructor to create a  ExtendedDataAssociationFindRequest
 * @param id Unique request name
 * @param EDFindIn ExtendedDataObjectFilter for ExtendedDataAssociationFindRequest
 *
 */
@JsonCreator
  public ExtendedDataAssociationFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExtendedDataAssociation")ExtendedDataObjectFilter EDFindIn) {
    super(id, "ExtendedDataAssociationFind");
    if (EDFindIn != null) {
      Integer index =  EDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExtendedDataAssociation", ExtendedDataObjectHelper.toMap(EDFindIn, new HashMap(), "ExtendedDataAssociation").get("ExtendedDataAssociation"));
    }
  }

/**
 *
 * Retrieves the ExtendedDataObjectDataList that results from the ExtendedDataAssociationFindRequest call
 * @return ExtendedDataObjectDataList resulting from udt call
 *
 */

  public ExtendedDataObjectDataList getOutput() {
    return ExtendedDataObjectHelper.fromMapList(outputMap, "ExtendedDataAssociationList");
  }
}
