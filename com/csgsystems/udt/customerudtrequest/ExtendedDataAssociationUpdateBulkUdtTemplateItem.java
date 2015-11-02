/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataAssociationUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ExtendedDataAssociationUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ExtendedDataAssociationUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExtendedDataObjectData EDUpdateIn;
/**
 *
 * Constructor to create a  ExtendedDataAssociationUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExtendedDataAssociationUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ExtendedDataObjectData EDUpdateInIn) {
    super(id, context, "ExtendedDataAssociationUpdate");
    EDUpdateIn = EDUpdateInIn;
  }

  public void translateToMap() {
    if (EDUpdateIn != null) {
      EDUpdateIn.resetFlags(true, true);
      addInput("ExtendedDataAssociation", ExtendedDataObjectHelper.toMap(EDUpdateIn, new HashMap(), "ExtendedDataAssociation").get("ExtendedDataAssociation"));
    }
  }


/**
 *
 * Sets the ExtendedDataAssociation
 * @param EDUpdateInIn Value of the EDUpdateIn
 *
 */

  public void setExtendedDataAssociation(ExtendedDataObjectData EDUpdateInIn) {
    EDUpdateIn = EDUpdateInIn;
  }

  public void translateFromMap() {
    EDUpdateIn = ExtendedDataObjectHelper.fromMap(inputMap, "ExtendedDataAssociation");
  }

/**
 *
 * Gets the ExtendedDataAssociation
 * @return Value of the ExtendedDataAssociation
 *
 */

  public ExtendedDataObjectData getExtendedDataAssociation( ) {
    return EDUpdateIn;
  }

}
