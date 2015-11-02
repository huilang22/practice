/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataAssociationGetNoOpBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ExtendedDataAssociationGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExtendedDataAssociationGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ExtendedDataObjectData noOpIn;

/**
 *
 * Constructor to create a   ExtendedDataAssociationGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExtendedDataAssociationGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ExtendedDataObjectData noOpInIn) {
    super(id, context, "ExtendedDataAssociationGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ExtendedDataAssociation", ExtendedDataObjectHelper.toMap(noOpIn, new HashMap(), "ExtendedDataAssociation").get("ExtendedDataAssociation"));
    }
  }
/**
 *
 * Sets the  ExtendedDataAssociation
 * @param noOpInIn ExtendedDataObjectData to set
 *
 */
  public void setExtendedDataAssociation(ExtendedDataObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExtendedDataAssociation passed into the constructor
 * @return Simulated response
 *
 */
  public ExtendedDataObjectData getExtendedDataAssociation() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ExtendedDataObjectHelper.fromMap(inputMap, "ExtendedDataAssociation");
  }
}
