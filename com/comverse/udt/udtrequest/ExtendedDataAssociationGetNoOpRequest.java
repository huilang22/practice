/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataAssociationGetNoOpRequest.java
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
 * NoOp class used to simulate a ExtendedDataAssociationGetNoOpRequest Udt Request/Response
 *
 */
public class ExtendedDataAssociationGetNoOpRequest extends ExtendedDataAssociationSubRequestParent {
/**
 *
 * Constructor to create a   ExtendedDataAssociationGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExtendedDataAssociationGetNoOpRequest(String id, ExtendedDataObjectData noOpIn) {
    super(id, "ExtendedDataAssociationGetNoOpRequest");
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
