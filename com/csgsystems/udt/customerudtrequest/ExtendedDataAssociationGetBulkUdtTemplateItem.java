/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataAssociationGetBulkUdtTemplateItem.java
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
 * Class used to create a ExtendedDataAssociationGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ExtendedDataAssociationGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExtendedDataObjectKeyData EDGetIn;
/**
 *
 * Constructor to create a  ExtendedDataAssociationGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExtendedDataAssociationGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ExtendedDataObjectKeyData EDGetInIn) {
    super(id, context, "ExtendedDataAssociationGet");
    EDGetIn = EDGetInIn;
  }

  public void translateToMap() {
    if (EDGetIn != null) {
      EDGetIn.resetFlags(true, true);
      addInput("ExtendedDataAssociation", ExtendedDataObjectKeyHelper.toMap(EDGetIn, new HashMap(), "ExtendedDataObjectKeyData").get("ExtendedDataObjectKeyData"));
    }
  }


/**
 *
 * Sets the ExtendedDataAssociation
 * @param EDGetInIn Value of the EDGetIn
 *
 */

  public void setExtendedDataAssociation(ExtendedDataObjectKeyData EDGetInIn) {
    EDGetIn = EDGetInIn;
  }

  public void translateFromMap() {
    EDGetIn = ExtendedDataObjectKeyHelper.fromMap(inputMap, "ExtendedDataAssociation");
  }

/**
 *
 * Gets the ExtendedDataAssociation
 * @return Value of the ExtendedDataAssociation
 *
 */

  public ExtendedDataObjectKeyData getExtendedDataAssociation( ) {
    return EDGetIn;
  }

}
