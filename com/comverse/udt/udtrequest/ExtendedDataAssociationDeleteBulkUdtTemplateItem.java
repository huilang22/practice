/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataAssociationDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ExtendedDataAssociationDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ExtendedDataAssociationDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExtendedDataObjectKeyData EDDeleteIn;
/**
 *
 * Constructor to create a  ExtendedDataAssociationDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExtendedDataAssociationDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ExtendedDataObjectKeyData EDDeleteInIn) {
    super(id, context, "ExtendedDataAssociationDelete");
    EDDeleteIn = EDDeleteInIn;
  }

  public void translateToMap() {
    if (EDDeleteIn != null) {
      EDDeleteIn.resetFlags(true, true);
      addInput("ExtendedDataAssociation", ExtendedDataObjectKeyHelper.toMap(EDDeleteIn, new HashMap(), "ExtendedDataObjectKeyData").get("ExtendedDataObjectKeyData"));
    }
  }


/**
 *
 * Sets the ExtendedDataAssociation
 * @param EDDeleteInIn Value of the EDDeleteIn
 *
 */

  public void setExtendedDataAssociation(ExtendedDataObjectKeyData EDDeleteInIn) {
    EDDeleteIn = EDDeleteInIn;
  }

  public void translateFromMap() {
    EDDeleteIn = ExtendedDataObjectKeyHelper.fromMap(inputMap, "ExtendedDataAssociation");
  }

/**
 *
 * Gets the ExtendedDataAssociation
 * @return Value of the ExtendedDataAssociation
 *
 */

  public ExtendedDataObjectKeyData getExtendedDataAssociation( ) {
    return EDDeleteIn;
  }

}
