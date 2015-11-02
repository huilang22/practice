/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataAssociationFindBulkUdtTemplateItem.java
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
 * Class used to create a ExtendedDataAssociationFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ExtendedDataAssociationFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExtendedDataObjectFilter EDFindIn;
/**
 *
 * Constructor to create a  ExtendedDataAssociationFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExtendedDataAssociationFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ExtendedDataObjectFilter EDFindInIn) {
    super(id, context, "ExtendedDataAssociationFind");
    EDFindIn = EDFindInIn;
  }

  public void translateToMap() {
    if (EDFindIn != null) {
      Integer index =  EDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExtendedDataAssociation", ExtendedDataObjectHelper.toMap(EDFindIn, new HashMap(), "ExtendedDataAssociation").get("ExtendedDataAssociation"));
    }
  }


/**
 *
 * Sets the ExtendedDataAssociation
 * @param EDFindInIn Value of the EDFindIn
 *
 */

  public void setExtendedDataAssociation(ExtendedDataObjectFilter EDFindInIn) {
    EDFindIn = EDFindInIn;
  }

  public void translateFromMap() {
    EDFindIn = ExtendedDataObjectHelper.fromMapFilter(inputMap, "ExtendedDataAssociation");
  }

/**
 *
 * Gets the ExtendedDataAssociation
 * @return Value of the ExtendedDataAssociation
 *
 */

  public ExtendedDataObjectFilter getExtendedDataAssociation( ) {
    return EDFindIn;
  }

}
