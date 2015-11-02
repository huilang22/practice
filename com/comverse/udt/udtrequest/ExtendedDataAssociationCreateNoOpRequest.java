/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataAssociationCreateNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a ExtendedDataAssociationCreateNoOpRequest Udt Request/Response
 *
 */
public class ExtendedDataAssociationCreateNoOpRequest extends ExtendedDataAssociationSubRequestParent {
/**
 *
 * Constructor to create a   ExtendedDataAssociationCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExtendedDataAssociationCreateNoOpRequest(String id, ExtendedDataObjectData noOpIn) {
    super(id, "ExtendedDataAssociationCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ExtendedDataAssociation", ExtendedDataObjectHelper.toMap(noOpIn, new HashMap(), "ExtendedDataAssociation").get("ExtendedDataAssociation"));
    }
  }
/**
 *
 * Retrieves the ExtendedDataObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ExtendedDataObjectData getOutput() {
    return ExtendedDataObjectHelper.fromMap(outputMap, "ExtendedDataAssociation");
  }
}
