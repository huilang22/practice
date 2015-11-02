/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataAssociationCreateNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a ExtendedDataAssociationCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExtendedDataAssociationCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ExtendedDataObjectData noOpIn;

/**
 *
 * Constructor to create a   ExtendedDataAssociationCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExtendedDataAssociationCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ExtendedDataObjectData noOpInIn) {
    super(id, context, "ExtendedDataAssociationCreate");
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
