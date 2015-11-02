/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataAssociationCreateBulkUdtTemplateItem.java
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
 * Class used to create a ExtendedDataAssociationCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ExtendedDataAssociationCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExtendedDataObjectData EDCreateIn;
/**
 *
 * Constructor to create a  ExtendedDataAssociationCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExtendedDataAssociationCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ExtendedDataObjectData EDCreateInIn) {
    super(id, context, "ExtendedDataAssociationCreate");
    EDCreateIn = EDCreateInIn;
  }

  public void translateToMap() {
    if (EDCreateIn != null) {
      EDCreateIn.resetFlags(true, true);
      addInput("ExtendedDataAssociation", ExtendedDataObjectHelper.toMap(EDCreateIn, new HashMap(), "ExtendedDataAssociation").get("ExtendedDataAssociation"));
    }
  }


/**
 *
 * Sets the ExtendedDataAssociation
 * @param EDCreateInIn Value of the EDCreateIn
 *
 */

  public void setExtendedDataAssociation(ExtendedDataObjectData EDCreateInIn) {
    EDCreateIn = EDCreateInIn;
  }

  public void translateFromMap() {
    EDCreateIn = ExtendedDataObjectHelper.fromMap(inputMap, "ExtendedDataAssociation");
  }

/**
 *
 * Gets the ExtendedDataAssociation
 * @return Value of the ExtendedDataAssociation
 *
 */

  public ExtendedDataObjectData getExtendedDataAssociation( ) {
    return EDCreateIn;
  }

}
